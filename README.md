# Task Manager Web Application

A full-featured **Task Manager web application** built with **Java, Spring Boot, MySQL, and React.js**. This application streamlines task assignment, tracking, and leave management for small office setups. It supports multi-role functionality, enabling admins to assign tasks, monitor employee performance, and manage leave requests, while employees can update task statuses and request leaves.

---

## Features

* Add, update, and delete tasks
* Track task status: **PENDING, IN_PROGRESS, COMPLETE**
* Multi-role functionality (admin & employee)
* Leave management system
* Responsive UI using **Material-UI**
* RESTful API backend with **Spring Boot**
* MySQL database integration

---

## Tech Stack

**Frontend:**

* React.js
* Material-UI
* Axios
* JavaScript, HTML, CSS

**Backend:**

* Java
* Spring Boot
* Spring Data JPA
* REST APIs

**Database:**

* MySQL

**Other Tools:**

* Postman
* Git / GitHub

---

## Installation

### Backend

1. Navigate to the backend project folder:

   ```bash
   cd task-manager-backend
   ```
2. Make sure **MySQL** is running and database exists. Update `application.properties` with your DB credentials.
3. Build and run the Spring Boot application:

   ```bash
   mvn clean install
   mvn spring-boot:run
   ```
4. Backend API runs at `http://localhost:8080/api/tasks`.

### Frontend

1. Navigate to the frontend folder:

   ```bash
   cd task-manager-frontend
   ```
2. Install dependencies:

   ```bash
   npm install
   ```
3. Run the React app:

   ```bash
   npm start
   ```
4. Open in browser: `http://localhost:3000`

---

## Usage

* Enter task **Title** and **Description** and click **Add Task**.
* Update task **Status** using the dropdown.
* Delete task by clicking **Delete** button.
* All changes are synced with the MySQL database in real-time.

---

## API Endpoints

* `GET /api/tasks` — Get all tasks
* `POST /api/tasks` — Create new task
* `PUT /api/tasks/{id}` — Update task by ID
* `DELETE /api/tasks/{id}` — Delete task by ID

---

## Screenshots

*(Optional: Add screenshots of your frontend UI here)*

---

## License

This project is licensed under the MIT License.
