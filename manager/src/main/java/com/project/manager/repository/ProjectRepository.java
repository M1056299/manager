package com.project.manager.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.manager.entity.Project;

public interface ProjectRepository extends JpaRepository<Project,Integer>
{
 
	
	
}
