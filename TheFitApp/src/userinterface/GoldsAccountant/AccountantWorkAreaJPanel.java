/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.GoldsAccountant;

import Business.EcoSystem;
import Business.Organization.Organization;
import java.awt.CardLayout;
import javax.swing.JPanel;


/**
 *
 * @author keyur_donga
 */
public class AccountantWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form AccountantWorkAreaJPanel
     */
    JPanel userProcessContainer;
    Organization organization;
    EcoSystem system;
    public AccountantWorkAreaJPanel(JPanel userProcessContainer, Organization organization, EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;   
        this.organization = organization;
        this.system = system;
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
        valueLabel = new javax.swing.JLabel();
        enterpriseLabel1 = new javax.swing.JLabel();
        enterpriseLabel = new javax.swing.JLabel();
        ManageCustomer = new javax.swing.JButton();
        ManageMembership = new javax.swing.JButton();
        ManageAccounts = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel1.setText("Golds Accountant work area");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, 390, -1));

        valueLabel.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        add(valueLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 70, 130, 30));

        enterpriseLabel1.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        enterpriseLabel1.setText("Organization :");
        add(enterpriseLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 70, 120, 30));

        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        enterpriseLabel.setText("Enterprise Tasks :");
        add(enterpriseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 260, 160, 30));

        ManageCustomer.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ManageCustomer.setText("Manage Customer Account Details");
        ManageCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ManageCustomerActionPerformed(evt);
            }
        });
        add(ManageCustomer, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 240, 280, 50));

        ManageMembership.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ManageMembership.setText("Manage Customer Membership");
        ManageMembership.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ManageMembershipActionPerformed(evt);
            }
        });
        add(ManageMembership, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 170, 280, 40));

        ManageAccounts.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ManageAccounts.setText("Manage Accounts For The Gym");
        ManageAccounts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ManageAccountsActionPerformed(evt);
            }
        });
        add(ManageAccounts, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 320, 280, 40));
    }// </editor-fold>//GEN-END:initComponents

    private void ManageAccountsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ManageAccountsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ManageAccountsActionPerformed

    private void ManageMembershipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ManageMembershipActionPerformed
        // TODO add your handling code here:
         ManageCustomerMemberShip macd = new ManageCustomerMemberShip(userProcessContainer, organization,system);
        userProcessContainer.add("ManageCustomerAccountsDetails", macd);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_ManageMembershipActionPerformed

    private void ManageCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ManageCustomerActionPerformed
        // TODO add your handling code here:   
        ManageCustomerAccountsDetails macd = new ManageCustomerAccountsDetails(userProcessContainer, organization,system);
        userProcessContainer.add("ManageCustomerAccountsDetails", macd);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_ManageCustomerActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ManageAccounts;
    private javax.swing.JButton ManageCustomer;
    private javax.swing.JButton ManageMembership;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel enterpriseLabel1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel valueLabel;
    // End of variables declaration//GEN-END:variables
}
