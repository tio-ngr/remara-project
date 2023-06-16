## Simple Flask Server for Food Classification Model
The model used in this repository is from [here](https://github.com/tio-ngr/remara-project/tree/1abf12ff6ccab3f0abd11b13bd671f35fc023c5b/cv_model)

## How to run the Flask
`Git Clone or Download File Project on this github`

### Create virtualenv using python
- `python -m venv <venv_name>`
- `<venv_name>\Scripts\activate`

### Install required libraries
`pip install -r requirements.txt`

### Run the application
You can run the app either using <br>
- `python wsgi.py` (for development) or using <br>
- `gunicorn --bind 0.0.0.0:5000 wsgi:app` (for production)<br>
and `CTRL + C` to stop it<br>

### Endpoints
You can access the app on
- **GET** `localhost:5000` (for checking)
- **POST** `localhost:5000/predict` (this is where the model is)
- or using the `index.html` file in browser and upload the image
