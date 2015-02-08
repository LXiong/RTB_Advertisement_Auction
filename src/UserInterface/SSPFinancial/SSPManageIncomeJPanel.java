/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package UserInterface.SSPFinancial;

import Business.Advertisement.Advertisement;
import Business.EcoSystem;
import Business.Enterprise.PublisherEnterprise;
import Business.Enterprise.SSPEnterprise;
import Business.Invoice.AdvertisementInvoice;
import Business.Organization.PublisherFinancialOrganization;
import Business.Organization.SSPFinancialOrganization;
import Business.Space.Space;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.AdPayWorkRequest;
import Business.WorkQueue.SpacePayWorkRequest;
import Business.WorkQueue.WorkRequest;
import UserInterface.PublisherFinancial.*;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Neethan
 */
public class SSPManageIncomeJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private UserAccount userAccount;
    private SSPFinancialOrganization organization;
    private SSPEnterprise enterprise;
    private EcoSystem system;
    /**
     * Creates new form ManageIncomeJPanel
     */
    public SSPManageIncomeJPanel(JPanel userProcessContainer, UserAccount userAccount, SSPFinancialOrganization organization, SSPEnterprise enterprise, EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        this.organization = organization;
        this.enterprise = enterprise;
        this.system = system;
        populateTable();
    }
    
    private void populateTable(){
        DefaultTableModel dtm = (DefaultTableModel)incomeList.getModel();
        dtm.setRowCount(0);
        
        if(organization.getWorkQueue().getWorkRequestList()==null){
            organization.getWorkQueue().setWorkRequestList(new ArrayList());
            
        }
            
        for(WorkRequest wq : organization.getWorkQueue().getWorkRequestList()){
            if(wq instanceof AdPayWorkRequest){
                Object[] row = new Object[3];
                row[0] = (AdPayWorkRequest)wq;
                row[1] = ((AdPayWorkRequest)wq).getAdSender();
                row[2] = ((AdPayWorkRequest)wq).getBidad().getSumbid();
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
        incomeList = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        alert = new javax.swing.JLabel();

        setMinimumSize(new java.awt.Dimension(570, 440));

        incomeList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Advertisement", "DSP", "Payment Amount"
            }
        ));
        jScrollPane1.setViewportView(incomeList);

        jButton2.setText("<< Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton1.setText("Confirm Income & Sent Invoice");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        alert.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(149, 149, 149)
                .addComponent(alert)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(61, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(55, 55, 55))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(alert)
                .addGap(68, 68, 68)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int selectedRow = incomeList.getSelectedRow();
        if(selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Please select a row from the list first.");
            return;
        }
        
        int selectedValue = JOptionPane.showConfirmDialog(null, "You sure you have already received this payment?", "Warning", JOptionPane.YES_NO_OPTION);
        if(selectedValue == JOptionPane.YES_OPTION){
            
            
            AdPayWorkRequest adwr = (AdPayWorkRequest) incomeList.getValueAt(selectedRow, 0);
            float in = adwr.getBidad().getSumbid();
            enterprise.getFinancialAccount().getIncome(in);
            Advertisement ad = adwr.getBidad().getAd().getAd();
            adwr.setStatus("Confirm Receive");
            adwr.setReceiver(userAccount);
            ad.setStatus("Confirm Receive");
            organization.getWorkQueue().getWorkRequestList().remove(adwr);
            
            AdvertisementInvoice adin = new AdvertisementInvoice();
            adin.setAd(ad);
            adin.setSender(enterprise);
            adin.setReceiver(adwr.getAdSender());
            adwr.getAdSender().getInvoiceList().getInvoiceList().add(adin);
            
            alert.setText("Income Confirmed! Invoice Sent!");
            populateTable();
        }
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel alert;
    private javax.swing.JTable incomeList;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
