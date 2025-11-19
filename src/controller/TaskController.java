package controller;

import model.TaskManager;
import view.TaskView;

public class TaskController {
    private TaskManager model;
    private TaskView view;

    public TaskController(TaskManager model, TaskView view) {
        this.model = model;
        this.view = view;
    }

    public void run() {
        boolean running = true;
        while (running) {
            int choice = view.showMenu();
            switch (choice) {
                case 1 -> model.addTask(view.getTaskDescription());
                case 2 -> model.completeTask(view.getTaskIndex());
                case 3 -> model.deleteTask(view.getTaskIndex());
                case 4 -> view.displayTasks(model.getTasks());
                case 5 -> running = false;
                default -> System.out.println("Invalid option.");
            }
        }
        System.out.println("Exiting...");
    }
}
