import Controllers.TaskController;

import Models.TaskList;
import Views.displayTasks;

public class Main {
    public static void main(String[] args) {
        System.out.print("Welcome to the reminder app! Chart your own reminders! Happy charting.");
        System.out.println("");
        TaskList taskList = new TaskList();
        displayTasks taskView = new displayTasks();
        TaskController taskController = new TaskController(taskList, taskView);
        taskController.mainBody();
    }
}
