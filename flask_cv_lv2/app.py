import requests
from flask import Flask, render_template, request, jsonify
import numpy as np
from tensorflow.keras.models import load_model
from PIL import Image

app = Flask(__name__)

model= load_model('model_cv.h5')


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
    img = Image.open(uploaded_file).resize((200,200))
    x = np.array(img)
    x = np.expand_dims(x, axis=0)
    # image = np.vstack([x])
    classes = model.predict(x)
    prediction= np.argmax(classes)

    if classes[0] < 0.5:
        prediction = "tempe"
    elif classes[0] > 0.5:
        prediction = "telur"

    # Update accuracy variables
    total_predictions += 1
    if ((classes[0] < 0.5 and uploaded_file.filename.startswith("tempe")) or
            (classes[0] >= 0.5 and uploaded_file.filename.startswith("telur"))):
        correct_predictions += 1

    # Display prediction accuracy
    if uploaded_file.filename.startswith("tempe") or uploaded_file.filename.startswith("telur"):
        if uploaded_file.filename.startswith(prediction):
            prediction_accuracy = "Correct"
        else:
            prediction_accuracy = "Incorrect"
    else:
        prediction_accuracy = "Not Both"

    # prediction bahan
    if prediction_accuracy == "Correct":
        makanan = 'Tempe'
    elif prediction_accuracy == "Incorrect":
        makanan = 'Bukan Tempe'
    else:
        makanan = 'Bukan Tempe'

    # statusTest
    if makanan =="Tempe":
        statusTest = "LULUS"
    if makanan =="Bukan Tempe":
        statusTest = "TIDAK LULUS"

    img.close()
    response_obj = { 'prediction': makanan, 'Status': statusTest }
    return jsonify(response_obj)

@app.route('/')
def home():
    return render_template('index.html')

if __name__ == '__main__':
    app.run(debug=True)
