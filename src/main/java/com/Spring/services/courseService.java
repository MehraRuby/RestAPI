package com.Spring.services;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Spring.models.*;
import com.Spring.repository.courseRepo;

@Service("cr_serv")
public class courseService 
{
	@Autowired
	courseRepo cr;
	
	public List<course> getAllCourses()
	{
		return cr.findAll();
	}

	public  course findById(int id)
	{
		course c = cr.findById(id).get();
		return c;
	}
	
	public void addCourse(course c)
	{
		cr.save(c);
	}
	
	public void updateCourse(course c)
	{
		course c1 = cr.findById(c.getCrid()).get();
		c1.setCrid(c.getCrid());
		c1.setCourse_name(c.getCourse_name());
		c1.setTrainer_id(c.getTrainer_id());
		cr.saveAndFlush(c1);
	}
	
	public void deleteCourse(int id)
	{
		cr.deleteById(id);
	}
		
}
