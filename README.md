**Inventory Management System**

The back end code for Inventory Management System specifically designed for Pastry restaurant. 
Each **microserices ** are designed to be interacted with each other during the use of the application:
- API Gateway: Microservice that acts as a central entry point for managing, routing, and securing API requests to multiple backend microservices and performs Reverse Proxy & Load Balancing, Authentication & Security (JWT-Based), API Gateway Routing, Request Validation & Filtering
- Discovery Service: Microservice that acts as a Service Registry using Eureka Server. Its main purpose is to manage and track all microservices in your system, enabling service discovery and dynamic load balancing.
- Inventory Service: Microservice that acts as a central part of an inventory management system, which manages product batches and types, handling everything from record creation to monitoring inventory levels.
- Notification Service: Microservice responsible for real-time event-driven notifications using Kafka and Server-Sent Events (SSE), handling the logic of alerting user for login activity, the change in stock, end-of-day report.
- Security Service: Microservice that provides user authentication and authorization functionality using JWT (JSON Web Tokens) and manages user security features. 
- Sell Service: Microservice that handles the logic of keeping track of the stock and alert the user to refill the stock at a certain level.



**Tech Stack:**

1. Backend
- Java
- Spring Boot

2. Database
- PostgreSQL
  
4. Security
- Spring Security
- JWT-based Authentication
- BCrypt Password Encoding
   
5. Infrastructure
- Docker
   
