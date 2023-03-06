package com.Spring.models;


import javax.persistence.*;
import javax.persistence.Table;

@Entity
@Table(name="trainer")
public class trainer 
{
	@Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int trainer_id;
	
	@Column(name="email_id")
	private String email_id;
	
	@Column(name="phone")
	private String phone;
	
	@Column(name="cr_crid")
	private int cr_crid;

	public int getTrainer_id() {
		return trainer_id;
	}

	public void setTrainer_id(int trainer_id) {
		this.trainer_id = trainer_id;
	}

	public String getEmail_id() {
		return email_id;
	}

	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getCr_crid() {
		return cr_crid;
	}

	public void setCr_crid(int cr_crid) {
		this.cr_crid = cr_crid;
	}
	
}
