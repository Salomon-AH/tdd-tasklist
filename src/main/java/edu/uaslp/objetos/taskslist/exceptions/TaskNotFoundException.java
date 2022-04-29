package edu.uaslp.objetos.taskslist.exceptions;

public class TaskNotFoundException extends Exception{
    
    public TaskNotFoundException(){
        super("Task not found");
    }
}
