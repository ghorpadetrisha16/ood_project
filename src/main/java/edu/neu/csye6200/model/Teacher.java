/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.neu.csye6200.model;

/**
 *
 * @author Tarun
 */
public class Employee {
    
    protected int employeeId;
    protected String name;
    protected String address;
    protected String phoneNo;
    protected Double rating;

    public Employee(int employeeId, String name, String address, String phoneNo, Double rating) {
        this.employeeId = employeeId;
        this.name = name;
        this.address = address;
        this.phoneNo = phoneNo;
        this.rating = rating;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public Double getRating() {
        return rating;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }
}
