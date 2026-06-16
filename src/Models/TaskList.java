package Models;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class TaskList {
    private final List<TasksToDo> alltasks;
    private final String filePath = "C:\\Users\\amitd\\IdeaProjects\\FINAlFINALFINAL\\src\\tasks";


    public TaskList() {
        this.alltasks = new ArrayList<>();
        files();}
    public void addTask(TasksToDo task) {
        alltasks.add(task);
        savefile();}
    public void removeTask(TasksToDo task) {
        alltasks.remove(task);
        savefile();}


    public List<TasksToDo> getTasks() {
        return alltasks;}
    private void files() {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(";", 3);
                if (parts.length == 3) {
                    alltasks.add(new TasksToDo(parts[0], parts[1], parts[2]));
                }
            }
        } catch (IOException ignored) { }}






    private void savefile() { try (BufferedWriter test = new BufferedWriter(new FileWriter(filePath))) {
        for (int i = 0; i < alltasks.size(); i++) {
            TasksToDo task = alltasks.get(i);
            test.write(task.getDescription() + ";" + task.getDetails() + ";" + task.getDueDate());
        }

        } catch (IOException e) {
        throw new RuntimeException(e);
    }}}
