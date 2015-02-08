/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package UserInterface.AdvertiserFinancial;

import Business.EcoSystem;
import Business.Enterprise.AdvertiserEnterprise;
import Business.Organization.AdvertiserFinancialOrganization;
import Business.Organization.DSPFinancialOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.ChargeAdvertiserWorkRequest;
import Business.WorkQueue.ClickPayWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Neethan
 */
public class AdvertiserManageAdJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private UserAccount userAccount;
    private AdvertiserFinancialOrganization organization;
    private AdvertiserEnterprise enterprise;
    private EcoSystem system;
    /**
     * Creates new form AdvertiserManageAdJPanel
     */
    public AdvertiserManageAdJPanel(JPanel userProcessContainer, UserAccount userAccount, AdvertiserFinancialOrganization organization, AdvertiserEnterprise enterprise,EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        this.enterprise =enterprise;
        this.organization = organization;
        this.system = system;
        populateTable();
    }

    private void populateTable(){
        DefaultTableModel dtm = (DefaultTableModel)waitingPayment.getModel();
        dtm.setRowCount(0);
        
        if(organization.getWorkQueue().getWorkRequestList()==null){
            organization.getWorkQueue().setWorkRequestList(new ArrayList());
        }
        for(WorkRequest wr : organization.getWorkQueue().getWorkRequestList()){
            if(wr instanceof ChargeAdvertiserWorkRequest){
                Object[] row = new Object[3];
                row[0] = (ChargeAdvertiserWorkRequest)wr;
                row[1] = ((ChargeAdvertiserWorkRequest)wr).getShowAd().getSumbid();
                row[2] = ((ChargeAdvertiserWorkRequest)wr).getShowPlace();
                dtm.addRow(row);
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
        waitingPayment = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        alert = new javax.swing.JLabel();

        setMinimumSize(new java.awt.Dimension(570, 440));

        waitingPayment.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Advertisement", "Sumbidding", "Page"
            }
        ));
        jScrollPane1.setViewportView(waitingPayment);

        jButton1.setText("Make the Payment");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("<< Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        alert.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(alert)))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(alert)
                .addGap(84, 84, 84)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int selectedRow = waitingPayment.getSelectedRow();
        if(selectedRow <0 ){
            JOptionPane.showMessageDialog(null, "Please select a item from the list first");
            return;
        }
        
        int selectedValue = JOptionPane.showConfirmDialog(null, "You sure you want to make this pay?", "Warning", JOptionPane.YES_NO_OPTION);
        if(selectedValue == JOptionPane.YES_OPTION){
        
            ChargeAdvertiserWorkRequest cadwr = (ChargeAdvertiserWorkRequest) waitingPayment.getValueAt(selectedRow, 0);
            float paymentamout = cadwr.getShowAd().getSumbid();
            enterprise.getFinancialAccount().makePayment(paymentamout);

            ClickPayWorkRequest cpwr = new ClickPayWorkRequest();
            cpwr.setShowAd(cadwr.getShowAd());
            cpwr.setPayReceiver(cadwr.getSaler());
            cpwr.setPaySender(enterprise);
            cpwr.setSender(userAccount);
            userAccount.getWorkQueue().getWorkRequestList().add(cpwr);
            organization.getWorkQueue().getWorkRequestList().add(cpwr);

            for(Organization oo : cadwr.getSaler().getOrganizationDirectory().getOrganizationList()){
                if(oo instanceof DSPFinancialOrganization){
                    oo.getWorkQueue().getWorkRequestList().add(cpwr);
                    break;
                }
            }
            
            organization.getWorkQueue().getWorkRequestList().remove(cadwr);
            alert.setText("Pay Sucessfully!");
            populateTable();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel alert;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable waitingPayment;
    // End of variables declaration//GEN-END:variables
}
