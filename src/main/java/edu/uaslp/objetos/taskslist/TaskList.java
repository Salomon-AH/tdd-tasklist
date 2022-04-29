package edu.uaslp.objetos.taskslist;

import edu.uaslp.objetos.taskslist.exceptions.TaskNotFoundException;

import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;
import java.util.Objects;

public class TaskList {
    List<Task> taskList;
    private String title;

    public TaskList(){
        taskList = new ArrayList<>();
    }

    public List<Task> getNextTasks() {
        List<Task> taskList = new ArrayList<>();

        int size = this.taskList.size();
        for (Task task : this.taskList) {
            if (!task.isDone()) {
                taskList.add(task);
            }
        }

        taskList.sort(Comparator.comparing(Task::getDueDate));

        return taskList;
    }

    public Task remove(Task task){
        return null;
    }

    public Task find(String title) throws TaskNotFoundException {
        int size = taskList.size();
        for (Task task : taskList) {
            if (Objects.equals(title, task.getTitle())) {
                return task;
            }
        }
        throw new TaskNotFoundException();
    }

    public void markAsNotDone(String title) throws TaskNotFoundException{
        Task task = find(title);

        task.setDone(true);
    }

    public void markAsDone(String title) throws TaskNotFoundException{
        Task task = find(title);

        task.setDone(false);
    }

    public void add(Task task){
        task.add(task);
    }

    public int getSize() {
        return taskList.size();
    }

    public Task getNextTask(){
        String title = taskList.element().getTitle();

        int size = taskList.size(),i;

        for(i = 0; !Objects.equals(title, taskList.get(i).getTitle()) && size > i; i++);
        return taskList.get(i+1);
    }
}
