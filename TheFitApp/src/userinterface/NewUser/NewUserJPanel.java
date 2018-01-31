/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.NewUser;

import Business.NewUser.NewUser;
import Business.NewUser.CustomerDirectory;
import java.util.Arrays;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author keyur_donga
 */
public class NewUserJPanel extends javax.swing.JPanel {
    
    private JPanel container;
    private CustomerDirectory cd;
    /**
     * Creates new form NewUserJPanel
     */
    public NewUserJPanel(JPanel container, CustomerDirectory cd) {
        initComponents();
        this.container = container;
        this.cd = cd;
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
        enterpriseLabel = new javax.swing.JLabel();
        enterpriseLabel1 = new javax.swing.JLabel();
        enterpriseLabel2 = new javax.swing.JLabel();
        enterpriseLabel3 = new javax.swing.JLabel();
        txtSex = new javax.swing.JTextField();
        txtFName = new javax.swing.JTextField();
        txtDOB = new javax.swing.JTextField();
        txtLName = new javax.swing.JTextField();
        enterpriseLabel4 = new javax.swing.JLabel();
        enterpriseLabel5 = new javax.swing.JLabel();
        txtWeight = new javax.swing.JTextField();
        txtHeight = new javax.swing.JTextField();
        enterpriseLabel6 = new javax.swing.JLabel();
        enterpriseLabel7 = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();
        txtPassword = new javax.swing.JPasswordField();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Create a New Account");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 30, 280, -1));

        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        enterpriseLabel.setText("DOB (mm/dd/yyyy) :");
        add(enterpriseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 180, 30));

        enterpriseLabel1.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        enterpriseLabel1.setText("Last Name :");
        add(enterpriseLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 110, 120, 30));

        enterpriseLabel2.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        enterpriseLabel2.setText("Sex :");
        add(enterpriseLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 170, 50, 30));

        enterpriseLabel3.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        enterpriseLabel3.setText("First Name :");
        add(enterpriseLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, 120, 30));

        txtSex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSexActionPerformed(evt);
            }
        });
        add(txtSex, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 170, 130, 30));
        add(txtFName, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 110, 130, 30));
        add(txtDOB, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 170, 130, 30));
        add(txtLName, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 110, 130, 30));

        enterpriseLabel4.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        enterpriseLabel4.setText("Height (cm) :");
        add(enterpriseLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 230, 120, 30));

        enterpriseLabel5.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        enterpriseLabel5.setText("Weight (kg) :");
        add(enterpriseLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 230, 120, 30));
        add(txtWeight, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 230, 130, 30));

        txtHeight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHeightActionPerformed(evt);
            }
        });
        add(txtHeight, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 230, 130, 30));

        enterpriseLabel6.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        enterpriseLabel6.setText("Password :");
        add(enterpriseLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 320, 120, 30));

        enterpriseLabel7.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        enterpriseLabel7.setText("UserName :");
        add(enterpriseLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 320, 120, 30));
        add(txtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 320, 130, 30));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 750, 10));

        jButton1.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jButton1.setText("Create Account");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 400, 180, 30));
        add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 320, 130, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        char[] passwordCharArray = txtPassword.getPassword();
        String password = String.valueOf(passwordCharArray);
        
        NewUser nu = new NewUser();
        nu.setDob(txtDOB.getText());
        nu.setHeight(txtHeight.getText());
        nu.setPassword(password);
        nu.setSex(txtSex.getText());
        nu.setUsername(txtUsername.getText());
        nu.setWeight(txtWeight.getText());
        nu.setfName(txtFName.getText());
        nu.setlName(txtLName.getText());
        cd.getEmployeeList().add(nu);
        System.out.println(cd.getEmployeeList().size());
        
        JOptionPane.showMessageDialog(null, "Account created Successfully. Login to your account for personalization", "Information", JOptionPane.INFORMATION_MESSAGE);
        
        txtDOB.setText("");
        txtFName.setText("");
        txtHeight.setText("");
        txtLName.setText("");
        txtPassword.setText("");
        txtSex.setText("");
        txtUsername.setText("");
        txtWeight.setText("");
                
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtHeightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHeightActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHeightActionPerformed

    private void txtSexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSexActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSexActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel enterpriseLabel1;
    private javax.swing.JLabel enterpriseLabel2;
    private javax.swing.JLabel enterpriseLabel3;
    private javax.swing.JLabel enterpriseLabel4;
    private javax.swing.JLabel enterpriseLabel5;
    private javax.swing.JLabel enterpriseLabel6;
    private javax.swing.JLabel enterpriseLabel7;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField txtDOB;
    private javax.swing.JTextField txtFName;
    private javax.swing.JTextField txtHeight;
    private javax.swing.JTextField txtLName;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtSex;
    private javax.swing.JTextField txtUsername;
    private javax.swing.JTextField txtWeight;
    // End of variables declaration//GEN-END:variables
}