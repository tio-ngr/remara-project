import pandas as pd
import pickle

def load_file():
    with open('similarity_matrix_df.pkl', 'rb') as file:
        cosine_sim_df = pickle.load(file)
    return cosine_sim_df

def recommendation(judul, k = 10):
    similarity_data = load_file()
    data = pd.read_csv('./fix_dataset/fix_cleaned_combined_dataset.csv')
    items = data[['Title']]#, 'Ingredients'#, 'Steps', 'Loves']]

    index = similarity_data.loc[:, judul].to_numpy().argpartition(range(-1, -k, -1))
    closest = similarity_data.columns[index[-1:-(k + 2):-1]]
    closest = closest.drop(judul, errors='ignore')
    return pd.DataFrame(closest).merge(items).head(k)

judul = "Siomay Udang dan Ayam(Dimsum)" # jadi ini input dari aplikasi 

recommendation_recipes = recommendation(judul)
print(recommendation_recipes)