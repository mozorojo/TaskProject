package com.RevTask.service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.RevTask.dao.TaskRepository;
import com.RevTask.entity.Entity;


@Service
public class ServiceImplementation implements TaskServiceLayer {

	
	@Autowired
	TaskRepository taskrepo;
	@Override
	public List<Entity> getAllTasks() {
		return taskrepo.findAll();
	}
	@Override
	public Entity getTask(long id) {
		Entity entity = taskrepo.findById(id).get();
		return entity;
	}
	@Override
	public void savetask(Entity entitytask) {
		taskrepo.save(entitytask);
	}
	@Override
	public void deleteTaskById(long id) {
		taskrepo.deleteById(id);
	}
	
	
	@Override
	public Entity getTaskById(long id) {
		Optional<Entity> optional = taskrepo.findById(id);
		Entity task = null;
		if (optional.isPresent()) {
			task = optional.get();
		} else {
			throw new RuntimeException(" Employee not found for id :: " + id);
	}
			return task;
	}

}
