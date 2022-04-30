/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.neu.csye6200.controllers;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
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
        try {

            DB db = DB.getObj();

            LocalDate dobFromString = LocalDate.parse(dob);

            int age = getAgeFromDOB(dobFromString);
            // create student obj
            Student s = new Student(name, dobFromString.toString(), age);
            Parent p = new Parent(parentName, parentAddress, parentPhone);

            PreparedStatement statement = db.conn.prepareStatement(p.generateRegisterQuery(),
                    Statement.RETURN_GENERATED_KEYS);
            statement.setString(1, p.getParentName());
            statement.setString(2, p.getParentAddress());
            statement.setString(3, p.getParentPhoneNo());

            int affectedRows = statement.executeUpdate();
            if (affectedRows == 0) {
                throw new Exception("Creating user failed, no rows affected.");
            }

            int parentId = -1;
            try (ResultSet rs = statement.getGeneratedKeys()) {
                if (rs.next()) {
                    parentId = rs.getInt(1);
                }
                rs.close();
            }
            // db.query(p.generateRegisterQuery());
            // int parentId = db.getGeneratedKey();

            s.setParentId(parentId);

            statement = db.conn.prepareStatement(s.generateRegisterQuery());
            statement.setString(1, s.getStudentName());
            statement.setString(2, s.getDateofBirth());
            statement.setInt(3, s.getAge());
            statement.setInt(4, s.getParentId());

            statement.executeUpdate();

            // db.query(s.generateRegisterQuery());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static StudentController getObj() {
        if (studentController == null) {
            studentController = new StudentController();
        }
        return studentController;
    }

}
