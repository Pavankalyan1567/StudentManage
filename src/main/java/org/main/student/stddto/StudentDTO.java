package org.main.student.stddto;

import java.util.List;

import org.main.student.entity.Address;
import org.main.student.entity.Courses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentDTO {

	private String nameofstudent;  
	private String dofb;
	private String gender;
	private String studentCode;
	private String fatherName;
	private String motherName;
	private String email;
	private long phNo;
	public String getNameofstudent() {
		return nameofstudent;
	}
	public void setNameofstudent(String nameofstudent) {
		this.nameofstudent = nameofstudent;
	}
	public String getDofb() {
		return dofb;
	}
	public void setDofb(String dofb) {
		this.dofb = dofb;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getStudentCode() {
		return studentCode;
	}
	public void setStudentCode(String studentCode) {
		this.studentCode = studentCode;
	}
	public String getFatherName() {
		return fatherName;
	}
	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}
	public String getMotherName() {
		return motherName;
	}
	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getPhNo() {
		return phNo;
	}
	public void setPhNo(long phNo) {
		this.phNo = phNo;
	}
	public StudentDTO(String nameofstudent, String dofb, String gender, String studentCode, String fatherName,
			String motherName, String email, long phNo) {
		super();
		this.nameofstudent = nameofstudent;
		this.dofb = dofb;
		this.gender = gender;
		this.studentCode = studentCode;
		this.fatherName = fatherName;
		this.motherName = motherName;
		this.email = email;
		this.phNo = phNo;
	}
	public StudentDTO() {
		super();
	}
	
	private List<Address> addresses;
	private List<Courses> courses;
	
	
}
