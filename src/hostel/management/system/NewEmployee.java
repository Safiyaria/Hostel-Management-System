/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hostel.management.system;

import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/**
 *
 * @author USER
 */
public class NewEmployee extends javax.swing.JFrame {

    public void clear() {
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        jTextField4.setText("");
        jTextField5.setText("");
        jTextField7.setText("");
        jTextField8.setText("");
        jTextField9.setText("");

    }

    /**
     * Creates new form NewEmployee
     */
    public NewEmployee() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(480, 150));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("Cancel");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(592, 24, -1, -1));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setText("Name");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(97, 76, -1, -1));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("Employee Id( Unique Id )");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(97, 115, -1, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setText("NID");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(97, 158, -1, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setText("Address");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(97, 197, -1, -1));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setText("Email-Id");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(97, 230, -1, -1));

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setText("Phone Number");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(97, 265, -1, -1));

        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setText("Joining Date");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 300, -1, -1));

        jLabel9.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel9.setText("Salary");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 330, -1, -1));

        jTextField1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(397, 68, 270, -1));

        jTextField2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(397, 111, 270, -1));

        jTextField3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(397, 154, 270, -1));

        jTextField4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(397, 189, 270, -1));

        jTextField5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(397, 226, 270, -1));

        jTextField7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(397, 257, 270, -1));

        jTextField8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jTextField8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField8ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(397, 294, 270, -1));

        jTextField9.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        getContentPane().add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(397, 331, 270, -1));

        jLabel10.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel10.setText("Post");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 370, -1, -1));

        jComboBox1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Manager", "Cleaner", "Cook", "Guard", "Laundry" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(397, 368, 270, -1));

        jButton2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton2.setText("Save");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(397, 423, -1, -1));

        jButton3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton3.setText("Clear");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(582, 423, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField7ActionPerformed

    private void jTextField8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField8ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String name = jTextField1.getText();
        String employeeId = jTextField2.getText();
        String nid = jTextField3.getText();
        String address = jTextField4.getText();
        String emailId = jTextField5.getText();
        String phoneNumber = jTextField7.getText();
        String salary = jTextField9.getText();
        String post = (String) jComboBox1.getSelectedItem();
        String status = "Working";
        try {
            String sql = "Insert into employee(Name,EmployeeId,NID,Address,EmailId,PhoneNumber,Salary,Post) values(?,?,?,?,?,?,?,?)";
            dbconnect q = new dbconnect();
            q.connectToDB();
            PreparedStatement ps = q.getStatement(sql);
            ps.setString(1, name);
            ps.setString(2, employeeId);
            ps.setString(3, nid);
            ps.setString(4, address);
            ps.setString(5, emailId);
            ps.setString(6, phoneNumber);
            ps.setString(7, salary);
            ps.setString(8, post);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Successfully Updated");
            clear();
            q.disconnectFromDB();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        clear();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

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
            java.util.logging.Logger.getLogger(NewEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewEmployee().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
