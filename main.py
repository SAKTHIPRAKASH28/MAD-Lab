from flask import Flask, request, render_template

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

if __name__ == "__main__":
    app.run(debug=True)
