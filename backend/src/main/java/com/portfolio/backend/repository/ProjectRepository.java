package com.portfolio.backend.repository;

import com.portfolio.backend.model.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project, Long> {
    // متدهای CRUD پایه (findAll, findById, save, deleteById) خودکار وجود دارن
}
