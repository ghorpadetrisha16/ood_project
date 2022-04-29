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

}
