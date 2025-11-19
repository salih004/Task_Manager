import model.TaskManager;
import view.TaskView;
import controller.TaskController;

public class Main {
    public static void main(String[] args) {
        TaskManager model = new TaskManager();
        TaskView view = new TaskView();
        TaskController controller = new TaskController(model, view);
        controller.run();
    }
}
