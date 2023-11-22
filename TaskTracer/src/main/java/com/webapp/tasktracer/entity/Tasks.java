package com.webapp.tasktracer.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tasks")
public class Tasks {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int sl;
	@Column(name = "Task Name", nullable = false)
	private String name;
	@Column(name = "Task Description")
	private String description;
	@Column(name = "Due Date")
	private String date;

	public int getSl() {
		return sl;
	}

	public void setSl(int sl) {
		this.sl = sl;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public Tasks(String name, String description, String date) {
		super();
		this.name = name;
		this.description = description;
		this.date = date;
	}

	public Tasks() {

	}

}
