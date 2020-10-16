package ru.startsev.service;

import ru.startsev.model.Project;

import java.util.List;

public interface ProjectRepository {
    List<Project> findAll();
}
