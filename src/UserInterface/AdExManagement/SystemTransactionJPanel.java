/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package UserInterface.AdExManagement;

import Business.EcoSystem;
import Business.Enterprise.ADExchangeEnterprise;
import Business.Enterprise.Enterprise;
import Business.Invoice.AdChargeInvoice;
import Business.Invoice.AdvertisementInvoice;
import Business.Invoice.Invoice;
import Business.Invoice.ServiceInvoice;
import Business.Invoice.SpaceInvoice;
import Business.Network.Network;
import Business.Organization.ADExchangeManagementOrganization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Neethan
 */
public class SystemTransactionJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private UserAccount userAccount;
    private ADExchangeEnterprise enterprise;
    private ADExchangeManagementOrganization organization;
    private EcoSystem system;
    /**
     * Creates new form SystemTransactionJPanel
     */
    public SystemTransactionJPanel(JPanel userProcessContainer, UserAccount userAccount,ADExchangeEnterprise enterprise, ADExchangeManagementOrganization organization,EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        this.enterprise = enterprise;
        this.organization = organization;
        this.system = system;
        populateTable();
    }

    
    private void populateTable(){
        DefaultTableModel dtm = (DefaultTableModel)transactionTable.getModel();
        dtm.setRowCount(0);
        
        for(Network n : system.getNetworkList()){
            for(Enterprise e : n.getEnterpriseDirecotory().getEnterpriseList()){
                if(e.getInvoiceList().getInvoiceList()==null){
                    e.getInvoiceList().setInvoiceList(new ArrayList());
                }
                for(Invoice in : e.getInvoiceList().getInvoiceList()){
                    Object[] row = new Object[6];
                    row[0] = in.getType();
                    row[1] = in.getAmount();
                    switch(in.getType()){
                        case "Advertisement Charge":
                            row[2] = ((AdChargeInvoice)in).getReceiver();
                            row[3] = "Advertiser";
                            row[4] = ((AdChargeInvoice)in).getSender();
                            row[5] = "DSP";
                            break;
                        case "Advertisement":
                            row[2] = ((AdvertisementInvoice)in).getReceiver();
                            row[3] = "DSP";
                            row[4] = ((AdvertisementInvoice)in).getSender();
                            row[5] = "SSP";
                            break;
                        case "Service":
                            row[2] = ((ServiceInvoice)in).getReceiver();
                            row[3] = "Advertiser";
                            row[4] = ((ServiceInvoice)in).getSender();
                            row[5] = "DSP";
                            break;
                        case "Space":
                            row[2] = ((SpaceInvoice)in).getReceiver();
                            row[3] = "SSP";
                            row[4] = ((SpaceInvoice)in).getSender();
                            row[5] = "Publisher";
                            break;
                    }
                    dtm.addRow(row);
                }
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
        transactionTable = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();

        setMinimumSize(new java.awt.Dimension(570, 440));

        transactionTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Payment Type", "Payment Amount", "Pay Enterprise", "Role", "Receive Enterprise ", "Role"
            }
        ));
        jScrollPane1.setViewportView(transactionTable);

        jButton2.setText("<< Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 558, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(218, 218, 218)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(58, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable transactionTable;
    // End of variables declaration//GEN-END:variables
}
