package org.main.student.service;

import java.util.List;

import org.main.student.entity.Admin;
import org.main.student.entity.Courses;
import org.main.student.entity.Student;

public interface AdminService {

	void addRoles();

	List<Student> getStudentsByName(String name);

	List<Student> getStudentsByCourse(String courseName);

	Admin addAdmin(Admin admin);

	Student addStudent(Student student);

	Courses addCourses(Courses courses);

	Student assignCourses(String stdId, String courseName) throws Exception;

}
