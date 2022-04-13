/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.neu.csye6200.model;

/**
 *
 * @author eswar
 */
public class Student {
    
    private int studentId;
    private String studentName;
    private int age;
    private String dateofBirth;
    private double gpa;
    
    public Student(int studentId, String studentName, int age, String dateofBirth, double gpa) {
			super();
			this.studentId = studentId;
			this.studentName = studentName;
			this.age = age;
			this.dateofBirth = dateofBirth;
			this.gpa = gpa;
		}

    public Student() {
	super();
	// TODO Auto-generated constructor stub
		}
   
    public int getStudentId() {
	return studentId;
		}

    public void setStudentId(int studentId) {
	this.studentId = studentId;
		}

    public String getStudentName() {
	return studentName;
		}

    public void setStudentName(String studentName) {
	this.studentName = studentName;
		}

   public int getAge() {
	return age;
		}

    public void setAge(int age) {
	this.age = age;
		}

    public String getDateofBirth() {
	return dateofBirth;
		}

    public void setDateofBirth(String dateofBirth) {
	this.dateofBirth = dateofBirth;
		}

    public double getGpa() {
	return gpa;
		}

    public void setGpa(double gpa) {
	this.gpa = gpa;
		}
	   
}
