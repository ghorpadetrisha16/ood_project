/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.neu.csye6200;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author eswar
 */
public class DB {
   static final String DB_URL = "jdbc:mysql://sql209.main-hosting.eu/u625234325_ood_proj";
   static final String USER = "u625234325_ood_proj";
   static final String PASS = "Northeastern@4126";
   
   public static Connection getConnection() throws SQLException{
      
           Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
           return conn;
       
   }
    
}
