from flask import Flask, request, render_template, send_from_directory
import os

app = Flask(__name__)

PASSWORD = "surya"

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
    file_path = os.path.join(root_dir, 'static', filename)

    # Check if the file exists
    if not os.path.isfile(file_path):
        return "File not found", 404

    # Determine MIME type based on file extension
    mime_type = "application/octet-stream"
    if filename.endswith('.zip'):
        mime_type = "application/zip"

    return send_from_directory(os.path.join(root_dir, 'static'), filename, mimetype=mime_type)

if __name__ == "__main__":
    app.run(debug=True)
