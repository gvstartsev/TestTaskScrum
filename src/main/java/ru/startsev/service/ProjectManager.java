package ru.startsev.service;

import ru.startsev.model.Task;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class ProjectManager {
    private LocalDateTime value;

    public LocalDateTime completionDataForTask(Task task) {
        if (task.getReadinessLevel() < 100) {
            value = LocalDateTime.now().plusDays(
                    (long) (1 / task.getTaskType().getMultiplier() *
                            (100 - task.getReadinessLevel()) *
                            (ChronoUnit.DAYS.between(LocalDateTime.now(),
                                    task.getCreateDateTime())) / task.getReadinessLevel()));
        }

        return value;
    }
}
