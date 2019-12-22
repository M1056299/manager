package com.project.manager.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Manager {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private int managerId;
private String managerName;
private int yearOfExp;
@OneToMany(cascade=CascadeType.ALL,mappedBy="managers")
private List<Project> projects;

public Manager() {
	super();
}
public Manager(int managerId, String managerName, int yearOfExp, List<Project> projects) {
	super();
	this.managerId = managerId;
	this.managerName = managerName;
	this.yearOfExp = yearOfExp;
	this.projects = projects;
}
public int getManagerId() {
	return managerId;
}
public void setManagerId(int managerId) {
	this.managerId = managerId;
}
public String getManagerName() {
	return managerName;
}
public void setManagerName(String managerName) {
	this.managerName = managerName;
}
public int getYearOfExp() {
	return yearOfExp;
}
public void setYearOfExp(int yearOfExp) {
	this.yearOfExp = yearOfExp;
}
public List<Project> getProjects() {
	return projects;
}
public void setProjects(List<Project> projects) {
	this.projects = projects;
}
@Override
public String toString() {
	return "Manager [managerId=" + managerId + ", managerName=" + managerName + ", yearOfExp=" + yearOfExp
			+ ", projects=" + projects + "]";
}

}
