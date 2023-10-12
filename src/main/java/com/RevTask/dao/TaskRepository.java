package com.RevTask.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.RevTask.entity.Entity;

@Repository
public interface TaskRepository extends JpaRepository<Entity, Long> {

	//repository interface - Includes all the in-built methods to iterate over fetching data.
}
