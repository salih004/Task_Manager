package view;

import model.Task;
import java.util.List;
import java.util.Scanner;

public class TaskView {
    private Scanner scanner = new Scanner(System.in);

    public int showMenu() {
        System.out.println("\n--- Task Manager ---");
        System.out.println("1. Add Task");
        System.out.println("2. Complete Task");
        System.out.println("3. Delete Task");
        System.out.println("4. Show Tasks");
        System.out.println("5. Exit");
        System.out.print("Choose an option: ");
        return scanner.nextInt();
    }

    public String getTaskDescription() {
        System.out.print("Enter task description: ");
        return scanner.next();
    }

    public int getTaskIndex() {
        System.out.print("Enter task index: ");
        return scanner.nextInt();
    }

    public void displayTasks(List<Task> tasks) {
        System.out.println("\n--- Task List ---");
        for (int i = 0; i < tasks.size(); i++) {
            Task task = tasks.get(i);
            System.out.printf("%d. %s [%s]\n", i, task.getDescription(),
                    task.isCompleted() ? "Completed" : "Pending");
        }
    }
}
