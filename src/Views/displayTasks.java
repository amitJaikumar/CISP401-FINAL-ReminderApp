package Views;
import Models.TasksToDo;
import java.util.List;
import java.util.Scanner;



public class displayTasks {
    private Scanner scanner;
    public displayTasks() {
        this.scanner = new Scanner(System.in);
    }

    public void showMenu() {
        System.out.println("");
        System.out.println("1. Add Task");
        System.out.println("2. Remove Task");
        System.out.println("3. View All Tasks");
        System.out.println("4. Exit");
        System.out.println("");}

    public int getMenuChoice() {
        System.out.print("Enter your choice: ");
        return scanner.nextInt();
    }

    public TasksToDo getTaskDetails() {

        scanner.nextLine();
        System.out.print("Enter task description: ");
        String description = scanner.nextLine();
        System.out.print("Enter task details: ");
        String details = scanner.nextLine();

        System.out.print("Enter task due date: ");
        String dueDate = scanner.nextLine();
        return new TasksToDo(description, details, dueDate);
    }


    public void displaydatasks(List<TasksToDo> tasks) {

        for (int i = 0; i < tasks.size(); i++) {

            System.out.println((i + 1) + ". " + tasks.get(i));
        }
    }

    public int number() {
        System.out.print("Enter the number of the task to remove: ");
        return scanner.nextInt();
    }}
