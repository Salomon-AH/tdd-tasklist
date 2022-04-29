package edu.uaslp.objetos.taskslist;

import java.time.LocalDateTime;

public class Task {
    private String title;
    private String description;
    private LocalDateTime dueDate;
    private Boolean done;

    public Task(){
    }

    public Task(String title, String description, LocalDateTime dueDate, Boolean done){
        this.title = title;
        this.description = description;
        this.dueDate = dueDate;
        this.done = done;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDateTime getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDateTime dueDate) {
        this.dueDate = dueDate;
    }

    public void setDone(Boolean done) {
        this.done = done;
    }

    public boolean isDone() {
        return done;
    }
}
