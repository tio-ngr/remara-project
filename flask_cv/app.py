import requests
from flask import Flask, render_template, request, jsonify
# import matplotlib.pyplot as plt
import numpy as np
# from tensorflow.keras.preprocessing import image
from tensorflow.keras.models import load_model
from PIL import Image

app = Flask(__name__)
# app.config['JSONIFY_PRETTYPRINT_REGULAR'] = True
model= load_model('model_cv.h5')
# ITEMS = ['telur,tempe']

@app.route('/')
def hello(): 
    return "hello, this is test"
 
@app.route('/upload', methods=['POST'])
def predict():
    # Get the uploaded file
    uploaded_file = request.files['gambar']

    # # Prepare variables for accuracy calculation
    total_predictions = 0
    correct_predictions = 0

    # # Perform prediction for the uploaded file
    # img = image.load_img(uploaded_file, target_size=(200, 200))
    # x = image.img_to_array(img)
    # plt.imshow(x/255.)
    img = Image.open(uploaded_file).resize((200,200))
    x = np.array(img)
    x = np.expand_dims(x, axis=0)
    # image = np.vstack([x])
    classes = model.predict(x)
    prediction= np.argmax(classes)

    if classes[0] < 0.5:
        prediction = "telur"
    elif classes[0] > 0.5:
        prediction = "tempe"

    # Update accuracy variables
    total_predictions += 1
    if ((classes[0] < 0.5 and uploaded_file.filename.startswith("telur")) or
            (classes[0] >= 0.5 and uploaded_file.filename.startswith("tempe"))):
        correct_predictions += 1

    # Display prediction accuracy
    if uploaded_file.filename.startswith("telur") or uploaded_file.filename.startswith("tempe"):
        if uploaded_file.filename.startswith(prediction):
            prediction_accuracy = "Correct"
        else:
            prediction_accuracy = "Incorrect"
    else:
        prediction_accuracy = "Not Both"

    # Calculate accuracy
    accuracy = (correct_predictions / total_predictions) * 100
    img.close()
    response_obj = { 'prediction': prediction, 'accuracy': str(round(accuracy, 2)), 'accuracy_status': prediction_accuracy }
    return jsonify(response_obj)

    # return render_template('result.html', prediction=prediction, accuracy=round(accuracy, 2), accuracy_status=prediction_accuracy)

@app.route('/')
def home():
    return render_template('index.html')

if __name__ == '__main__':
    app.run(debug=True)


# if __name__ == '__main__':
#     app.run(debug=False, host='0.0.0.0')