/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.neu.csye6200;

import java.sql.*;

/**
 * DB Class - to connect and query from the database.
 * 
 * <code> 
 * db = DB.getObj();                // gives instance of DB
 * db.query("query-statement");     // gives resultant set
 * </code>
 * 
 * @author eswar
 */
public class DB {
        static final String DB_URL = "jdbc:mysql://sql773.main-hosting.eu/u625234325_ood_proj";
        static final String USER = "u625234325_ood_proj";
        static final String PASS = "Northeastern@4126";
        private Connection conn;
        private Statement statement;

        public static DB db;

         DB() {
                createConnection();
        }

        /**
         * Connect to database
         */
        private void createConnection() {
                try {
                    
                        conn = DriverManager.getConnection(DB_URL, USER, PASS);
                        statement = conn.createStatement();

                } catch (SQLException e) {
                        System.out.print(e.toString());
                }
        }

        /**
         * Query database
         * 
         * @param queryStatement
         * @return
         */
        public ResultSet query(String queryStatement) {
                try {
                        ResultSet rs = statement.executeQuery(queryStatement);
                        return rs;
                } catch (Exception e) {
                        System.out.print(e.toString());
                        return null;
                }
        }

        /**
         * Singleton method to get instance
         * 
         * @return
         */
        public static DB getObj() {
                if (db == null) {
                        db = new DB();
                }
                return db;
        }

}