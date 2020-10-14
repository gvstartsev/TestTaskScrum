package ru.startsev.service;

import ru.startsev.model.Task;
import ru.startsev.model.TaskType;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ProjectManager {
    private Long value;

    public String completionDataForTask(Task task) {
        if (task.getReadinessLevel() == 100 || task.getReadinessLevel() > 100) {
            value = System.currentTimeMillis() +
                    1 / TaskType. *
                            (100 - task.getReadinessLevel()) *
                            (System.currentTimeMillis() -
                                    task.getCreateDateTime());
        }
        long itemLong = value * 1000;
        Date itemDate = new Date(itemLong);
        String itemDateStr = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss").format(itemDate);
        return itemDateStr;
    }
}
