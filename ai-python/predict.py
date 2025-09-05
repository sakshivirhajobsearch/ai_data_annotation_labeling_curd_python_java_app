from flask import Flask, request, jsonify
from annotate import annotate_text

app = Flask(__name__)

@app.route('/predict', methods=['POST'])
def predict_label():
    data = request.get_json()
    text = data.get('text', '')
    label = annotate_text(text)
    return jsonify({"text": text, "predicted_label": label})

if __name__ == "__main__":
    app.run(host='0.0.0.0', port=5000, debug=True)
