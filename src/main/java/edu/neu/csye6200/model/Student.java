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
    
    private int StudentId;
    private String StudentName;
    private int Age;
    private String DateofBirth;
    private double Gpa;
    
    public Student(int studentId, String studentName, int age, String dateofBirth, double gpa) {
			super();
			StudentId = studentId;
			StudentName = studentName;
			Age = age;
			DateofBirth = dateofBirth;
			Gpa = gpa;
		}

    public Student() {
	super();
	// TODO Auto-generated constructor stub
		}
   
    public int getStudentId() {
	return StudentId;
		}

    public void setStudentId(int studentId) {
	StudentId = studentId;
		}

    public String getStudentName() {
	return StudentName;
		}

    public void setStudentName(String studentName) {
	StudentName = studentName;
		}

   public int getAge() {
	return Age;
		}

    public void setAge(int age) {
	Age = age;
		}

    public String getDateofBirth() {
	return DateofBirth;
		}

    public void setDateofBirth(String dateofBirth) {
	DateofBirth = dateofBirth;
		}

    public double getGpa() {
	return Gpa;
		}

    public void setGpa(double gpa) {
	Gpa = gpa;
		}
	   
}
