package com.project.manager.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.project.manager.entity.Manager;
import com.project.manager.entity.Project;

@Service
public interface ServiceInterface {

	public void insertProject(Project project) ;
	public Manager insertManager(Manager manager);
	public List<Project> getAllDetails();
	public String updateProject(Manager manager);
	public Manager getgetProjectByManagerName(String managerName);
	public List<Project> getNullProjects();
	public void setNull(int projectId);
	public Project getProjectById(int projectId);
	public void deleteproject(int projectId);
	public void updateNewProject(int projectId, int managerId) ;
	public List<Manager> getAllManagers();
	
	
	
	
	
}
