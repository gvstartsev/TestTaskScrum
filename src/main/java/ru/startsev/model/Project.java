package ru.startsev.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Project {
    private LocalDateTime createDateTime;
    private LocalDateTime endDateTime;
    private LocalDateTime startDateTime;
    private Status status;
    private TaskType taskType;
    private String responsiblePerson;
    private Double readinessLevel;

    List<Task> taskList = new ArrayList<>();

    public List<Task> getTaskList() {
        return taskList;
    }

    public void setTaskList(List<Task> taskList) {
        this.taskList = taskList;
    }

    public List<Requirement> getRequirementList() {
        return requirementList;
    }

    public void setRequirementList(List<Requirement> requirementList) {
        this.requirementList = requirementList;
    }

    List<Requirement> requirementList = new ArrayList<>();

    public Project() {

    }

    public Project(LocalDateTime createDateTime, LocalDateTime endDateTime, LocalDateTime startDateTime, Status status, TaskType taskType, String responsiblePerson, Double readinessLevel) {
        this.createDateTime = createDateTime;
        this.endDateTime = endDateTime;
        this.startDateTime = startDateTime;
        this.status = status;
        this.taskType = taskType;
        this.responsiblePerson = responsiblePerson;
        this.readinessLevel = readinessLevel;
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
