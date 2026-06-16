package Controllers;
import Models.TaskList;
import Models.TasksToDo;
import Views.displayTasks;

import java.util.List;

public class TaskController {
    private TaskList taskList;
    private displayTasks taskView;
    public TaskController(TaskList taskList, displayTasks taskView) {
        this.taskList = taskList;
        this.taskView = taskView;
    }

    public void mainBody() {
        boolean statemn = false;
        while (!statemn) {
            taskView.showMenu();

            int choice = taskView.getMenuChoice();
            switch (choice) {

                case 1:

                    TasksToDo newTask = taskView.getTaskDetails();

                    taskList.addTask(newTask);
                    break;
                case 2:
                    List<TasksToDo> tasks = taskList.getTasks();
                    taskView.displaydatasks(tasks);

                    int taskNumber = taskView.number();

                    if (taskNumber > 0) {
                        taskList.removeTask(tasks.get(taskNumber - 1));
                    }
                    break;

                case 3:
                    taskView.displaydatasks(taskList.getTasks());
                    break;

                case 4:
                    statemn = true;
                    break;
            }}}}
