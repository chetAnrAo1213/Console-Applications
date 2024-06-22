package com.Hibernate.App;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Student_App")
public class Student_POJO {

	@Id
	@Column(name="S_RollNo")
	String Student_RollNo;
	
	@Column(name="S_Name")
	String Student_Name;
	
	@Column(name="S_Section")
	String Student_Section;
	
	@Column(name="S_Class")
	String Student_Class;
	
	public Student_POJO() 
	{
		super();
	}

	public Student_POJO(String student_RollNo, String student_Name, String student_Section, String student_Class) {
		super();
		Student_RollNo = student_RollNo;
		Student_Name = student_Name;
		Student_Section = student_Section;
		Student_Class = student_Class;
	}

	public String getStudent_RollNo() {
		return Student_RollNo;
	}

	public void setStudent_RollNo(String student_RollNo) {
		Student_RollNo = student_RollNo;
	}

	public String getStudent_Name() {
		return Student_Name;
	}

	public void setStudent_Name(String student_Name) {
		Student_Name = student_Name;
	}

	public String getStudent_Section() {
		return Student_Section;
	}

	public void setStudent_Section(String student_Section) {
		Student_Section = student_Section;
	}

	public String getStudent_Class() {
		return Student_Class;
	}

	public void setStudent_Class(String student_Class) {
		Student_Class = student_Class;
	}

	@Override
	public String toString() {
		return "Student_POJO [Student_RollNo=" + Student_RollNo + ", Student_Name=" + Student_Name
				+ ", Student_Section=" + Student_Section + ", Student_Class=" + Student_Class + "]";
	}

	
}
