package com.project.manager.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Project {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private int projectId;
private String projectName;
private double revenue;

@ManyToOne
private Manager managers;

public Project() {
	super();
}

public Project(int projectId, String projectName, double revenue, Manager managers) {
	super();
	this.projectId = projectId;
	this.projectName = projectName;
	this.revenue = revenue;
	this.managers = managers;
}

public int getProjectId() {
	return projectId;
}

public void setProjectId(int projectId) {
	this.projectId = projectId;
}

public String getProjectName() {
	return projectName;
}

public void setProjectName(String projectName) {
	this.projectName = projectName;
}

public double getRevenue() {
	return revenue;
}

public void setRevenue(double revenue) {
	this.revenue = revenue;
}

public Manager getManagers() {
	return managers;
}

public void setManagers(Manager managers) {
	this.managers = managers;
}

}