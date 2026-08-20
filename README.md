# Automated CI/CD Pipeline for a Containerized Web Application

A fresher-friendly DevOps project demonstrating an automated CI/CD pipeline for a Java Spring Boot application using GitHub, Jenkins, Maven, Docker, Docker Hub, and AWS EC2.

## Architecture

GitHub → Jenkins → Maven Build & Test → Docker Build → Docker Hub → AWS EC2

## Technologies

- Java 17
- Spring Boot
- Maven
- Git & GitHub
- Jenkins
- Docker
- Docker Hub
- AWS EC2
- Linux
- Shell Scripting

## Application

This project is a simple Spring Boot web application created to demonstrate a complete DevOps CI/CD workflow.

### Application Endpoints

- `/` - Displays a CI/CD success message
- `/health` - Application health check

## Local Setup

Clone the repository:

```bash
git clone https://github.com/Goutham5525/jenkins-cicd.git
cd jenkins-cicd
```
---
*Build and test the application:
mvn clean test package

*Run the application:
java -jar target/cicd-demo-0.0.1-SNAPSHOT.jar

*Open:
http://localhost:8080

*Health check:
http://localhost:8080/health

---

*Build the Docker image:
mvn clean package
docker build -t cicd-demo .

*open:
http://localhost:8080

---
***Jenkins Credentials
Create a Jenkins credential for Docker Hub with:
Credential ID: dockerhub-credentials

---
**CI/CD Workflow

```
Developer
   ↓
GitHub
   ↓
Jenkins
   ↓
Maven Build & Test
   ↓
Docker Image Build
   ↓
Docker Hub
   ↓
AWS EC2
   ↓
Containerized Application

```

