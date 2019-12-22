package com.project.manager.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.manager.entity.Manager;
import com.project.manager.entity.Project;
import com.project.manager.repository.ManagerRepository;
import com.project.manager.repository.ProjectRepository;

@Service
public class ServiceImpl implements ServiceInterface {

	@Autowired
	private ProjectRepository projectrep;
	@Autowired
	private ManagerRepository managerrep;

	public void insertProject(Project project) {
		projectrep.save(project);

	}

	public Manager insertManager(Manager manager) {
		manager.getManagerId();
		return managerrep.save(manager);

	}

	public List<Project> getAllDetails() {
		List<Project> result = projectrep.findAll();
		System.out.println(result);
		return result;

	}

	public String updateProject(Manager manager) {                 
	
		List<Project> pp = manager.getProjects();
		for (Project project : pp) {
			project.setManagers(manager);
		}
		managerrep.save(manager);
		return null;
	}

	public Manager getgetProjectByManagerName(String managerName) {
		Manager result1 = new Manager();
		List<Manager> result = managerrep.findAll();
		for (Manager manager : result) {
			if (manager.getManagerName().equals(managerName)) {
				result1 = manager;
			}
		}
		return result1;
	}

	@Override
	public List<Project> getNullProjects() {
		List<Project> allproject = projectrep.findAll();
		List<Project> result = new ArrayList<Project>();
		for (Project project : allproject) {
			if (project.getManagers() == null) {
				result.add(project);
			}

		}
		return result;
	}

	@Override
	public void setNull(int projectId) {
		Project project = new Project();
		project = projectrep.findById(projectId).get();
		project.setManagers(null);
		projectrep.save(project);
	}

	@Override
	public Project getProjectById(int projectId) {
		Project result = new Project();
		result = projectrep.findById(projectId).get();
		return result;

	}

	@Override
	public void deleteproject(int projectId) {
		projectrep.deleteById(projectId);
	}

	@Override
	public void updateNewProject(int projectId, int managerId) {
		Manager manager = managerrep.findById(managerId).get();
		Project result = projectrep.findById(projectId).get();
		result.setManagers(manager);
		projectrep.save(result);
	}

	@Override
	public List<Manager> getAllManagers() {
		
		return managerrep.findAll();
	}

}
