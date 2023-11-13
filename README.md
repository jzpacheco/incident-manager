# Incident Manager System
## Objective
The goal of this exercise is to create a simple application that performs REST operations for incident management, including creation, update, deletion, and retrieval.

## Technologies
JPA/Hibernate
Spring Boot
Maven

## Steps
### 1) Create an Incident Management Application
Create an application for incident management that provides REST operations for the creation, maintenance, deletion, and retrieval of incidents. An incident should have the following fields (add more if necessary):

idIncident
name
description
createdAt
updatedAt
closedAt

###2) Functionality
The application should include the following functionalities:

Create Incidents
Update Incidents
Delete Incidents
List all incidents
Retrieve an incident by ID
List the latest 20 incidents in descending order

###3) Database
Use an embedded database (e.g., H2) for data persistence. You can choose another database, but make sure to document the steps for initializing the application with that database.

### 4) How to Compile
Compilation and Execution
Clone the repository.
Navigate to the project root directory.
Run mvn clean install to compile and package the application.
Execute the generated JAR file using java -jar target/incident-manager-1.0.jar.
