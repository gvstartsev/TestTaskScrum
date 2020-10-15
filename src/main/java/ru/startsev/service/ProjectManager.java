package ru.startsev.service;

import ru.startsev.model.Task;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class ProjectManager {
    private LocalDateTime calculatedCompleteTaskDateTime;

    public LocalDateTime completionDataForTask(Task task) {
        long quantityTaskDays = (long) (1 / task.getTaskType().getMultiplier() *
                (100 - task.getReadinessLevel()) *
                (ChronoUnit.DAYS.between(LocalDateTime.now(), task.getCreateDateTime())) / task.getReadinessLevel());
        if (task.getReadinessLevel() < 100) {
            calculatedCompleteTaskDateTime = LocalDateTime.now().plusDays(quantityTaskDays);
        }

        return calculatedCompleteTaskDateTime;
    }
}
