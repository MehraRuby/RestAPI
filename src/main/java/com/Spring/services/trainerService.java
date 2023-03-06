package com.Spring.services;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Spring.models.*;
import com.Spring.repository.trainerRepo;

@Service("tr_serv")
public class trainerService 
{
	@Autowired
	trainerRepo cr;
	
	public List<trainer> getAlltrainers()
	{
		return cr.findAll();
	}

	public  trainer findById(int id)
	{
		trainer c = cr.findById(id).get();
		return c;
	}
	
	public void addtrainer(trainer c)
	{
		cr.save(c);
	}
	
	public void updatetrainer(trainer c)
	{
		cr.saveAndFlush(c);
	}
	
	public void deletetrainer(int id)
	{
		cr.deleteById(id);
	}
		
}
