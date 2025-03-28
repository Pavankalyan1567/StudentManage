package org.main.student.entity;

import java.util.Set;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
public class Admin extends User{
	
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

	public Admin(String adminName, String username, long phno) {
		super();
		this.adminName = adminName;
		this.username = username;
		this.phno = phno;
	}

	public Admin() {
		super();
	}

	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setPassword1(String encode) {
		// TODO Auto-generated method stub
		
	}

	public void setPassword(String encode) {
		// TODO Auto-generated method stub
		
	}

	public void setRoles(Set<Role> roles) {
		// TODO Auto-generated method stub
		
	}
	
	
	
}
