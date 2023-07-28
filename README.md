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
python -m venv venv
venv\Scripts\activate
pip install django
python manage.py runserver
no luck?
Traceback (most recent call last):
File "C:\hackerman\rest-api\djangoapp\manage.py", line 11, in main
from django.core.management import execute_from_command_line
ModuleNotFoundError: No module named 'django'

Kotlin
Download gradle binary
https://gradle.org/install/
unzip in C:/
Add to path
Install kotlin compiler?

PHP
Install PHP?
unzip in C:\
Add to path
https://windows.php.net/download/
php -S localhost:8080
curl -X GET http://localhost:8080/hello
[Fri Jul 28 16:07:41 2023] PHP 8.2.8 Development Server (http://localhost:8080) started
[Fri Jul 28 16:08:17 2023] [::1]:57116 Accepted
[Fri Jul 28 16:08:17 2023] [::1]:57116 Invalid request (Malformed HTTP request)
[Fri Jul 28 16:08:17 2023] [::1]:57116 Closing
[Fri Jul 28 16:10:32 2023] [::1]:57126 Accepted
[Fri Jul 28 16:10:32 2023] [::1]:57126 [404]: GET /hello - No such file or directory
[Fri Jul 28 16:10:32 2023] [::1]:57126 Closing
