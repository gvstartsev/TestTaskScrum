package ru.startsev.service;

import ru.startsev.model.Project;
import ru.startsev.model.Requirement;
import ru.startsev.model.Task;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class ProjectManager {
    public LocalDateTime completionDateForTask(Task task) {
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

    public LocalDateTime completionDateTimeForRequirement(Requirement requirement) {
        LocalDateTime calculatedCompleteRequirementDateTime = LocalDateTime.now();
        for (Task task : requirement.getTaskList()) {
            if (completionDateForTask(task).getNano() > calculatedCompleteRequirementDateTime.getNano()) {
                calculatedCompleteRequirementDateTime = completionDateForTask(task);
            }
        }
        return calculatedCompleteRequirementDateTime;
    }

    public LocalDateTime completionDateTimeForProject(Project project) {
        LocalDateTime calculatedCompleteProjectDateTime = LocalDateTime.now();
        for (Requirement requirement : project.getRequirementList()) {
            if (completionDateTimeForRequirement(requirement).getNano() > calculatedCompleteProjectDateTime.getNano()) {
                calculatedCompleteProjectDateTime = completionDateTimeForRequirement(requirement);
            }
        }
        return calculatedCompleteProjectDateTime;
    }

    public LocalDateTime completionDateTimeForAllProjects(ProjectList projects) {
        LocalDateTime calculatedCompleteAllProjectsDateTime = LocalDateTime.now();
        for (Project project : projects.projects) {
            if (completionDateTimeForProject(project).getNano() > calculatedCompleteAllProjectsDateTime.getNano()) {
                calculatedCompleteAllProjectsDateTime = completionDateTimeForProject(project);
            }
        }
        return calculatedCompleteAllProjectsDateTime;
    }
}
