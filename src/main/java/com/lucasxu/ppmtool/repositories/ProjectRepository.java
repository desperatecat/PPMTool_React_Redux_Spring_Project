package com.lucasxu.ppmtool.repositories;

import com.lucasxu.ppmtool.domain.Project;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepository extends CrudRepository<Project, Long> {

    Project getById(Long id);

    @Override
    Iterable<Project> findAll();
}
