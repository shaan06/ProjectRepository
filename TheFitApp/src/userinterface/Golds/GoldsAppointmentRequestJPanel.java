/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.Golds;

import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.WorkQueue.AppointmentQueue;
import Business.WorkQueue.AppointmentRequest;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author keyur_donga
 */
public class GoldsAppointmentRequestJPanel extends javax.swing.JPanel {
    
    private JPanel upc;
    private EcoSystem buisness;
    private Enterprise enterprise;
    /**
     * Creates new form GoldsAppointmentRequestJPanel
     */
    public GoldsAppointmentRequestJPanel(JPanel userProcessContainer, EcoSystem buisness, Enterprise enterprise) {
        initComponents();
        
        this.upc = userProcessContainer;
        this.buisness = buisness;
        this.enterprise = enterprise;
        
        populateTable();
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
        apptRequestJTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        viewApptDetails = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        apptRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Status", "Sender", "Receiver", "Request Date"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(apptRequestJTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 840, 330));

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel1.setText("Golds GYM Appointment requests");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, 410, -1));

        jButton1.setText("<<Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, 100, 30));

        viewApptDetails.setText("View Appointment Details");
        viewApptDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewApptDetailsActionPerformed(evt);
            }
        });
        add(viewApptDetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 410, 170, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        upc.remove(this);
        CardLayout layout = (CardLayout) upc.getLayout();
        layout.previous(upc);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void viewApptDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewApptDetailsActionPerformed
        
        int selectedRow = apptRequestJTable.getSelectedRow();        
        //int i = 0;
        if(selectedRow >=0){
            int id = (int) apptRequestJTable.getValueAt(selectedRow, 0);
            System.out.println(id);
            AppointmentRequest apptr = buisness.getApptQ().getAppointmentRequest(id);
            
            System.out.println(apptr.getId());
            GoldsAppointmentDetailsJPanel panel = new GoldsAppointmentDetailsJPanel(upc, apptr, buisness, enterprise);
            upc.add("GoldsAppointmentDetailsJPanel", panel);
            CardLayout layout = (CardLayout) upc.getLayout();
            layout.next(upc);
        }else{
            JOptionPane.showMessageDialog(null, "Please select an Appointment to view its details","Information",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_viewApptDetailsActionPerformed

    public void populateTable(){
        
        DefaultTableModel model = (DefaultTableModel) apptRequestJTable.getModel();
        model.setRowCount(0);
        
        for(AppointmentRequest ar : buisness.getApptQ().getAppointmentRequestList()){
            if(ar.getReceiver() == enterprise && ar.getStatus() == "Pending"){
                    Object[] row = new Object[5];
                    row[0] = ar.getId();
                    row[1] = ar.getStatus();
                    row[2] = ar.getSender();
                    row[3] = ar.getReceiver();
                    row[4] = ar.getRequestDate();
                    model.addRow(row);
            }    
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable apptRequestJTable;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton viewApptDetails;
    // End of variables declaration//GEN-END:variables
}
