package com.jpa.mappings.repositories;

import com.jpa.mappings.entities.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepo extends JpaRepository<Project,Integer> {
}
