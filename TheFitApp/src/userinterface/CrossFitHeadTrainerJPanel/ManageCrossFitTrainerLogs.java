/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.CrossFitHeadTrainerJPanel;

import Business.EcoSystem;
import Business.NewUser.NewUser;
import Business.Organization.Organization;
import Business.Trainer.Trainers;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JPanel;

/**
 *
 * @author dell
 */
public class ManageCrossFitTrainerLogs extends javax.swing.JPanel {

    /**
     * Creates new form ManageCrossFitTrainerLogs
     */
    JPanel userProcessContainer;
    EcoSystem system;
    Organization organization;
    public ManageCrossFitTrainerLogs( JPanel userProcessContainer,  EcoSystem system, Organization organization ) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.organization = organization;
        this.system = system;
        populateTrainercombobox();
         comboBoxCustomer.removeAllItems();
          ArrayList<String> temp = new ArrayList<String>();
          for(NewUser nu : system.getCd().getEmployeeList())
       {   
            System.out.println( "Shantanu");
            if(!temp.contains(nu.getfName())){
            temp.add(nu.getfName());    
            comboBoxCustomer.addItem(nu.getfName());  
       }   
       }
       
    }
       public void populateTrainercombobox(){
       comboboxTrainer.removeAllItems();
       
       for(Trainers trainers : organization.getTrainerDirectory().getTrainerDirectory())
       {
          comboboxTrainer.addItem(trainers.toString());
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

        jLabel1 = new javax.swing.JLabel();
        comboboxTrainer = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        comboBoxCustomer = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Select Trainer:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 100, 30));

        comboboxTrainer.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(comboboxTrainer, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, 110, 30));

        jLabel2.setText("Select Customer :");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 90, 50));

        comboBoxCustomer.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(comboBoxCustomer, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, 110, 30));

        jButton1.setText("Assign Trainer To Customer-  Keyur Do This Button");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 190, 320, 130));

        jButton2.setText("<<Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 160, 60));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:  
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
        
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> comboBoxCustomer;
    private javax.swing.JComboBox<String> comboboxTrainer;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
