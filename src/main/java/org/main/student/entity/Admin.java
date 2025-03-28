package org.main.student.entity;

import jakarta.persistence.Entity;


@Entity
public class Admin extends User {

	private String adminName;
	private String username;
	private long phno;

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return this.username;
	}

	public String getAdminName() {
		return adminName;
	}

	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}

	public long getPhno() {
		return phno;
	}

	public void setPhno(long phno) {
		this.phno = phno;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Admin(long userId, String password, String adminName, String username, long phno) {
		
		this.adminName = adminName;
		this.username = username;
		this.phno = phno;
	}

	public Admin() {
		super();
	}

	
}
