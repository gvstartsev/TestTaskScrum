package ru.startsev.model;

import java.time.LocalDateTime;

public class Task {
    private LocalDateTime createDateTime;
    private LocalDateTime endDateTime;
    private LocalDateTime startDateTime;
    private Status status;
    private TaskType taskType;
    private Person responsiblePerson;
    private Double readinessLevel;
    private Project project;
    private Requirement requirement;

    public Task() {}

    public Task(LocalDateTime createDateTime, LocalDateTime endDateTime, LocalDateTime startDateTime, Status status, TaskType taskType, Person responsiblePerson, Double readinessLevel, Project project, Requirement requirement) {
        this.createDateTime = createDateTime;
        this.endDateTime = endDateTime;
        this.startDateTime = startDateTime;
        this.status = status;
        this.taskType = taskType;
        this.responsiblePerson = responsiblePerson;
        this.readinessLevel = readinessLevel;
        this.project = project;
        this.requirement = requirement;
    }

    public LocalDateTime getCreateDateTime() {
        return createDateTime;
    }

    public void setCreateDateTime(LocalDateTime createDateTime) {
        this.createDateTime = createDateTime;
    }

    public LocalDateTime getEndDateTime() {
        return endDateTime;
    }

    public void setEndDateTime(LocalDateTime endDateTime) {
        this.endDateTime = endDateTime;
    }

    public LocalDateTime getStartDateTime() {
        return startDateTime;
    }

    public void setStartDateTime(LocalDateTime startDateTime) {
        this.startDateTime = startDateTime;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public TaskType getTaskType() {
        return taskType;
    }

    public void setTaskType(TaskType taskType) {
        this.taskType = taskType;
    }

    public Person getResponsiblePerson() {
        return responsiblePerson;
    }

    public void setResponsiblePerson(Person responsiblePerson) {
        this.responsiblePerson = responsiblePerson;
    }

    public Double getReadinessLevel() {
        return readinessLevel;
    }

    public void setReadinessLevel(Double readinessLevel) {
        this.readinessLevel = readinessLevel;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    public Requirement getRequirement() {
        return requirement;
    }

    public void setRequirement(Requirement requirement) {
        this.requirement = requirement;
    }
}