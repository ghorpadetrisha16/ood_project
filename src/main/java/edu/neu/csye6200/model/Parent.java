/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.neu.csye6200.model;

/**
 *
 * @author akshaykumthimatad
 */
public class Parent {
    
   private int parentId;
   private String parentName;
   private String parentAddress;
   private String parentPhoneNo;
   
   public Parent() {
        super();
	// TODO Auto-generated constructor stub
	}

    public Parent(int parentId, String parentName, String parentAddress, String parentPhoneNo) {
	super();
	this.parentId = parentId;
        this.parentName = parentName;
	this.parentAddress = parentAddress;
	this.parentPhoneNo = parentPhoneNo;
	}

    public int getParentId() {
	return parentId;
	}

    public void setParentId(int parentId) {
	this.parentId = parentId;
	}

    public String getParentName() {
	return parentName;
	}

    public void setParentName(String parentName) {
	this.parentName = parentName;
	}

    public String getParentAddress() {
	return parentAddress;
	}

    public void setParentAddress(String parentAddress) {
	this.parentAddress = parentAddress;
	}

    public String getParentPhoneNo() {
	return parentPhoneNo;
	}

    public void setParentPhoneNo(String parentPhoneNo) {
	this.parentPhoneNo = parentPhoneNo;
	}
	    
	   
	
	    
   
    
}
