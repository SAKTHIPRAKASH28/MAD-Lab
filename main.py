from flask import Flask, request, render_template, send_from_directory
import os

app = Flask(__name__)

PASSWORD = "MAD_LAB"

@app.route("/")
def index():
    return render_template("auth.html")

@app.route("/content", methods=["POST"])
def content():
    password = request.form.get("password")
    if password == PASSWORD:
        return render_template("index.html")
    else:
        return "Incorrect password. Access denied."

@app.route("/static/<path:filename>")
def serve_static(filename):
    root_dir = os.path.dirname(os.getcwd())
    return send_from_directory(os.path.join(root_dir, 'static'), filename)

if __name__ == "__main__":
    app.run(debug=True)
