package com.project.manager.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.manager.entity.Manager;

public interface ManagerRepository extends JpaRepository<Manager,Integer>{

}
