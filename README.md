# Backend for the Clean Architecture Tutorial
This is the backend used by the tutorial about the Clean Architecture. It is written in Java using [Quarkus](https://quarkus.io)

## Execution
If you want to run this microservice without installing the source code, proceed af following:

0. Prerequisite: you need to have Java installed  
1. Download the [backend-1.0.0.jar](https://github.com/DiegoNovati/Backend-for-the-Clean-Architecture-Tutorial/backend-1.0.0.jar) file
2. Open the terminal in the folder containing the downloaded .jar
3. Run the command

```
    java -jar backend-1.0.0.jar
```

4. Test the microservice using the url [http://localhost:8080/test](http://localhost:8080/test) in any browser
5If you see the message 'Everything is ok' it means that the microservice works

## Running from the source code
To run the microservice from the source code:

1. Install Java if you don't have it
2. Clone this project

## Execution
1. Open the terminal and go in the root directory of the downloaded project
2. Run the command 

```
    ./mvnw compile quarkus:dev
```

3. To test that it's working correctly, open the browser and use the url [http://localhost:8080/test](http://localhost:8080/test)
4. If you see the message 'Everything is ok' it means that the microservice works

## Auth endpoint
This microservice exposes the POST endpoint 

```
    /auth
```

### Request
The request must be a JSON object with the following keys:

- email
- password

### Response
The response is just a status code, with an empty body

## Accounts
This is the only valid account:

- email: success@mail.com
- password: 12345678

returning the status code 200

Any account with a password different from '12345678' returns the 404 status code

To returns a different status code, here are the accounts

- status code 200: email 'success@mail.com'
- status code 400: email or password undefined
- status code 401: email '401@mail.com'
- status code 403: email '403@mail.com'
- status code 404: email '404@mail.com'
- status code 500: email '500@mail.com'