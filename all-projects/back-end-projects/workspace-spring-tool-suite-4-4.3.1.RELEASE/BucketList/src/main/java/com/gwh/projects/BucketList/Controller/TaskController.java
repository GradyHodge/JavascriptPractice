package com.gwh.projects.BucketList.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.gwh.projects.BucketList.Repository.TaskRepo;

@Controller
public class TaskController {
	
	@Autowired
	private TaskRepo taskRepo;
	
	
	@GetMapping("/") 
	public String getHomePage(){
		
		return "index";
		
	}
	
	
	

}
