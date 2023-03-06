package com.Spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Spring.models.*;
import com.Spring.services.courseService;
import com.Spring.services.trainerService;


import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;



@CrossOrigin(origins = "*", allowedHeaders = "*") 
@RestController
public class AppController 
{

			// endpoints
	
	@Autowired
	courseService cr_serv;
	
	@Autowired
	trainerService tr_serv;
	
	
	/* Get - fetch , Post- insert , Put - partial updates, Delete - remove*/
	
	
	@GetMapping("/")
	public String home()
	{
		return "RestFul API get called !";
	}
	
	
	/***********************************************************/
	@GetMapping("allcourses")
	@CrossOrigin(origins = "http://localhost:4200/allcourses") 
	public List<course> allAllcourses()
	{
		return cr_serv.getAllCourses();
	}
	
	
	/**********************************************************/
	@GetMapping("alltrainers")
	@CrossOrigin(origins = "http://localhost:4200/alltrainers") 
	public List<trainer> allAllTrainers()
	{
		return tr_serv.getAlltrainers();
	}
	
	/**************************************************************/
	
	@PostMapping("addcourse")
	@ResponseBody	
	@CrossOrigin(origins = "http://localhost:4200/addcr")
	public void addcourse(@RequestBody course p)
	{
		cr_serv.addCourse(p);
	}
	
	
	/**************************************************************/
	
	@GetMapping("find/{id}")	
	@CrossOrigin(origins = "http://localhost:4200/find/{id}")
	@ResponseBody
	public course findbyid(@PathVariable int id)
	{ 
		return cr_serv.findById(id);
	}
	
	
	/**************************************************************/
	@PutMapping("updatecr/{id}")
	@ResponseBody	
	@CrossOrigin(origins = "http://localhost:4200/updatecr")
	public void updatecourse(@RequestBody course p,@PathVariable int id)
	{		
		cr_serv.updateCourse(p);
	}
	
	
	/**************************************************************/
	@DeleteMapping("deletecr")	
	@CrossOrigin(origins = "http://localhost:4200/deletecr")
	public void deletecourse(@PathVariable int id)
	{
		cr_serv.deleteCourse(id);
				
	}
	
}
