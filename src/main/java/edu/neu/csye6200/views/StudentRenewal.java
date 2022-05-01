/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package edu.neu.csye6200.views;

import edu.neu.csye6200.DB;
import edu.neu.csye6200.controllers.RegistrationController;
import java.sql.ResultSet;
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
public class StudentRenewal extends javax.swing.JFrame {

    /**
     * Creates new form StudentRenewal
     */
    public StudentRenewal() throws SQLException {
        initComponents();
        tableShow2();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        studentID3 = new javax.swing.JTextField();
        studentName3 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        renew = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        studentID3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentID3ActionPerformed(evt);
            }
        });

        studentName3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentName3ActionPerformed(evt);
            }
        });

        jButton1.setText("Back");

        jLabel1.setText("Student ID");

        jLabel2.setText("Student Name");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][] {
                        { null, null, null, null },
                        { null, null, null, null },
                        { null, null, null, null },
                        { null, null, null, null }
                },
                new String[] {
                        "Student ID", "Student Name", "Joined Date", "Renewal Date"
                }));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        renew.setText("Renew");
        renew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                renewActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(25, 25, 25)
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING,
                                                                false)
                                                        .addComponent(jLabel1)
                                                        .addComponent(jLabel2)
                                                        .addComponent(studentID3, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                143, Short.MAX_VALUE)
                                                        .addComponent(studentName3)))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(14, 14, 14)
                                                .addComponent(jButton1)
                                                .addGap(34, 34, 34)
                                                .addComponent(renew)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56,
                                        Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 508,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap()));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(studentID3, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(studentName3, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButton1)
                                        .addComponent(renew))
                                .addGap(80, 80, 80))
                        .addGroup(layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(12, Short.MAX_VALUE)));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void studentID3ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_studentID3ActionPerformed
        // TODO add your handling code here:
        studentId = Integer.parseInt(studentID3.getText());
    }// GEN-LAST:event_studentID3ActionPerformed

    private void renewActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_renewActionPerformed
        // TODO add your handling code here:
        studentId = Integer.parseInt(studentID3.getText());
        studentName = studentName3.getText();

        // TODO: Controller code
        RegistrationController reg = new RegistrationController();
        reg.updateStudent(studentId);
        try {
            tableShow2();
        } catch (SQLException ex) {
            Logger.getLogger(StudentRenewal.class.getName()).log(Level.SEVERE, null, ex);
        }

    }// GEN-LAST:event_renewActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        DefaultTableModel df = (DefaultTableModel) jTable1.getModel();
        int selectedRow = jTable1.getSelectedRow();

        studentID3.setText(df.getValueAt(selectedRow, 0).toString());
        studentName3.setText(df.getValueAt(selectedRow, 1).toString());

    }// GEN-LAST:event_jTable1MouseClicked

    private void studentName3ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_studentName3ActionPerformed
        // TODO add your handling code here:
        studentName = studentName3.getText();

    }// GEN-LAST:event_studentName3ActionPerformed

    public void tableShow2() throws SQLException {
        DB db = DB.getObj();
        DefaultTableModel df = (DefaultTableModel) jTable1.getModel();
        df.setRowCount(0);
        ResultSet rs = db.query("SELECT r.student_id,s.name,r.created_date,r.renewal_date,r.years_member"
                + " FROM registration r,student s where s.student_id = r.student_id;");
        ResultSetMetaData rss = rs.getMetaData();
        int c = rss.getColumnCount();
        while (rs.next()) {
            Vector v = new Vector();
            for (int a = 1; a <= c; a++) {
                v.add(rs.getString("student_id"));
                v.add(rs.getString("name"));
                v.add(rs.getString("created_date"));
                v.add(rs.getString("renewal_date"));
                v.add(rs.getString("years_member"));

            }
            df.addRow(v);
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
        // (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the default
         * look and feel.
         * For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(StudentRenewal.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentRenewal.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentRenewal.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentRenewal.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        }
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new StudentRenewal().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(StudentRenewal.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    int studentId;
    String studentName;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton renew;
    private javax.swing.JTextField studentID3;
    private javax.swing.JTextField studentName3;
    // End of variables declaration//GEN-END:variables
}
