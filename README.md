# Automated CI/CD Pipeline for a Containerized Web Application

A fresher-friendly DevOps project demonstrating CI/CD with GitHub, Jenkins, Maven, Docker, Docker Hub, and AWS EC2.

## Architecture

GitHub -> Jenkins -> Maven Build/Test -> Docker Image -> Docker Hub -> AWS EC2

## Technologies

- Java 17
- Spring Boot
- Maven
- Git/GitHub
- Jenkins
- Docker
- Docker Hub
- AWS EC2
- Linux
- Shell scripting

## Application Endpoints

- `/` - CI/CD success message
- `/health` - health check

## Local Run

```bash
./mvnw clean test package
java -jar target/cicd-demo-0.0.1-SNAPSHOT.jar
```

Open `http://localhost:8080`

## Docker

```bash
./mvnw clean package
docker build -t cicd-demo .
docker run -p 8080:8080 cicd-demo
```

## Jenkins

The Jenkinsfile defines stages for:

1. Checkout
2. Build and Test
3. Docker Build
4. Push to Docker Hub
5. Deployment

Before running the pipeline, replace `YOUR_DOCKERHUB_USERNAME` in the Jenkinsfile and configure a Jenkins credential with ID `dockerhub-credentials`.

## Resume Project Title

Automated CI/CD Pipeline for a Containerized Web Application

## Resume Description

Built an automated CI/CD pipeline using Jenkins and GitHub to build, test, containerize, and prepare deployment of a Java Spring Boot application. Integrated Maven for build and testing, Docker for containerization, Docker Hub for image management, and AWS EC2 as the target deployment environment.
