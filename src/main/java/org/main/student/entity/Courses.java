package org.main.student.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
public class Courses {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String courseName;
	private String courseType;
	private String duration;
	private String topics;
	private String description;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getCourseType() {
		return courseType;
	}
	public void setTypeOfCourse(String typeOfCourse) {
		this.courseType = typeOfCourse;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	public String getTopics() {
		return topics;
	}
	public void setTopics(String topics) {
		this.topics = topics;
	}
	public Courses(long id, String courseName, String typeOfCourse, String description, String duration,
			String topics) {
		super();
		this.id = id;
		this.courseName = courseName;
		this.courseType = typeOfCourse;
		this.description = description;
		this.duration = duration;
		this.topics = topics;
	}
	public Courses() {
		super();
	}
	
	
}
