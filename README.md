# Spring Boot Authentication System

A JWT-based authentication system built with Spring Boot 3.2.5 and PostgreSQL.

## Tech Stack

- **Java 21**
- **Spring Boot 3.2.5**
- **Spring Security**
- **Spring Data JPA**
- **PostgreSQL**
- **JWT (JSON Web Tokens)** - jjwt 0.11.5
- **Lombok**
- **Maven**

## Features

- User registration with encrypted passwords (BCrypt)
- JWT token generation
- PostgreSQL database integration
- RESTful API endpoints
- Role-based user management

## Project Structure

```
authApp/
├── config/
│   └── SecurityConfig.java          # Security configuration, password encoder
├── controller/
│   └── AuthController.java          # REST endpoints for authentication
├── dto/
│   ├── LoginRequest.java            # Login request payload
│   ├── RegisterRequest.java         # Registration request payload
│   └── AuthResponse.java            # Authentication response with token
├── entity/
│   └── User.java                    # User entity (JPA)
├── repository/
│   └── UserRepository.java          # JPA repository for User
├── security/
│   └── JwtService.java              # JWT token generation and validation
└── service/
    └── AuthService.java             # Business logic for authentication
```

## Database Configuration

**Database:** PostgreSQL  
**Database Name:** authdb  
**Port:** 5432  
**Username:** postgres  
**Password:** atharva

## API Endpoints

### Register User
```
POST /api/auth/register
Content-Type: application/json

{
  "email": "user@example.com",
  "password": "password123"
}
```

## Setup & Run

1. Ensure PostgreSQL is running with database `authdb`
2. Update credentials in `application.properties` if needed
3. Run the application:
```bash
./mvnw spring-boot:run
```

Application runs on `http://localhost:8080`

## Security Features

- CSRF protection disabled for API
- BCrypt password encryption
- JWT token expiration: 1 hour
- Public endpoints: `/api/auth/**`
- All other endpoints require authentication
