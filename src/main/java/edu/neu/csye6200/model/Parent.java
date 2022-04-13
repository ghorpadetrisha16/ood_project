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
    
   private int ParentId;
   private String ParentName;
   private String ParentAddress;
   private String ParentPhoneNo;
   
   public Parent() {
        super();
	// TODO Auto-generated constructor stub
	}

    public Parent(int parentId, String parentName, String parentAddress, String parentPhoneNo) {
	super();
	ParentId = parentId;
        ParentName = parentName;
	ParentAddress = parentAddress;
	ParentPhoneNo = parentPhoneNo;
	}

    public int getParentId() {
	return ParentId;
	}

    public void setParentId(int parentId) {
	ParentId = parentId;
	}

    public String getParentName() {
	return ParentName;
	}

    public void setParentName(String parentName) {
	ParentName = parentName;
	}

    public String getParentAddress() {
	return ParentAddress;
	}

    public void setParentAddress(String parentAddress) {
	ParentAddress = parentAddress;
	}

    public String getParentPhoneNo() {
	return ParentPhoneNo;
	}

    public void setParentPhoneNo(String parentPhoneNo) {
	ParentPhoneNo = parentPhoneNo;
	}
	    
	   
	
	    
   
    
}
