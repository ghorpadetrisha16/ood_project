/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.neu.csye6200.model;

/**
 *
 * @author Tarun
 */
public class Teacher extends Employee {
    private int credits;
    private int classId;

    public Teacher(int employeeId, String name, String address, String phoneNo, Double rating, int credits, int classId) {
        super(employeeId, name, address, phoneNo, rating);
        this.credits = credits;
        this.classId = classId;
    }

    public int getCredits() {
        return credits;
    }

    public int getClassId() {
        return classId;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public void setClassId(int classId) {
        this.classId = classId;
    }
}
