package org.main.student.service;

import org.main.student.entity.Address;
import org.main.student.entity.Courses;
import org.main.student.entity.Student;
import org.main.student.stddto.StudentDTO;

public interface StudentService {
	

	String removeCourse(String stdCode, String courseName) throws Exception;
	
	String updateAddressByType(String stdCode, String typeOfAddress, Address address) throws Exception;
	
	StudentDTO updateStudent(String stdCode, Student student);
	
	Courses searchCourse(String courseName) throws Exception;
	
}
