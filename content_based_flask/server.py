import pandas as pd
import pickle
from flask import Flask, request, jsonify

app = Flask(__name__)

def load_file():
    with open('fix_similarity_matrix_df.pkl', 'rb') as file:
        cosine_sim_df = pickle.load(file)
    return cosine_sim_df

@app.route('/predict', methods=['POST'])
def predict():
    k = 3
    data = request.json
    similarity_data = load_file()
    dataset = pd.read_csv('fix_dataset.csv')
    items = dataset[['Title']]

    index = similarity_data.loc[:, data['title']].to_numpy().argpartition(range(-1, -k, -1))
    closest = similarity_data.columns[index[-1:-(k + 2):-1]]
    closest = closest.drop(data['title'], errors='ignore')
    result = pd.DataFrame(closest).merge(items).head(k)
    
    # Convert DataFrame to JSON string
    json_result = result.to_json(orient='records')
    
    return json_result

if __name__ == '__main__':
    app.run(debug=True)
