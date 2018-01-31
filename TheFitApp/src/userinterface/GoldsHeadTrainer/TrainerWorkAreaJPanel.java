/*
 * AdminWorkAreaJPanel.java
 *
 * Created on October 10, 2008, 8:50 AM
 */

package userinterface.GoldsHeadTrainer;


import userinterface.CrossFitHeadTrainerJPanel.*;
import userinterface.CrossFit.*;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.GoldsTrainerOrganization;
import Business.Organization.Organization;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author  keyur_donga
 */
public class TrainerWorkAreaJPanel extends javax.swing.JPanel {
    
    private JPanel userProcessContainer;
    private Organization organization;
    private EcoSystem system;
    /** Creates new form AdminWorkAreaJPanel */
    public TrainerWorkAreaJPanel(JPanel userProcessContainer, Organization organization,EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.organization = organization;
        this.system = system;
        valueLabel.setText(organization.getName());
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        userJButton = new javax.swing.JButton();
        manageTrainerCredentialsJButton = new javax.swing.JButton();
        AddTrainerJButton = new javax.swing.JButton();
        enterpriseLabel = new javax.swing.JLabel();
        valueLabel = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("GOLDS HEAD TRAINER WORK AREA");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, 460, 40));

        userJButton.setText("Manage Trainer Logs");
        userJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userJButtonActionPerformed(evt);
            }
        });
        add(userJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 220, 200, 40));

        manageTrainerCredentialsJButton.setText("Manage Trainer Credentails");
        manageTrainerCredentialsJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageTrainerCredentialsJButtonActionPerformed(evt);
            }
        });
        add(manageTrainerCredentialsJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 170, 200, 40));

        AddTrainerJButton.setText("Add Trainers");
        AddTrainerJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddTrainerJButtonActionPerformed(evt);
            }
        });
        add(AddTrainerJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 130, 200, 30));

        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        enterpriseLabel.setText("Organisation");
        add(enterpriseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, 120, 30));
        add(valueLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, 180, 20));
    }// </editor-fold>//GEN-END:initComponents

    private void userJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userJButtonActionPerformed
        // TODO add your handling code here:
        ManageGoldTrainerLogs mgt = new ManageGoldTrainerLogs(userProcessContainer, system, organization);
        userProcessContainer.add("ManageGoldTrainerLogs", mgt);

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_userJButtonActionPerformed

    private void manageTrainerCredentialsJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageTrainerCredentialsJButtonActionPerformed

        TrainerUserAccounts addTrainerUser = new TrainerUserAccounts(userProcessContainer, organization, system);
        userProcessContainer.add("addTrainerUser", addTrainerUser);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageTrainerCredentialsJButtonActionPerformed

    private void AddTrainerJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddTrainerJButtonActionPerformed

        AddTrainer addTrainer = new AddTrainer(userProcessContainer, organization);
        userProcessContainer.add("addTrainer", addTrainer);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_AddTrainerJButtonActionPerformed
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddTrainerJButton;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton manageTrainerCredentialsJButton;
    private javax.swing.JButton userJButton;
    private javax.swing.JLabel valueLabel;
    // End of variables declaration//GEN-END:variables
    
}