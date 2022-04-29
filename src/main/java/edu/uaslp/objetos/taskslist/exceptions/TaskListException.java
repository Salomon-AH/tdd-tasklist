package edu.uaslp.objetos.taskslist.exceptions;

public class TaskListException extends Exception{

    public TaskListException(){
        super("Due date is set in the past");
    }
}
