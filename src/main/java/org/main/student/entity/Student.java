package org.main.student.entity;

import java.util.List;
import java.util.Optional;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;

@Entity
public class Student extends User {

	private String studentName;
	private String fatherName;
	private String motherName;
	private String email;
	private String dob;
	private String gender;
	private String studentCode;
	private long phno;

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "student")
	private List<Address> addresses;

	@ManyToMany
	@JoinTable(name = "Student_Courses", joinColumns = { @JoinColumn(name = "Student_Code") }, inverseJoinColumns = {
			@JoinColumn(name = "Course_Name") })
	private List<Courses> courses;

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return this.studentCode;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
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

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
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

	public long getPhno() {
		return phno;
	}

	public void setPhno(long phno) {
		this.phno = phno;
	}

	public List<Address> getAddresses() {
		return addresses;
	}

	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}

	public List<Courses> getCourses() {
		return courses;
	}

	public void setCourses(List<Courses> courses) {
		this.courses = courses;
	}

	public Student(long userId, String password, String studentName, String fatherName, String motherName, String email,
			String dob, String gender, String studentCode, long phno, List<Address> addresses, List<Courses> courses) {
		
		this.studentName = studentName;
		this.fatherName = fatherName;
		this.motherName = motherName;
		this.email = email;
		this.dob = dob;
		this.gender = gender;
		this.studentCode = studentCode;
		this.phno = phno;
		this.addresses = addresses;
		this.courses = courses;
	}

	public Student() {
		super();
	}

	
}
