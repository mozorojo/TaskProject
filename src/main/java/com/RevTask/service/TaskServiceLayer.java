package com.RevTask.service;

import java.util.List;



import com.RevTask.entity.Entity;



public interface TaskServiceLayer {
	
	//Service layer - deals with business logics.
	
	
	
	List<Entity> getAllTasks();

	public Entity getTask(long id);
	
	void savetask(Entity entitytask);

	void deleteTaskById(long id);

	Entity getTaskById(long id);
	

	

}
