package com.iykim.todoapp.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.iykim.todoapp.domain.TodoItem;
import com.iykim.todoapp.service.TodoService;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class TodoController {

	@Autowired
	private TodoService todoSvc;
	
	@GetMapping("/api/todoItems")
	public ResponseEntity<?> fetchAllTodoItems() {
		
		List<TodoItem> todoItems = todoSvc.fetchAllTodoItems();
		
		
		return ResponseEntity.ok(todoItems);
		
	}
	
}
