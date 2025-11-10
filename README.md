# MeetRix - Smart Workspace Meeting Scheduler

A comprehensive microservices-based meeting scheduling platform built with Spring Boot and React, designed for efficient workspace management and intelligent meeting coordination.

## 🚀 Features

- **User Management**: Secure user authentication and authorization with role-based access control
- **Task Scheduling**: Intelligent task and meeting scheduling capabilities
- **Real-time Notifications**: Stay updated with instant notifications about meetings and changes
- **Analytics Dashboard**: Comprehensive analytics for meeting patterns and workspace utilization
- **API Gateway**: Centralized routing and security for all microservices
- **Service Discovery**: Dynamic service registration and discovery using Eureka
- **Centralized Configuration**: Manage all service configurations from a single location

## 🏗️ Architecture

This project follows a microservices architecture with the following services:

### Backend Services (Spring Boot)
- **Discovery-Server**: Service registry using Spring Cloud Netflix Eureka
- **Config-Server**: Centralized configuration management using Spring Cloud Config
- **API-Gateway**: API gateway for routing and security
- **UserService**: User authentication, authorization, and profile management
- **TaskService**: Meeting and task scheduling functionality
- **Notification-Service**: Real-time notification delivery
- **Analytics-Service**: Data analytics and reporting

### Frontend
- **React Application**: Modern, responsive UI built with React and Material-UI

## 🛠️ Technology Stack

### Backend
- **Java 21**
- **Spring Boot 3.4.11**
- **Spring Cloud 2024.0.2**
- **Spring Security** - Authentication & Authorization
- **Spring Data JPA** - Database operations
- **Maven** - Dependency management
- **Eureka** - Service discovery
- **Spring Cloud Config** - Configuration management

### Frontend
- **React 19.1.1**
- **Vite 7.1.7** - Build tool
- **Material-UI** - UI components
- **React Router** - Navigation
- **Axios** - HTTP client
- **React Query** - Data fetching and caching
- **Recharts** - Data visualization
- **React Toastify** - Notifications

## 📋 Prerequisites

- Java Development Kit (JDK) 21
- Maven 3.6+
- Node.js 18+ and npm
- Git

## 🚀 Getting Started

### 1. Clone the Repository
```bash
git clone https://github.com/akshay75760/Smart-Workspace-Meeting-Scheduler.git
cd MeetRix
```

### 2. Start Backend Services

Start services in the following order:

#### Config Server (Port: 8888)
```bash
cd Config-Server
mvnw spring-boot:run
```

#### Discovery Server (Port: 8761)
```bash
cd Discovery-Server
mvnw spring-boot:run
```

#### API Gateway (Port: 8080)
```bash
cd API-Gateway
mvnw spring-boot:run
```

#### Microservices
```bash
# User Service
cd UserService
mvnw spring-boot:run

# Task Service
cd TaskService
mvnw spring-boot:run

# Notification Service
cd Notification-Service
mvnw spring-boot:run

# Analytics Service
cd Analytics-Service
mvnw spring-boot:run
```

### 3. Start Frontend Application
```bash
cd Frontend
npm install
npm run dev
```

The application will be available at `http://localhost:5173`

## 📁 Project Structure

```
MeetRix/
├── Config-Server/          # Configuration server
├── Discovery-Server/       # Eureka service registry
├── API-Gateway/           # API gateway and routing
├── UserService/           # User management service
├── TaskService/           # Task scheduling service
├── Notification-Service/  # Notification service
├── Analytics-Service/     # Analytics and reporting
└── Frontend/             # React frontend application
```

## 🔧 Configuration

- Each microservice has its own `application.properties` located in `src/main/resources/`
- Service ports and configurations can be modified in respective property files
- Frontend configuration can be modified in `vite.config.js`

## 🌐 Service Endpoints

- **Eureka Dashboard**: `http://localhost:8761`
- **API Gateway**: `http://localhost:8080`
- **Frontend**: `http://localhost:5173`

## 🧪 Running Tests

### Backend Tests
```bash
cd <service-name>
mvnw test
```

### Frontend Tests
```bash
cd Frontend
npm run test
```

## 📦 Building for Production

### Backend
```bash
cd <service-name>
mvnw clean package
```

### Frontend
```bash
cd Frontend
npm run build
```

## 🤝 Contributing

1. Fork the repository
2. Create your feature branch (`git checkout -b feature/AmazingFeature`)
3. Commit your changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

## 📝 License

This project is licensed under the MIT License - see the LICENSE file for details.

## 👥 Author

**Akshay Kumar**
- GitHub: [@akshay75760](https://github.com/akshay75760)

## 🙏 Acknowledgments

- Spring Boot and Spring Cloud teams for excellent microservices framework
- React and Vite teams for modern frontend tooling
- Material-UI for beautiful UI components

## 📧 Support

For support, email your-email@example.com or open an issue in the repository.

---

⭐ Star this repository if you find it helpful!
