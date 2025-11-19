# Java MVC Task Manager

## Project Overview
This is a simple **Task Manager** application implemented in Java using the **MVC (Model-View-Controller)** design pattern.  

The application allows users to:

- Add tasks  
- Mark tasks as completed  
- Delete tasks  
- Display the list of tasks in the console  

The project demonstrates the separation of concerns in MVC:

- **Model**: Handles task data and business logic (`Task.java`, `TaskManager.java`)  
- **View**: Handles console input/output for interacting with the user (`TaskView.java`)  
- **Controller**: Manages user input and connects the Model with the View (`TaskController.java`)  

---

## Project Structure

mvc-setup/
├─ src/
│ ├─ model/
│ │ ├─ Task.java
│ │ └─ TaskManager.java
│ ├─ view/
│ │ └─ TaskView.java
│ ├─ controller/
│ │ └─ TaskController.java
│ └─ Main.java

markdown
Copy code

- **`src/model/`**: Classes representing the data and logic of tasks  
- **`src/view/`**: Handles console input/output for interacting with the user  
- **`src/controller/`**: Manages user input and coordinates updates between Model and View  
- **`Main.java`**: Entry point of the application  

---

## How to Run

1. Open a terminal and navigate to the `src` folder:

```bash
cd src
Compile all Java files:

bash
Copy code
javac model/*.java view/*.java controller/*.java Main.java
Run the program:

bash
Copy code
java Main
Use the console menu to:

Add a task

Mark a task as completed

Delete a task

Display all tasks

Notes
Tasks are stored in memory during runtime; closing the program will reset the task list

The application demonstrates MVC architecture using a simple console interface
