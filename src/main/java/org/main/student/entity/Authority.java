package org.main.student.entity;

import org.springframework.security.core.GrantedAuthority;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Authority implements GrantedAuthority{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String authority;

	public Authority(String string) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getAuthority() {
		// TODO Auto-generated method stub
		return this.authority;
	}
}
