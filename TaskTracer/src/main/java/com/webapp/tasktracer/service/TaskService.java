package com.webapp.tasktracer.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.webapp.tasktracer.entity.Tasks;

@Service
public interface TaskService {
    public List<Tasks> getAllTasks();

    public Tasks addTasks(Tasks tasks);

    public Tasks getTasksBysl(int sl);

    public Tasks updateTasks(Tasks tasks);

    public void deleteTasks(int sl);
}
