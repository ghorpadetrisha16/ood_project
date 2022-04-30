/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.neu.csye6200.controllers;

import java.sql.*;
import edu.neu.csye6200.DB;
import edu.neu.csye6200.model.Teacher;

/**
 *
 * @author eswar
 */
public class teacherController {

    final String DB_URL = "jdbc:mysql://sql773.main-hosting.eu/u625234325_ood_proj";
    final String USER = "u625234325_ood_proj";
    final String PASS = "Northeastern@4126";
    private Boolean teacherFlag=false;

    public teacherController() {
    }
    
    public Boolean getTeacherFlag() {
        return teacherFlag;
    }

    public void setTeacherFlag(Boolean teacherFlag) {
        this.teacherFlag = teacherFlag;
    }
    
    public void viewTeachers() {

        
        
    }

    public void register(Teacher teacher) {

        try {
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            PreparedStatement stmt = conn.prepareStatement("Insert into employee(fname,lname,emp_phone_no,emp_address) values(?,?,?,?)");
            stmt.setString(1, teacher.getFname());
            stmt.setString(2, teacher.getLname());
            stmt.setString(3, teacher.getPhone());
            stmt.setString(4, teacher.getAddress());
            Boolean executed = stmt.execute();
            if (executed) {
                System.out.println("Error");
            } else {
                System.out.println("Record inserted");
            }
            stmt = conn.prepareStatement("Insert into teacher(fname,lname,emp_phone_no,emp_address) values(?,?,?,?)");
        } catch (Exception e) {
            System.out.print(e.toString());
        }
    }
    
    public void insertTeacher(Teacher teacher)
    {
        try {
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            PreparedStatement stmt = conn.prepareStatement("Insert into teacher(employee_id,credits,class_id) values(?,?,?)");
            stmt.setString(1, teacher.getId());
            stmt.setString(2, teacher.getCredits());
            stmt.setString(3,teacher.);
            Boolean executed = stmt.execute();
            if (executed) {
                System.out.println("Error");
            } else {
                System.out.println("Record inserted");
            }
            stmt = conn.prepareStatement("Insert into teacher(fname,lname,emp_phone_no,emp_address) values(?,?,?,?)");
        } catch (Exception e) {
            System.out.print(e.toString());
        }
        
    }
}
