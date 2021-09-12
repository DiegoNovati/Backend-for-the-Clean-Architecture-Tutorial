# Backend for the Clean Architecture Tutorial

This is the backend used by the tutorial about the Clean Architecture. It is written in Java using [Quarkus](https://quarkus.io)

## Installation
To install the backend:

1. Install Java if you don't have it
2. Download this project

## Execution
1. Open the terminal and go in the root directory of the downloaded project
2. Run the command 

```
    ./mvnw compile quarkus:dev
```

3. To test that it's working correctly, open the browser and use the url [http://localhost:8080/test](http://localhost:8080/test)
4. If you see the message 'Everything is ok' it means that the backend works

## Auth endpoint
This service exposes the POST endpoint 

```
    /auth
```

### Request
The request must be a JSON object with the following keys:

- email
- password

### Response
The response is just a status code, without any body

## Accounts
There is only one valid account:

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



