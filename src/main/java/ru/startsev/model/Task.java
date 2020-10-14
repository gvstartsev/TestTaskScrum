package ru.startsev.model;

public class Task {
    private Long createDateTime;
    private Long endDateTime;
    private Long startDateTime;
    private Status status;
    private TaskType taskType;
    private String responsiblePerson;
    private Double readinessLevel;

    public Task(Long createDateTime, Long endDateTime, Long startDateTime, Status status, TaskType taskType, String responsiblePerson, Double readinessLevel) {
        this.createDateTime = createDateTime;
        this.endDateTime = endDateTime;
        this.startDateTime = startDateTime;
        this.status = status;
        this.taskType = taskType;
        this.responsiblePerson = responsiblePerson;
        this.readinessLevel = readinessLevel;
    }

    public Long getCreateDateTime() {
        return createDateTime;
    }

    public void setCreateDateTime(Long createDateTime) {
        this.createDateTime = createDateTime;
    }

    public Long getEndDateTime() {
        return endDateTime;
    }

    public void setEndDateTime(Long endDateTime) {
        this.endDateTime = endDateTime;
    }

    public Long getStartDateTime() {
        return startDateTime;
    }

    public void setStartDateTime(Long startDateTime) {
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

    public String getResponsiblePerson() {
        return responsiblePerson;
    }

    public void setResponsiblePerson(String responsiblePerson) {
        this.responsiblePerson = responsiblePerson;
    }

    public Double getReadinessLevel() {
        return readinessLevel;
    }

    public void setReadinessLevel(Double readinessLevel) {
        this.readinessLevel = readinessLevel;
    }
}
