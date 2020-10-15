package ru.startsev.service;

import ru.startsev.model.Task;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class ProjectManager {
    public LocalDateTime completionDataForTask(Task task) {
        LocalDateTime calculatedCompleteTaskDateTime;
        double daysBetween = ChronoUnit.DAYS.between(LocalDateTime.now(), task.getCreateDateTime());
        long quantityTaskDays = (long) (1 / task.getTaskType().getMultiplier() *
                (100 - task.getReadinessLevel()) *
                (daysBetween) / task.getReadinessLevel());
        if (task.getReadinessLevel() < 100) {
            calculatedCompleteTaskDateTime = LocalDateTime.now().plusDays(quantityTaskDays);
        }
        else calculatedCompleteTaskDateTime = task.getEndDateTime();
        return calculatedCompleteTaskDateTime;
    }
}
