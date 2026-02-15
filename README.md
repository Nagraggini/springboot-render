# Demo

## Dynamic Web Application Milestone

My first dynamic web application is now live! 🚀  
Deployed on February 15, 2026 at 10:56 AM.

It was running locally before, and now it's accessible online.

[Visit my site!](https://spring-render-s4f4.onrender.com/boots.html)

# I used:

## Backend (Server-side)

- Spring Boot application (DemoApplication.java)
- Controller classes, e.g., UserController (if present), handling requests like /login, /register, etc.
- Model classes, e.g., User, Product, representing the data.
- H2 database + JPA repositories for storing and querying data.
- Business logic, e.g., checking user.name values or saving users.

Frontend (User Interface)

- HTML templates (.html files in resources/templates)
- Thymeleaf attributes, e.g., th:text, th:case, for dynamically rendering data from the backend.
- CSS / Bootstrap for styling.
- JavaScript for interactivity.

# Structure

Frontend (HTML + Thymeleaf)
│
▼
Spring Controller
│
▼
Service / Business Logic
│
▼
H2 Database (data)
