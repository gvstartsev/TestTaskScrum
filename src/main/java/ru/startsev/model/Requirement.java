package ru.startsev.model;

public class Requirement {
private Task task;

    public Requirement(Task task) {
        this.task = task;
    }

    public Task getTask() {
        return task;
    }

    public void setTask(Task task) {
        this.task = task;
    }
}
