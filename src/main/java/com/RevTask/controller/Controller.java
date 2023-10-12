package com.RevTask.controller;






import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;



import com.RevTask.entity.Entity;
import com.RevTask.service.TaskServiceLayer;






@org.springframework.stereotype.Controller
public class Controller {

	
	@Autowired
	TaskServiceLayer taskservice;
	
	
	
	//display list of all tasks available
		@GetMapping("/" )
		public String viewHomePage(Model model) {
			model.addAttribute("ListTasks", taskservice.getAllTasks());
		return "Index";
		}

		
		
		//adding new task
		
		@GetMapping("/showNewTaskEntry")
		public String showNewTaskForm(Model model) {
			// model attribute to bind new task	
			Entity task=new Entity();
			model.addAttribute("task", task);
			return "newtask";
		}
		
		
		//saving the newly added task
		
		@PostMapping("/saveTask")
		public String savetask(@ModelAttribute("task") Entity entityTask ) {
			//saving new task to DB
			taskservice.savetask(entityTask);
		//redirecting hompage after adding new task
			return"redirect:/";
		}
		
		//updating the present task 
		@GetMapping("/showUpdate/{id}")
		public String showUpdate(@PathVariable ( value = "id") long id, Model model) {
			
			// get task from the service
			Entity tasks = taskservice.getTaskById(id);
			
			// set task as a model attribute to pre-populate the form
			model.addAttribute("tasks", tasks);
			return "updateTask";
		}
		
		
		//deleting the task from db
		
		@GetMapping("/deleteTask/{id}")
		public String deleteTask(@PathVariable (value = "id") long id) {
			
			// call delete task method 
			this.taskservice.deleteTaskById(id);
			return "redirect:/";
		}
		
		

}