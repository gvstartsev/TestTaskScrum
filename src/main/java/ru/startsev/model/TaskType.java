package ru.startsev.model;

public enum TaskType {
    BUG(0.8),
    FEATURE(0.9),
    IMPROVEMENT(0.85);

    double multiplier;

    public double getMultiplier() {
        return multiplier;
    }

    TaskType(double multiplier) {
        this.multiplier = multiplier;
    }
}
