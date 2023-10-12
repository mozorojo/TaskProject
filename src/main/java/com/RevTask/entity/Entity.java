package com.RevTask.entity;


import org.hibernate.validator.constraints.Length;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;

@jakarta.persistence.Entity
@Table(name = "TaskDetails")
public class Entity {

	//entity table- Acts as the Clone/represents for Table in MySQL Database.
	//Includes Table fields, getters and setters , Constructors.
	
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
    
    @Column(nullable = false,length = 512, unique = true)
	@NotNull(message="title is blank")
	@Length(min = 3,max = 45,message = "characters are out of bound")
    private String title;
    
    
    @Column(nullable = false)
    @NotNull(message="description is blank")
    private String description;
    
    
    @Column(nullable = false)
    @NotNull(message="Pending status is blank")
    private boolean completed;


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public boolean isCompleted() {
		return completed;
	}


	public void setCompleted(boolean completed) {
		this.completed = completed;
	}


	public Entity(long id,
			@NotNull(message = "title is blank") @Length(min = 3, max = 45, message = "characters are out of bound") String title,
			@NotNull(message = "description is blank") String description,
			@NotNull(message = "Pending status is blank") boolean completed) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
		this.completed = completed;
	}


	public Entity() {
		super();
	}


	@Override
	public String toString() {
		return "Entity [id=" + id + ", title=" + title + ", description=" + description + ", completed=" + completed
				+ "]";
	}

    
    
	
}
