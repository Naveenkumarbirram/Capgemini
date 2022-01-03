package org.course;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Course_details")
public class Course 
{
    @Id
	private int courseID;
	private String CourseName;
	private double CoursePrice;
	private int courseDuration;
	public Course(int courseID, String courseName, double coursePrice, int courseDuration) {
		super();
		this.courseID = courseID;
		CourseName = courseName;
		CoursePrice = coursePrice;
		this.courseDuration = courseDuration;
	}
	public Course()
	{
		super();
	}
	public int getCourseID() {
		return courseID;
	}
	public void setCourseID(int courseID) {
		this.courseID = courseID;
	}
	public String getCourseName() {
		return CourseName;
	}
	public void setCourseName(String courseName) {
		CourseName = courseName;
	}
	public double getCoursePrice() {
		return CoursePrice;
	}
	public void setCoursePrice(double coursePrice) {
		CoursePrice = coursePrice;
	}
	public int getCourseDuration() {
		return courseDuration;
	}
	public void setCourseDuration(int courseDuration) {
		this.courseDuration = courseDuration;
	}
	@Override
	public String toString() {
		return "Course [courseID=" + courseID + ", CourseName=" + CourseName + ", CoursePrice=" + CoursePrice
				+ ", courseDuration=" + courseDuration + "]";
	}
	
	
}
