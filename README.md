# Spring Boot Render Demo

```
  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
```

## Dynamic Web Application Milestone

My first dynamic web application is now live! 🚀  
Deployed on February 15, 2026 at 10:56 AM.

It was running locally before, and now it's accessible online.

[The link is no longer available.](https://spring-render-s4f4.onrender.com/add.html)

# I used:

## Backend (Server-side)

- Spring Boot application (DemoApplication.java)
- Controller classes, e.g., UsersController (if present), handling requests like /login, /register, etc.
- Model classes, e.g., User, Product, representing the data.
- PostgreSQL+ JPA repositories for storing and querying data.
- ORM: Hibernate (JPA)
- Business logic, e.g., checking user.name values or saving users.

## Frontend (User Interface)

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
Controller (Business Logic)
│  
▼  
PostgreSQL Database (data)

## Local running

### Maven

```bash
./mvnw clean spring-boot:run
```

### Run with Docker

```bash
docker build -t springboot-render .
docker run -p 8080:8080 springboot-render
```

## Endpoints

| Endpoint           | Description                             |
| ------------------ | --------------------------------------- |
| `/add.html`        | Main site/dynamic page                  |
| `/users/view`      | List of users                           |
| `/users/add`       | Add new user                            |
| `/actuator/health` | Health check endpoint (Spring Actuator) |

# Technologies

- Java 17
- Spring Boot
- Thymeleaf
- PostgreSQL Database
- Docker

[I did it based on that.](https://www.youtube.com/watch?v=RK6aAjUMcl0&list=PLg7lel5LdVjyO7jk-4biyr0fqPVygTLOk)

[Repository for the above youtube video.](https://github.com/bobbychansfu/springboot-render/tree/7d38d0343465661adceb6372591a8353717dfd5e)

## ////////////////////////////////////////////////////////////////////////////////////

Hungarian version - Magyar verzió

# Spring Boot Render Demo

Ez egy egyszerű Spring Boot webalkalmazás, ami Thymeleaf sablonokat és beágyazott PostgreSQL adatbázist használ.

A projekt célja, hogy bemutassa a dinamikus webalkalmazás készítését Spring Boot-tal, és hogy deploy-olható legyen Dockerrel Render.com-on.

## Dinamikus webalkalmazás mérföldkő

Az első dinamikus webalkalmazásom most már élőben működik! 🚀
Elindítva: 2026. február 15., 10:56.

Korábban csak lokálisan futott, most már online is elérhető.

[A link már nem elérhető.](https://spring-render-s4f4.onrender.com/add.html)

# Amit használtam:

## Backend (Szerveroldal)

- Spring Boot alkalmazás (DemoApplication.java)
- Controller osztályok, pl. UsersController, amelyek kezelik a kéréseket (/login, /register stb.)
- Model osztályok, pl. User, Product, amelyek az adatokat reprezentálják
- PostgreSQL adatbázis + JPA repository-k az adatok tárolásához és lekérdezéséhez
- ORM: Hibernate (JPA)
- Üzleti logika, pl. user.name értékek ellenőrzése vagy felhasználók mentése

## Frontend (Felhasználói felület)

- HTML sablonok (.html fájlok a resources/templates mappában)
- Thymeleaf attribútumok, pl. th:text, th:case, az adatok dinamikus megjelenítéséhez a backendből
- CSS / Bootstrap a megjelenés formázásához
- JavaScript az interaktivitáshoz

# Felépítés

Frontend (HTML + Thymeleaf)  
│  
▼  
Spring Controller  
│  
▼  
Controller (Üzleti logika)
│  
▼  
PostgreSQL adatbázis (adatok)

[Itt találod a részletes leírást, mit és hogyan csináltam.](https://github.com/Nagraggini/springboot-render/blob/main/HowToDoIt_Hungarian_version.md)
