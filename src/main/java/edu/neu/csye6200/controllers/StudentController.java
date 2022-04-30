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
import java.time.LocalDate;

/**
 *
 * @author eswar
 */
public class StudentController {

    private static StudentController studentController;

    private int getAgeFromDOB(LocalDate dob) {
        return Period.between(dob, new Date(System.currentTimeMillis()).toLocalDate()).getYears();
    }

    public void addStudentAndParent(String name, String dob, String parentName, String parentPhone,
            String parentAddress) {

        DB db = DB.getObj();

        LocalDate dobFromString = LocalDate.parse(dob);

        int age = getAgeFromDOB(dobFromString);
        // create student obj
        Student s = new Student(name, dobFromString.toString(), age);
        Parent p = new Parent(parentName, parentAddress, parentPhone);

        db.query(p.generateRegisterQuery());
        int parentId = db.getGeneratedKey();

        s.setParentId(parentId);

        db.query(s.generateRegisterQuery());

    }

    public static StudentController getObj() {
        if (studentController == null) {
            studentController = new StudentController();
        }
        return studentController;
    }

}
