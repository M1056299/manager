package com.project.manager.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.project.manager.entity.Manager;
import com.project.manager.entity.Project;
import com.project.manager.service.ServiceInterface;

@Controller
public class ManagerController {
	@Autowired
	ServiceInterface ms;

	@RequestMapping("/getform")
	public String index() {
		return "index";
	}

	@RequestMapping("/projects")
	public String insert() {
		return "registerproject";
	}

	@PostMapping("/insertprojects")
	public String insertProjects(@ModelAttribute("project") Project project, Model m) {
		m.addAttribute("project", project);
		ms.insertProject(project);
		return "insertedsuccessfully";
	}

	
	@RequestMapping("/manager")
	public String managerForm(Model m) {
		List<Project> projects = ms.getAllDetails();
		m.addAttribute("projects", projects);
		return "managerdetails";
	}

	@PostMapping("/insertmanagerproject")
	public String insertmanagerdata(Manager manager, Model m) {
	    ms.insertManager(manager);
		m.addAttribute("manager",manager);
		ms.updateProject(manager);
		return "managerinsertedsuccessfully";
	}

	@GetMapping("/getparticularmanager")
	public String getProjectManagerForm(Model m) {
		List<Manager> managers=ms.getAllManagers();
		m.addAttribute("managers", managers);
		return "getprojects";
	}

	String managerName2 = null;
	
	
	@PostMapping("/get")
	public String getProjectByMangerName(Model m,@RequestParam("managerId") String managerName) {
		
		Manager manager = ms.getgetProjectByManagerName(managerName);
		m.addAttribute("manager",manager);
		return "getprojects";
	}

	@RequestMapping("/addnewproject/{managerId}")
	public String addNewProject(@PathVariable int managerId, int projectId, Model m) {
		m.addAttribute("managerId", managerId);
		System.out.println(managerId);
		m.addAttribute("project", projectId);
		System.out.println(projectId);
		ms.updateNewProject(projectId, managerId);

		return "success";
	}

	@GetMapping("/update/{managerId}/{projectId}")
	public String updateform(@PathVariable int managerId, @PathVariable int projectId, Model m) {
		ms.setNull(projectId);
		Project project = ms.getProjectById(projectId);
		m.addAttribute("project", project);
		List<Project> projects = ms.getNullProjects();
		m.addAttribute("managerId", managerId);

		m.addAttribute("projects", projects);

		return "updateproject";
	}

	@RequestMapping("/delete/{projectId}")
	public String deleteform(@PathVariable int projectId, Model m) {
		ms.deleteproject(projectId);
		return "delete";
	}

}