/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package UserInterface.PublisherMarketing;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.PublisherEnterprise;
import Business.Enterprise.SSPEnterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Organization.PublisherMarketingOrganization;
import Business.Organization.SSPMarketingOrganization;
import Business.Space.Space;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.AssignSpaceWorkRequest;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Neethan
 */
public class AssignSpaceJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private UserAccount userAccount;
    private Space space;
    private PublisherMarketingOrganization organization;
    private PublisherEnterprise enterprise;
    private EcoSystem system;
    /**
     * Creates new form AssignpaceJPanel
     */
    public AssignSpaceJPanel(JPanel userProcessContainer, UserAccount userAccount, Space space, PublisherMarketingOrganization organization,PublisherEnterprise enterprise, EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        this.space = space;
        this.enterprise = enterprise;
        this.organization = organization;
        this.system = system;
        spaceName.setText(space.getName());
        populateComboBox();
    }

    private void populateComboBox(){
        networkComboBox.removeAllItems();
        for(Network network : system.getNetworkList()){
            networkComboBox.addItem(network);
        }
        
    }
    
    private void populateTable(Network network){
        DefaultTableModel dtm = (DefaultTableModel)sspList.getModel();
        if(network.getEnterpriseDirecotory().getEnterpriseList()==null){
            network.getEnterpriseDirecotory().setEnterpriseList(new ArrayList());
        }
        for(Enterprise e : network.getEnterpriseDirecotory().getEnterpriseList()){
            if(e instanceof SSPEnterprise){
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

        jLabel1 = new javax.swing.JLabel();
        spaceName = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        networkComboBox = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        sspList = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        alert = new javax.swing.JLabel();

        setMinimumSize(new java.awt.Dimension(570, 440));
        setPreferredSize(new java.awt.Dimension(570, 440));

        jLabel1.setText("Space:");

        jLabel2.setText("Area");

        networkComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        networkComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                networkComboBoxActionPerformed(evt);
            }
        });

        sspList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "SSP Name"
            }
        ));
        jScrollPane1.setViewportView(sspList);

        jButton1.setText("Send Assign Request");
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
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(networkComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(spaceName)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(146, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(119, 119, 119))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(187, 187, 187))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(alert)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(spaceName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(networkComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(alert)
                .addGap(35, 35, 35)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int selectedRow = sspList.getSelectedRow();
        if(selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Please select a SSP from the list first.");
            return;
        }

        SSPEnterprise ssp = (SSPEnterprise) sspList.getValueAt(selectedRow, 0);

        int selectedValue = JOptionPane.showConfirmDialog(null, "You sure you want to assign the Advertisement to the SSP?", "Warning", JOptionPane.YES_NO_OPTION);
        if(selectedValue == JOptionPane.YES_OPTION){
            AssignSpaceWorkRequest aswq = new AssignSpaceWorkRequest(space,enterprise);
            userAccount.getWorkQueue().getWorkRequestList().add(aswq);
            aswq.setRequestReveiver(ssp);
            aswq.setSender(userAccount);
            aswq.setStatus("Waiting Assignment.");
            space.setStatus("Waiting Assignment");
            space.setSaler(ssp);
            organization.getWorkQueue().getWorkRequestList().add(aswq);
            for(Organization o : ssp.getOrganizationDirectory().getOrganizationList()){
                if(o instanceof SSPMarketingOrganization){
                    o.getWorkQueue().getWorkRequestList().add(aswq);
                }
            }
            alert.setText("Assign Request send successfully!");
        }
        else{
            alert.setText("");
            return;
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void networkComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_networkComboBoxActionPerformed
        // TODO add your handling code here:
        Network n = (Network)networkComboBox.getSelectedItem();
        if(n!=null){
            populateTable(n);
        }
    }//GEN-LAST:event_networkComboBoxActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel alert;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox networkComboBox;
    private javax.swing.JLabel spaceName;
    private javax.swing.JTable sspList;
    // End of variables declaration//GEN-END:variables
}
