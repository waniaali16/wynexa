# Wynexa – Restaurant Operations Intelligence Platform

Wynexa is an independently developed, full-stack web application designed to help restaurants monitor operational activity, understand customer demand, and identify busy and quieter service periods.

The platform combines a Java Spring Boot backend, a MySQL database, and a responsive web interface to present restaurant operational information through three dedicated views.

## Key Features

### Customer View
- Displays restaurant activity and estimated waiting times.
- Provides customers with information about restaurant demand and availability.
- Helps customers make informed decisions about when to visit.

### Best Times Dashboard
- Visualises historical restaurant rush patterns.
- Highlights recommended visiting times and peak demand periods.
- Uses an interactive, colour-coded dashboard to present demand information clearly.

### Staff Dashboard
- Provides an overview of restaurant operations.
- Displays table occupancy, customer queues, and kitchen workload.
- Helps staff identify busy periods and potential operational bottlenecks.

## Technologies Used

- **Backend:** Java, Spring Boot, Spring Data JPA
- **Frontend:** HTML, CSS, JavaScript, Thymeleaf
- **Database:** MySQL / MariaDB
- **Build Tool:** Maven
- **Development Environment:** Visual Studio Code

## Running the Project Locally

### Prerequisites
- Compatible Java JDK
- MySQL or MariaDB server

### Setup

1. Download or clone this repository.
2. Create a MySQL database named `wynexa_db`.
3. Configure the database connection in `src/main/resources/application.properties`.
4. Open a terminal in the project directory.
5. Run the application using the Maven Wrapper.

On Windows:

```bash
.\mvnw.cmd spring-boot:run
```

On macOS/Linux:

```bash
./mvnw spring-boot:run
```

6. Open `http://localhost:8080` in your browser.

## Project Purpose

Wynexa was developed as a personal software development project to explore full-stack application development, database integration, backend business logic, and user-focused interface design.

The project demonstrates how software can transform restaurant operational information into accessible dashboards that support customer and staff decision-making.

## Developer

Independent Computer Science Project

**GitHub:** https://github.com/waniaali16/wynexa
