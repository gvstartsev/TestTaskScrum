package ru.startsev.model;

public enum TaskType {
    BUG(0.8),
    FEATURE(0.9),
    IMPROVEMENT(0.85);

    double multiplier;

    TaskType(double multiplier) {
        this.multiplier = multiplier;
    }
}
