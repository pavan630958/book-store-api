📚 Book Store API (Spring Boot)
---------------------------------

A Spring Boot REST API for managing books in a bookstore.
This project demonstrates Java backend development with REST, JPA/Hibernate, Swagger, and MySQL.



✨ Features
---------------

📚 CRUD operations for books (Create, Read, Update, Delete)

✅ RESTful endpoints with proper HTTP status codes

⚠️ Global Exception Handling

🔒 Request validation using Hibernate Validator

📖 Interactive API Documentation with Swagger (springdoc-openapi)

💾 MySQL database integration with Spring Data JPA


🛠️ Tech Stack
----------------

☕ Java 17 (compatible with Java 11+)

🚀 Spring Boot (Web, Validation, Data JPA)

🗄️ Hibernate

🐬 MySQL

📦 Maven

📖 Swagger / OpenAPI (springdoc-openapi)



🚀 Getting Started
-----------------------
1️⃣ Clone the Repository
git clone https://github.com/pavan630958/book-store-api.git
cd book-store-api
2️⃣ Configure Database
Edit src/main/resources/application.properties:
spring.datasource.url=jdbc:mysql://localhost:3306/bookdb?createDatabaseIfNotExist=true&useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC
spring.datasource.username=root
spring.datasource.password=yourpassword

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true

3️⃣ Run the Application
mvnw.cmd spring-boot:run
Or from IDE → run BookStoreApiBackendProjectApplication.
Server starts at → http://localhost:8080



📡 API Endpoints
---------------------

| Method | Endpoint        | Description     |
| ------ | --------------- | --------------- |
| GET    | /api/books      | Get all books   |
| GET    | /api/books/{id} | Get book by ID  |
| POST   | /api/books      | Create new book |
| PUT    | /api/books/{id} | Update a book   |
| DELETE | /api/books/{id} | Delete a book   |

Example JSON (POST/PUT)
{
  "title": "Clean Code",
  "author": "Robert C. Martin",
  "price": 499.0
}



📖 API Documentation (Swagger)
----------------------------------

Swagger UI → http://localhost:8080/swagger-ui.html

OpenAPI JSON → http://localhost:8080/v3/api-docs


🛣️ Roadmap
-----------

🔑 JWT Authentication & Role-based Access

🐳 Docker support (App + MySQL)

⚙️ CI/CD integration (GitHub Actions / Jenkins)

☁️ Deploy on AWS (Elastic Beanstalk / EC2 / RDS)


👤 Author
---------

Pavan Kumar Annabattula

💼 LinkedIn: [pavan6309](https://www.linkedin.com/in/pavan6309/)

💻 GitHub: [pavan630958](https://github.com/pavan630958)
