/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.Golds;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.WorkQueue.AppointmentRequest;
import Business.WorkQueue.InventoryRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author keyur_donga
 */
public class GoldsAppointmentDetailsJPanel extends javax.swing.JPanel {
    
    private JPanel upc;
    private AppointmentRequest ar;
    private EcoSystem buisness;
    private Enterprise enterprise;
    /**
     * Creates new form GoldsAppointmentDetailsJPanel
     */
    public GoldsAppointmentDetailsJPanel(JPanel upc, AppointmentRequest ar, EcoSystem buisness, Enterprise enterprise) {
        initComponents();
        
        this.upc = upc;
        this.ar = ar;
        this.buisness = buisness;
        this.enterprise = enterprise;
        
        txtUName.setText(ar.getSender().toString());
        txtRequestDate.setText(ar.getRequestDate().toString());
        txtURequest.setText(ar.getMessage());
        
        populateTable();
    }

    GoldsAppointmentDetailsJPanel(JPanel userProcessContainer, InventoryRequest apptr, EcoSystem system, Organization organization) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void populateTable(){
        
        DefaultTableModel model = (DefaultTableModel) apptRequestJTable.getModel();
        model.setRowCount(0);
        
        for(AppointmentRequest ar1 : buisness.getApptQ().getAppointmentRequestList()){
            if(ar1.getReceiver() == enterprise && ar1.getSender() == ar.getSender() && ar1.getStatus() == "Approved"){
                    Object[] row = new Object[4];
                    row[0] = ar.getStatus();
                    row[1] = ar.getMessage();
                    row[2] = ar.getSender();
                    row[3] = ar.getReceiver();
                    //row[4] = ar.getRequestDate();
                    //row[5] = ar.getResolveDate();
                    model.addRow(row);
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

        jLabel1 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        enterpriseLabel3 = new javax.swing.JLabel();
        enterpriseLabel4 = new javax.swing.JLabel();
        txtRequestDate = new javax.swing.JTextField();
        txtUName = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        apptRequestJTable = new javax.swing.JTable();
        enterpriseLabel5 = new javax.swing.JLabel();
        txtMessageToUser = new javax.swing.JTextField();
        enterpriseLabel6 = new javax.swing.JLabel();
        txtURequest = new javax.swing.JTextField();
        btnBookAppt = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel1.setText("User Appointments History");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 260, 340, -1));

        btnBack.setText("<<Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 510, 100, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel2.setText("Appointment Details");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 30, 260, -1));

        enterpriseLabel3.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        enterpriseLabel3.setText("User name :");
        add(enterpriseLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, 120, 30));

        enterpriseLabel4.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        enterpriseLabel4.setText("Request from user :");
        add(enterpriseLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 180, 30));

        txtRequestDate.setEnabled(false);
        add(txtRequestDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 80, 210, 30));

        txtUName.setEnabled(false);
        add(txtUName, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 80, 190, 30));

        apptRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Status", "Message", "Request Date", "Resolve Date"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(apptRequestJTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 300, 770, 200));

        enterpriseLabel5.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        enterpriseLabel5.setText("Message for user :");
        add(enterpriseLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, 160, 30));

        txtMessageToUser.setToolTipText("Example: Please visit us anytime between 5PM to 10PM");
        add(txtMessageToUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 160, 590, 30));

        enterpriseLabel6.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        enterpriseLabel6.setText("Request Date :");
        add(enterpriseLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 80, 130, 30));

        txtURequest.setEnabled(false);
        add(txtURequest, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 120, 590, 30));

        btnBookAppt.setText("Book Appointment");
        btnBookAppt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBookApptActionPerformed(evt);
            }
        });
        add(btnBookAppt, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 203, 160, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        upc.remove(this);
        CardLayout layout = (CardLayout) upc.getLayout();
        layout.previous(upc);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnBookApptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBookApptActionPerformed
        
        ar.setMessage(txtMessageToUser.getText());
        String message = buisness.getApptQ().updateAppointmentRequest(ar);
        if(message == "Approved"){
            JOptionPane.showMessageDialog(null, "Appointment booked", "Information", JOptionPane.INFORMATION_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(null, "Couldn't complete the request. Try again", "Error", JOptionPane.ERROR_MESSAGE);
        }
        populateTable();
        btnBookAppt.setEnabled(false);
    }//GEN-LAST:event_btnBookApptActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable apptRequestJTable;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnBookAppt;
    private javax.swing.JLabel enterpriseLabel3;
    private javax.swing.JLabel enterpriseLabel4;
    private javax.swing.JLabel enterpriseLabel5;
    private javax.swing.JLabel enterpriseLabel6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtMessageToUser;
    private javax.swing.JTextField txtRequestDate;
    private javax.swing.JTextField txtUName;
    private javax.swing.JTextField txtURequest;
    // End of variables declaration//GEN-END:variables
}
