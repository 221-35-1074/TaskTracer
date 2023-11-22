package com.webapp.tasktracer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.webapp.tasktracer.entity.Tasks;
import com.webapp.tasktracer.service.TaskService;

@Controller
public class TaskController {
	@Autowired
	private TaskService taskService;

	

	@GetMapping("/tasks")
	public String listTasks(Model model) {
		model.addAttribute("tasks", taskService.getAllTasks());
		return "tasks";
	}

	@GetMapping("/tasks/add")
	public String addTasks(Model model) {
		Tasks task = new Tasks();
		model.addAttribute("task", task);
		return "add_task";
	}

	@PostMapping("/tasks")
	public String addTasks(@ModelAttribute("task") Tasks tasks) {
		taskService.addTasks(tasks);
		return "redirect:/tasks";
	}

	@GetMapping("/tasks/edit/{sl}")
	public String editTask(@PathVariable int sl, Model model) {
		model.addAttribute("tasks", taskService.getTasksBysl(sl));
		return "edit_tasks";
	}

	@PostMapping("/tasks/{sl}")
	public String updateTasks(@PathVariable int sl, @ModelAttribute("tasks") Tasks tasks, Model model) {
		Tasks existingTask = taskService.getTasksBysl(sl);
		existingTask.setSl(sl);
		existingTask.setName(tasks.getName());
		existingTask.setDescription(tasks.getDescription());
		existingTask.setDate(tasks.getDate());

		taskService.updateTasks(existingTask);
		return "redirect:/tasks";
	}

	@GetMapping("/tasks/{sl}")
	public String deleteTasks(@PathVariable int sl) {
		taskService.deleteTasks(sl);
		return "redirect:/tasks";
	}
}