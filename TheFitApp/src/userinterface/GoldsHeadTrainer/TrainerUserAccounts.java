/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.GoldsHeadTrainer;

import Business.EcoSystem;
import Business.NewUser.NewUser;
import Business.Organization.Organization;
import Business.Trainer.Trainers;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author dell
 */
public class TrainerUserAccounts extends javax.swing.JPanel {

    /**
     * Creates new form TrainerUserAccounts
     */
   JPanel userProcessContainer;
   Organization organization;
   EcoSystem system;
       public   TrainerUserAccounts(JPanel userProcessContainer, Organization organization,EcoSystem system) {
       initComponents();
       this.userProcessContainer = userProcessContainer;
       this.organization = organization;
       this.system = system;
       populateTrainercombobox();
     
    }
      
       public void populateTrainercombobox(){
       ComboBoxTrainers.removeAllItems();
       
       for(Trainers trainers : organization.getTrainerDirectory().getTrainerDirectory())
       {
          ComboBoxTrainers.addItem(trainers);
       }
       }
       
       public void popData()
       {
            DefaultTableModel model = (DefaultTableModel) userJTable.getModel();
           model.setRowCount(0);
             {
            for (Business.TrainerUserAccounts.TrainerUserAccount ua : organization.getUserAccountsDirectory().getUserAccountList()) {
                Object row[] = new Object[2];
                row[0] = ua;
                row[1] = ua.getTrainers().getName();
                ((DefaultTableModel) userJTable.getModel()).addRow(row);
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        userJTable = new javax.swing.JTable();
        nameJTextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        ComboBoxTrainers = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        passwordTextfield = new javax.swing.JPasswordField();
        jButton2 = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        userJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "User Name", "Name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(userJTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 375, 179));
        add(nameJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 280, 150, 30));

        jLabel1.setText("User Name");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 280, -1, -1));

        jLabel2.setText("Password");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 330, -1, -1));

        jLabel3.setText("Trainers :");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, 50, 20));

        ComboBoxTrainers.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        ComboBoxTrainers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxTrainersActionPerformed(evt);
            }
        });
        add(ComboBoxTrainers, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 240, 146, -1));

        jButton1.setText("Add User>>");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 400, 110, 40));
        add(passwordTextfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(171, 320, 150, 30));

        jButton2.setText("<<Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 410, 140, 40));
    }// </editor-fold>//GEN-END:initComponents

    private void ComboBoxTrainersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxTrainersActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboBoxTrainersActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
       String username = nameJTextField.getText();
       String password = passwordTextfield.getText();
       if(!((username.equals("") || (password.equals(""))))){
        Trainers trainers = (Trainers) ComboBoxTrainers.getSelectedItem();
        organization.getUserAccountsDirectory().createUserAccounts(username, password,trainers);
         popData();
        }
        else{
           JOptionPane.showMessageDialog(null, "Enter value", "Warning", JOptionPane.WARNING_MESSAGE); 
        }    
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_jButton2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox ComboBoxTrainers;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nameJTextField;
    private javax.swing.JPasswordField passwordTextfield;
    private javax.swing.JTable userJTable;
    // End of variables declaration//GEN-END:variables
}
