package Models;

public class TasksToDo {
    private String description;
    private String details;
    private String dueDate;

    public TasksToDo(String description, String details, String dueDate) {
        this.description = description;
        this.details = details;
        this.dueDate = dueDate;
    }

    public String getDescription() {
        return description;
    }

    public String getDetails() {
        return details;
    }

    public String getDueDate() {
        return dueDate;
    }


    public String toString() {
        return "TASK: description= " + description  +", details= " + details  +", dueDate= " + dueDate + "." ;
    }
}
