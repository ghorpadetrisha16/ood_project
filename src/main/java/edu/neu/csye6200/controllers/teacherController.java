/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.neu.csye6200.controllers;

import java.sql.*;
import edu.neu.csye6200.DB;
import edu.neu.csye6200.model.Teacher;
import edu.neu.csye6200.model.Teacher;
import java.util.*;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

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
    
    public ResultSet  viewTeachers() {

        
        
        try {
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            PreparedStatement stmt = conn.prepareStatement("select * from teacher");
            Vector columnNames = new Vector();
            Vector data = new Vector();
            ResultSet rs = stmt.executeQuery();
                JTable jtable = new JTable(buildTableModel(rs));
             JOptionPane.showMessageDialog(null, new JScrollPane(jtable));
           
             
        } catch (Exception e) {
            System.out.print(e.toString());
        }
           return null; 
        }

    public static DefaultTableModel buildTableModel(ResultSet rs)
        throws SQLException {

    ResultSetMetaData metaData = rs.getMetaData();

    // names of columns
    Vector<String> columnNames = new Vector<String>();
    int columnCount = metaData.getColumnCount();
    for (int column = 1; column <= columnCount; column++) {
        columnNames.add(metaData.getColumnName(column));
    }

    // data of the table
    Vector<Vector<Object>> data = new Vector<Vector<Object>>();
    while (rs.next()) {
        Vector<Object> vector = new Vector<Object>();
        for (int columnIndex = 1; columnIndex <= columnCount; columnIndex++) {
            vector.add(rs.getObject(columnIndex));
        }
        data.add(vector);
    }

    return new DefaultTableModel(data, columnNames);

}
    public void register(Teacher teacher) {

        try {
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            PreparedStatement stmt = conn.prepareStatement("Insert into teacher(fname,lname,emp_phone_no,emp_address) values(?,?,?,?)");
            stmt.setString(1, teacher.getFname());
            stmt.setString(2, teacher.getLname());
            stmt.setString(3, teacher.getPhoneNo());
            stmt.setString(4, teacher.getAddress());
            Boolean executed = stmt.execute();
            if (executed) {
                System.out.println("Error");
            } else {
                System.out.println("Record inserted");
            }
           
        } catch (Exception e) {
            System.out.print(e.toString());
        }
    }
    
    
    
   
}
