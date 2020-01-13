package com.lucasxu.ppmtool.services;

import com.lucasxu.ppmtool.domain.Project;
import com.lucasxu.ppmtool.repositories.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectService {

    @Autowired
    private ProjectRepository projectRepository;

    public Project saveOrUpdateProject(Project project){

            if(project.getStatus()==null || project.getStatus()==""){
                project.setStatus("TO_DO");
            }

            return projectRepository.save(project);

    }

    public Project findProjectById(Long id){
        return projectRepository.getById(id);
    }

    public Iterable<Project> findAllProjects(){
        return projectRepository.findAll();
    }

    public void deleteProjectById(Long id){
        Project project = projectRepository.getById(id);
        projectRepository.delete(project);
    }
}
