/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.DSPMarketing;

import Business.EcoSystem;
import Business.Enterprise.DSPCoopEnterprise;
import Business.Enterprise.DSPEnterprise;
import Business.Enterprise.Enterprise;
import Business.Enterprise.SSPEnterprise;
import Business.Network.Network;
import Business.Organization.DSPMarketingOrganization;
import Business.Organization.Organization;
import Business.Organization.SSPMarketingOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.DSPCoopWorkRequest;
import com.db4o.collections.ActivatableArrayList;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Neethan
 */
public class ManageCooperationJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private UserAccount userAccount;
    private EcoSystem system;
    private DSPMarketingOrganization organization;
    private DSPEnterprise enterprise;

    /**
     * Creates new form ManageCooperationJPanel
     */
    public ManageCooperationJPanel(JPanel userProcessContainer, UserAccount userAccount, DSPEnterprise enterprise, DSPMarketingOrganization organization, EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        this.organization = organization;
        this.system = system;
        this.enterprise = enterprise;
        populateCoopTable();
        populateComboBox();
    }

    private void populateCoopTable() {
        DefaultTableModel dtm = (DefaultTableModel) coopTable.getModel();
        dtm.setRowCount(0);
        if (enterprise.getCooperationList() == null) {
            enterprise.setCooperationList(new  ArrayList());
        }
        for (DSPCoopEnterprise co : enterprise.getCooperationList()) {
            Object[] row = new Object[1];
            row[0] = co.getSsp();

        }
    }

    private void populateComboBox() {
        networkJComboBox.removeAllItems();
        for (Network n : system.getNetworkList()) {
            networkJComboBox.addItem(n);
        }
    }

    private void populateSSPTable(Network net) {
        DefaultTableModel dtm = (DefaultTableModel) sspTable.getModel();
        dtm.setRowCount(0);
        for (Enterprise e : net.getEnterpriseDirecotory().getEnterpriseList()) {
            if (e instanceof SSPEnterprise) {
                Object[] row = new Object[1];
                row[0] = e;
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

        networkJComboBox = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        coopTable = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        sspTable = new javax.swing.JTable();
        withdrawJButton = new javax.swing.JButton();
        withdrawJButton1 = new javax.swing.JButton();
        alert = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setMinimumSize(new java.awt.Dimension(570, 440));

        networkJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        networkJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                networkJComboBoxActionPerformed(evt);
            }
        });

        jLabel1.setText("Network");

        coopTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "SSP Name"
            }
        ));
        jScrollPane1.setViewportView(coopTable);

        sspTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "SSP Name"
            }
        ));
        jScrollPane2.setViewportView(sspTable);

        withdrawJButton.setText("Withdraw Coop");
        withdrawJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                withdrawJButtonActionPerformed(evt);
            }
        });

        withdrawJButton1.setText("Request Coop");
        withdrawJButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                withdrawJButton1ActionPerformed(evt);
            }
        });

        alert.setForeground(new java.awt.Color(255, 0, 0));

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
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(withdrawJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addGap(18, 18, 18)
                            .addComponent(networkJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 489, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(withdrawJButton1))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(46, 46, 46)
                                    .addComponent(alert))))))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(withdrawJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(withdrawJButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(alert))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(networkJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void networkJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_networkJComboBoxActionPerformed
        // TODO add your handling code here:
        Network m = (Network) networkJComboBox.getSelectedItem();
        if (m != null) {
            populateSSPTable(m);
        }
    }//GEN-LAST:event_networkJComboBoxActionPerformed

    private void withdrawJButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_withdrawJButton1ActionPerformed
        // TODO add your handling code here:
        int selectedRow = sspTable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select an SSP from table first.");
            return;
        }
        SSPEnterprise ssp = (SSPEnterprise) sspTable.getValueAt(selectedRow, 0);
        DSPCoopWorkRequest dspcwq = new DSPCoopWorkRequest(enterprise);
        userAccount.getWorkQueue().getWorkRequestList().add(dspcwq);
        dspcwq.setSender(userAccount);
        organization.getWorkQueue().getWorkRequestList().add(dspcwq);
        for (Organization o : ssp.getOrganizationDirectory().getOrganizationList()) {
            if (o instanceof SSPMarketingOrganization) {
                o.getWorkQueue().getWorkRequestList().add(dspcwq);
            }
        }
        alert.setText("Request send successfully.");
    }//GEN-LAST:event_withdrawJButton1ActionPerformed

    private void withdrawJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_withdrawJButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow = coopTable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Select a cooperation enterprise frim the list first.");
            return;
        }
        int selectedValue = JOptionPane.showConfirmDialog(null, "You sure you want to withdraw the cooperation?", "Warning", JOptionPane.YES_NO_OPTION);
        if (selectedValue == JOptionPane.YES_OPTION) {
            SSPEnterprise s = (SSPEnterprise) coopTable.getValueAt(selectedRow, 0);
            s.removeDSP(enterprise);
            enterprise.removeCoopSSP(s);
            populateCoopTable();
        }
    }//GEN-LAST:event_withdrawJButtonActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel alert;
    private javax.swing.JTable coopTable;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JComboBox networkJComboBox;
    private javax.swing.JTable sspTable;
    private javax.swing.JButton withdrawJButton;
    private javax.swing.JButton withdrawJButton1;
    // End of variables declaration//GEN-END:variables
}
