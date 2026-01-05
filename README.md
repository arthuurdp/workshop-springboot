# Workshop Spring Boot + JPA

This project is a Spring Boot application developed for educational purposes, focusing on building a backend system with JPA/Hibernate, layered architecture, and database management.

## Educational Purpose

### 1. Layered Architecture & Separation of Concerns
The project is organized into four distinct layers:
- **Resource Layer**: Controls API entry points and handles HTTP logic.
- **Service Layer**: This layer ensures that the Resource layer doesn't talk directly to the Database.
- **Repository Layer**: Abstracts data access. By using `JpaRepository`, we learn how to perform complex database operations with minimal code.
- **Domain Layer**: Focuses on modeling real-world entities and their relationships.

### 2. Object-Relational Mapping (ORM) with JPA
Bridging the gap between Object-Oriented Programming (Java) and Relational Databases (SQL):
- **Mapping**: Learning how to use annotations like `@Entity`, `@Table`, and `@Id` to link Java classes to database tables.
- **Relationships**: Implementing `1:1`, `1:N`, and `N:N` associations (ex: how a `Product` belongs to multiple `Categories`).
- **Composite Keys**: Using `@EmbeddedId` for complex tables like `OrderItem` that depend on multiple primary keys.
- **Lazy Loading**: Managing how and when data is fetched from the database to optimize performance.

### 3. Dependency Injection & Inversion of Control (IoC)
By using `@Autowired`, `@Service`, and `@Repository`, we learn how Spring Boot manages the lifecycle of objects. Instead of creating objects manually with `new`, we let the framework inject them where they are needed, making the code decoupled and easier to test.

### 4. Exception Handling
Instead of returning raw error messages, the project implements a **Global Exception Handler** using `@ControllerAdvice`. This taught me how to:
- Intercept specific errors (like `ResourceNotFoundException`).
- Format error responses into a standard JSON structure.
- Provide meaningful feedback to the API consumer.

### 5. Environment Management with Spring Profiles
Learning how to maintain different configurations for different stages of development:
- **Test environment**: Using H2 for rapid testing.
- **Development environment**: Using PostgreSQL to simulate a production-like database.
- **Seeding**: Automatically populating the database with initial data to facilitate manual testing.

### 6. Clean Code & Best Practices
- Use of **Domain-Driven Design** basics for entity modeling.
- **Encapsulation** and proper Java syntax.
- **Standard RESTful principles**: Using correct HTTP methods (GET, POST, PUT, DELETE) and status codes.
