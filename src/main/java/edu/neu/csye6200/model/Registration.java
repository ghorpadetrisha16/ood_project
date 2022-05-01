package edu.neu.csye6200.model;

import java.util.Date;

public class Registration {
    private int student_id;
    private Date registeredDate;
    private Date renewalDate;
    private int yearsMember;

    Registration() {
        super();
    }

    public Registration(int student_id, Date registeredDate, Date renewalDate, int yearsMember) {
        this.student_id = student_id;
        this.registeredDate = registeredDate;
        this.renewalDate = renewalDate;
        this.yearsMember = yearsMember;
    }

    public int getStudent_id() {
        return student_id;
    }

    public void setStudent_id(int student_id) {
        this.student_id = student_id;
    }

    public Date getRegisteredDate() {
        return registeredDate;
    }

    public void setRegisteredDate(Date registeredDate) {
        this.registeredDate = registeredDate;
    }

    public Date getRenewalDate() {
        return renewalDate;
    }

    public void setRenewalDate(Date renewalDate) {
        this.renewalDate = renewalDate;
    }

    public int getYearsMember() {
        return yearsMember;
    }

    public void setYearsMember(int yearsMember) {
        this.yearsMember = yearsMember;
    }

}
