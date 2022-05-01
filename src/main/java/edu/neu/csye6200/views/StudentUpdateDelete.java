/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package edu.neu.csye6200.views;

import java.sql.ResultSet;
import edu.neu.csye6200.DB;
import edu.neu.csye6200.controllers.StudentController;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author akshaykumthimatad
 */
public class

StudentUpdateDelete extends javax.swing.JFrame {

    /**
     * Creates new form StudentUpdateDelete
     */
    public StudentUpdateDelete() throws SQLException {
        initComponents();
        tableShow();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        studentID = new javax.swing.JTextField();
        Update = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        studentNameee = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        gpa2 = new javax.swing.JTextField();
        Back = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        parentID = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        parentName2 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        parentAddress2 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        parentPhoneNum = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        dob = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Student ID");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Student ID", "Student Name", "Age", "Date of Birth", "GPA", "Parent ID", "Parent Name", "Address", "Phone Number"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(50);
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(120);
            jTable1.getColumnModel().getColumn(2).setPreferredWidth(20);
            jTable1.getColumnModel().getColumn(4).setPreferredWidth(25);
            jTable1.getColumnModel().getColumn(5).setPreferredWidth(40);
        }

        studentID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentIDActionPerformed(evt);
            }
        });

        Update.setText("Update");
        Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateActionPerformed(evt);
            }
        });

        jLabel2.setText("Student Name");

        studentNameee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentNameeeActionPerformed(evt);
            }
        });

        jLabel3.setText("GPA");

        gpa2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gpa2ActionPerformed(evt);
            }
        });

        Back.setText("Back");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });

        jLabel4.setText("Parent ID");

        parentID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                parentIDActionPerformed(evt);
            }
        });

        jLabel5.setText("Parent Name");

        parentName2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                parentName2ActionPerformed(evt);
            }
        });

        jLabel6.setText("Parent Address");

        parentAddress2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                parentAddress2ActionPerformed(evt);
            }
        });

        jLabel7.setText("Parent Phone Number");

        parentPhoneNum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                parentPhoneNumActionPerformed(evt);
            }
        });

        jLabel8.setText("Date of Birth");

        dob.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dobActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(studentID, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(studentNameee, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dob, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(Back)
                        .addGap(18, 18, 18)
                        .addComponent(Update))
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(parentID, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(parentName2, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(parentAddress2, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(parentPhoneNum, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(gpa2, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 950, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(studentID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(studentNameee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(gpa2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(parentID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(parentName2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(parentAddress2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(parentPhoneNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Update)
                            .addComponent(Back))
                        .addContainerGap(113, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void studentIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentIDActionPerformed
        // TODO add your handling code here:
        studentId=Integer.parseInt(studentID.getText());
        
    }//GEN-LAST:event_studentIDActionPerformed

    private void parentAddress2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_parentAddress2ActionPerformed
        // TODO add your handling code here:
        parentAddress=parentAddress2.getText();
    }//GEN-LAST:event_parentAddress2ActionPerformed

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BackActionPerformed

    private void parentPhoneNumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_parentPhoneNumActionPerformed
        // TODO add your handling code here:
        parentPhoneNo=parentPhoneNum.getText();
    }//GEN-LAST:event_parentPhoneNumActionPerformed

    private void UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateActionPerformed
        // TODO add your handling code here:
        studentName = studentNameee.getText();
        studentId=Integer.parseInt(studentID.getText());
        gpa = Double.parseDouble(gpa2.getText());
        dateofBirth = dob.getText();
        parentId=Integer.parseInt(parentID.getText());
        parentName=parentName2.getText();
        parentAddress=parentAddress2.getText();
        parentPhoneNo=parentPhoneNum.getText();
        
        
    
        StudentController std = new StudentController();
        try {
            std.updateStudentAndParent(studentId, studentName, dateofBirth, gpa,
                    parentId, parentName, parentAddress, parentPhoneNo);
            tableShow();
        } catch (InterruptedException ex) {
            Logger.getLogger(StudentUpdateDelete.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(StudentUpdateDelete.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
    }//GEN-LAST:event_UpdateActionPerformed

    private void studentNameeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentNameeeActionPerformed
        // TODO add your handling code here:
        studentName = studentNameee.getText();
        
    }//GEN-LAST:event_studentNameeeActionPerformed

    private void gpa2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gpa2ActionPerformed
        // TODO add your handling code here:
        gpa = Double.parseDouble(gpa2.getText());
    }//GEN-LAST:event_gpa2ActionPerformed

    private void dobActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dobActionPerformed
        // TODO add your handling code here:
        dateofBirth = dob.getText();
    }//GEN-LAST:event_dobActionPerformed

    private void parentIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_parentIDActionPerformed
        // TODO add your handling code here:
        parentId=Integer.parseInt(parentID.getText());
    }//GEN-LAST:event_parentIDActionPerformed

    private void parentName2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_parentName2ActionPerformed
        // TODO add your handling code here:
        parentName=parentName2.getText();
    }//GEN-LAST:event_parentName2ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
         DefaultTableModel df = (DefaultTableModel) jTable1.getModel();
         int selectedRow = jTable1.getSelectedRow();
         
         studentID.setText(df.getValueAt(selectedRow,0).toString());
         studentNameee.setText(df.getValueAt(selectedRow,1).toString());
         dob.setText(df.getValueAt(selectedRow,3).toString());
         gpa2.setText(df.getValueAt(selectedRow,4).toString());
         parentID.setText(df.getValueAt(selectedRow,5).toString());
         parentName2.setText(df.getValueAt(selectedRow,6).toString());
         parentAddress2.setText(df.getValueAt(selectedRow,7).toString());
         parentPhoneNum.setText(df.getValueAt(selectedRow,8).toString());
         
         
    }//GEN-LAST:event_jTable1MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(StudentUpdateDelete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentUpdateDelete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentUpdateDelete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentUpdateDelete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new StudentUpdateDelete().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(StudentUpdateDelete.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    
    public void tableShow() throws SQLException{
         DB db = DB.getObj();
        DefaultTableModel df = (DefaultTableModel) jTable1.getModel();
        df.setRowCount(0);
        ResultSet rs = db.query("SELECT s.student_id,s.name,s.age,s.dob,s.gpa,s.parent_id,p.p_name,p.address,p.phone "
                    + " FROM student s,parent p;");
        ResultSetMetaData rss = rs.getMetaData();
        int c = rss.getColumnCount();
        while(rs.next()){
            Vector v = new Vector();
            for (int a=1;a<=c;a++){
                v.add(rs.getString("student_id"));
                v.add(rs.getString("name"));
                v.add(rs.getString("age"));
                v.add(rs.getString("dob"));
                v.add(rs.getString("gpa"));
                v.add(rs.getString("parent_id"));
                v.add(rs.getString("p_name"));
                v.add(rs.getString("address"));
                v.add(rs.getString("phone"));    
            }
            df.addRow(v);
        }
    }
    
    int studentId;
    String studentName;
    String dateofBirth;
    double gpa;
    int parentId; 
    String parentName;
    String parentAddress;
    String parentPhoneNo;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JButton Update;
    private javax.swing.JTextField dob;
    private javax.swing.JTextField gpa2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField parentAddress2;
    private javax.swing.JTextField parentID;
    private javax.swing.JTextField parentName2;
    private javax.swing.JTextField parentPhoneNum;
    private javax.swing.JTextField studentID;
    private javax.swing.JTextField studentNameee;
    // End of variables declaration//GEN-END:variables
}
