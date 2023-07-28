# rest-api

A comaprison of rest technologies
Spring Boot
Visual Studio Code extension Spring Initalizr: create maven project
cd spring-boot
./mvnw package
java -jar .\target\credit-api-0.0.1-SNAPSHOT.jar

Command prompt to test:
curl -X GET http://localhost:8080/hello  
Hello, world!

Node.js
cd ./node
node app.js
curl -X GET http://localhost:8080/hello  
Hello, world!

Flask
python -m venv venv
venv\Scripts\activate
pip install flask
flask run
curl -X get http://localhost:5000/hello

Django
