package com.Spring.models;

import javax.persistence.*;

@Entity
@Table(name="course")
public class course 
{
	
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private int crid;
	 
	 @Column(name="course_name")
	 private String course_name;
	 
	 @Column(name="trainer_id")
	 private int trainer_id;
	 
	 
	 
	public int getCrid() {
		return crid;
	}
	public void setCrid(int crid) {
		this.crid = crid;
	}
	public String getCourse_name() {
		return course_name;
	}
	public void setCourse_name(String course_name) {
		this.course_name = course_name;
	}
	public int getTrainer_id() {
		return trainer_id;
	}
	public void setTrainer_id(int trainer_id) {
		this.trainer_id = trainer_id;
	}
	 	 
}
