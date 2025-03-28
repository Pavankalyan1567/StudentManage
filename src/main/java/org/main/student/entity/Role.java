package org.main.student.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
public class Role {
	
	@Id
	private String roleName;

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public Role(String roleName) {
		super();
		this.roleName = roleName;
	}

	public Role() {
		super();
	}
	
	
}
