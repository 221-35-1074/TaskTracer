package com.webapp.tasktracer.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webapp.tasktracer.entity.Tasks;

public interface TaskRepository extends JpaRepository<Tasks, Integer>{

}
