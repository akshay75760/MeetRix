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
