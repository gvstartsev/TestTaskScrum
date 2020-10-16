package ru.startsev.service;

import ru.startsev.model.Project;
import ru.startsev.model.Requirement;
import ru.startsev.model.Task;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class ProjectManager {
    public LocalDateTime getCompletionDateForTask(Task task) {
        LocalDateTime calculatedCompleteTaskDateTime;
        long daysBetween = ChronoUnit.DAYS.between(LocalDateTime.now(), task.getCreateDateTime());
        long quantityTaskDays = (long) (1 / task.getTaskType().getMultiplier() *
                (100 - task.getReadinessLevel()) *
                (daysBetween) / task.getReadinessLevel());
        if (task.getReadinessLevel() < 100) {
            calculatedCompleteTaskDateTime = LocalDateTime.now().plusDays(quantityTaskDays);
        } else {
            calculatedCompleteTaskDateTime = task.getEndDateTime();
        }
        return calculatedCompleteTaskDateTime;
    }

    public LocalDateTime getCompletionDateTimeForRequirement(Requirement requirement) {
        LocalDateTime calculatedCompleteRequirementDateTime = LocalDateTime.now();
        for (Task task : requirement.getTaskList()) {
            if (getCompletionDateForTask(task).getNano() > calculatedCompleteRequirementDateTime.getNano()) {
                calculatedCompleteRequirementDateTime = getCompletionDateForTask(task);
            }
        }
        return calculatedCompleteRequirementDateTime;
    }

    public LocalDateTime getCompletionDateTimeForProject(Project project) {
        LocalDateTime calculatedCompleteProjectDateTime = LocalDateTime.now();
        for (Requirement requirement : project.getRequirementList()) {
            if (getCompletionDateTimeForRequirement(requirement).getNano() > calculatedCompleteProjectDateTime.getNano()) {
                calculatedCompleteProjectDateTime = getCompletionDateTimeForRequirement(requirement);
            }
        }
        return calculatedCompleteProjectDateTime;
    }

    public LocalDateTime getCompletionDateTimeForAllProjects(ProjectService projects) {
        LocalDateTime calculatedCompleteAllProjectsDateTime = LocalDateTime.now();
        for (Project project : projects.findAll()) {
            if (getCompletionDateTimeForProject(project).getNano() > calculatedCompleteAllProjectsDateTime.getNano()) {
                calculatedCompleteAllProjectsDateTime = getCompletionDateTimeForProject(project);
            }
        }
        return calculatedCompleteAllProjectsDateTime;
    }
}
