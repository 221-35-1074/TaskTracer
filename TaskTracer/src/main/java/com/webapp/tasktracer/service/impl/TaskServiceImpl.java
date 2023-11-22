package com.webapp.tasktracer.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.webapp.tasktracer.entity.Tasks;
import com.webapp.tasktracer.repository.TaskRepository;
import com.webapp.tasktracer.service.TaskService;

@Service
public class TaskServiceImpl implements TaskService {

	private TaskRepository taskRepository;

	public TaskServiceImpl(TaskRepository taskRepository) {
		super();
		this.taskRepository = taskRepository;
	}

	@Override
	public List<Tasks> getAllTasks() {
		return taskRepository.findAll();
	}

	@Override
	public Tasks addTasks(Tasks tasks) {
		return taskRepository.save(tasks);
	}

	@Override
	public Tasks getTasksBysl(int sl) {
		return taskRepository.findById(sl).get();
	}

	@Override
	public Tasks updateTasks(Tasks tasks) {
		return taskRepository.save(tasks);
	}

	@Override
	public void deleteTasks(int sl) {
		taskRepository.deleteById(sl);
	}
}
