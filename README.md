# CINEMA APP
![drawing](https://images.indianexpress.com/2020/10/cinema.jpg)
---
This project is designed to imitate the work of the simple cinema service app with user authentication
---
### The diagram below represents connections, built inside this app
![pic](src/main/resources/images/Hibernate_Cinema_Uml.png)
---
## App functions
#### After signing in you are granted access to such functionality:
Admin:
- find users by email
- add/delete/update information about movies, cinema halls and movie sessions

User:
- show own shopping cart
- book or buy tickets
- show information about movies, cinema halls and available movie sessions

Unauthorized User:
- registration
---
## Project is based on 3-layered architecture:

- Data access layer (DAO)
- Application layer (service)
- Presentation layer (controllers)
---
## Technologies used

- Spring (MVC, Security, Web)
- Hibernate ORM
- Apache Tomcat - version 9.0.48
- MySQL - version 8.0.22
- Project builder: Apache Maven
---

## Overview

### Project has multiple endpoints with user and admin access

POST: /register (to create a user) - ALL <br />
POST: /cinema-halls (to create a cinema hall) - ADMIN <br />
POST: /movies (to create a movie) - ADMIN <br />
POST: /movie-sessions (to create a movie sessions) - ADMIN <br />
POST: /orders/complete (to create an order for current user) - USER <br />
PUT: /movie-sessions/{id} (to update a movie session) - ADMIN <br />
PUT: /shopping-carts/movie-sessions (to add movie session to shopping cart) - USER <br />
DELETE: /movie-sessions/{id} (to delete a movie session) - ADMIN <br />
GET: /orders (to get order history for current user) - USER <br />
GET: /shopping-carts/by-user (to get a shopping cart for current user) - USER <br />
GET: /cinema-halls (to get all cinema halls) - USER or ADMIN <br />
GET: /movies (to get all movies) - USER or ADMIN <br />
GET: /movie-sessions/available (to get all available movie by date) - USER or ADMIN <br />
GET: /users/by-email (to find user by email) - ADMIN
---
## How To Run This Project

1. Install and configure Apache Tomcat
2. Install and configure and create a schema in MySQL
3. Fork and clone this project
4. To connect to database in application you need change configuration information in the file from /resources/db.properties to the ones you specified when installing MySQL
5. Finally, you can start the application

After running the application you will be redirected to login page. You can use:
- username admin@i.ua with password admin123 to login as admin
- username user@i.ua with password user123 to login as user