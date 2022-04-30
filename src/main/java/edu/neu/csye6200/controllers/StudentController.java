/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.neu.csye6200.controllers;

import java.sql.Date;
import java.time.Period;
import java.util.Currency;

import edu.neu.csye6200.DB;
import edu.neu.csye6200.model.Parent;
import edu.neu.csye6200.model.Student;
import java.sql.PreparedStatement;
import java.time.LocalDate;

/**
 *
 * @author eswar
 */
public class StudentController {

    private static StudentController studentController;

    private int getAgeFromDOB(Date dob) {
        return Period.between(dob.toLocalDate(), new Date(System.currentTimeMillis()).toLocalDate()).getYears();
    }

    public void addStudentAndParent(String name, Date dob, String parentName, String parentPhone,
            String parentAddress) {

        DB db = DB.getObj();

        int age = getAgeFromDOB(dob);
        // create student obj
        Student s = new Student(name, dob.toString(), age);
        db.update(s.generateRegisterQuery());
        int studentId = db.getGeneratedKey();

        s.setStudentId(studentId);

        Parent p = new Parent(parentName, parentAddress, parentPhone);
        p.setStudent_id(studentId);
        db.update(p.generateRegisterQuery());

    }

    public static StudentController getObj() {
        if (studentController == null) {
            studentController = new StudentController();
        }
        return studentController;
    }
    
    public void updateStudentAndParent(int studentId, String studentName, String dateofBirth, double gpa,
            int parentId, String parentName, String parentAddress, String parentPhoneNo) throws InterruptedException{
        
        DB db = DB.getObj();
        
        Student s = new Student(studentId, studentName, dateofBirth, gpa);
        Parent p = new Parent(parentId,parentName, parentAddress, parentPhoneNo);
        
        Date dob = Date.valueOf(dateofBirth);
        
        int age = getAgeFromDOB(dob);
        
        s.setAge(age);
        
        db.update(s.updateStudentTable());
        Thread.sleep(200);
        db.update(p.updateParentTable()); 
        
         
        
    }
    
    public void showStudentAndParentTable(int studentId, String studentName, String dateofBirth, double gpa,
            int parentId, String parentName, String parentAddress, String parentPhoneNo){
        
        DB db = DB.getObj();
        
        Student s = new Student(studentId, studentName, dateofBirth, gpa);
        Parent p = new Parent(parentId,parentName, parentAddress, parentPhoneNo);
        
        Date dob = Date.valueOf(dateofBirth);
        
        int age = getAgeFromDOB(dob);
        
        s.setAge(age);
        
        db.query(s.showStudentTable());
        
//        PreparedStatement insert = 
//        ResultSetMetaData rss = 
        
        
    }
     

}
