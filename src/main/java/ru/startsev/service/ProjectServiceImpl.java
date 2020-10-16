package ru.startsev.service;

import ru.startsev.model.Project;

import java.util.List;

public class ProjectServiceImpl implements ProjectService {

    private final ProjectRepository repository;

    public ProjectServiceImpl(ProjectRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Project> findAll() {
        return this.repository.findAll();
    }
}
