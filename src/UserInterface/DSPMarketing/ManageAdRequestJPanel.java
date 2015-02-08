/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package UserInterface.DSPMarketing;

import Business.Advertisement.Advertisement;
import Business.Advertisement.AssignedAd;
import Business.Advertisement.AssignedAdsList;
import Business.EcoSystem;
import Business.Enterprise.DSPEnterprise;
import Business.Organization.DSPMarketingOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.AssignAdWorkRequest;
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
public class ManageAdRequestJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private UserAccount userAccount;
    private DSPEnterprise enterprise;
    private DSPMarketingOrganization organization;
    private EcoSystem system;
    /**
     * Creates new form ManageAdJPanel
     */
    public ManageAdRequestJPanel(JPanel userProcessContainer, UserAccount userAccount, DSPEnterprise enterprise, DSPMarketingOrganization organization, EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        this.enterprise = enterprise;
        this.organization = organization;
        this.system = system;
        populateTable();
    }

    private void populateTable(){
        DefaultTableModel dtm = (DefaultTableModel)jTable1.getModel();
        dtm.setRowCount(0);
        if(organization.getWorkQueue().getWorkRequestList()==null){
            organization.getWorkQueue().setWorkRequestList(new ArrayList());
        }
        for(WorkRequest wq : organization.getWorkQueue().getWorkRequestList()){
            if(wq instanceof AssignAdWorkRequest){
                AssignAdWorkRequest assadwq = (AssignAdWorkRequest)wq;
                Object[] row = new Object[2];
                row[0] = assadwq;
                row[1] = assadwq.getAdOwner();
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

        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        alert = new javax.swing.JLabel();

        jButton2.setText("<< Back");

        setMinimumSize(new java.awt.Dimension(570, 440));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Advertisement", "Advertiser"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jButton1.setText("<< Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setText("Approve Assignement");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        alert.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(alert)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 501, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(167, 167, 167)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(alert)
                .addGap(89, 89, 89)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        int selectedRow = jTable1.getSelectedRow();
        if(selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Please select an advertisement from the list first.");
            return;
        }

        AssignAdWorkRequest assad = (AssignAdWorkRequest)jTable1.getValueAt(selectedRow, 0);
        Advertisement ad = assad.getOrgad().getAd();
        
        int selectedValue = JOptionPane.showConfirmDialog(null, "You sure you want to assign this advertisement?", "Warnning", JOptionPane.YES_NO_OPTION);
        if(selectedValue == JOptionPane.YES_OPTION){
            AssignedAd asad = new AssignedAd(ad);
            asad.setSaler(enterprise);
            if(enterprise.getAssignedAdsList()==null){
                enterprise.setAssignedAdsList(new AssignedAdsList());
            }
            enterprise.getAssignedAdsList().assignAd(asad);
            assad.setReceiver(userAccount);
            assad.setStatus("Assigned");
            ad.setStatus("Assigned");
            assad.getOrgad().getSalerList().add(enterprise);
            organization.getWorkQueue().getWorkRequestList().remove(assad);
            alert.setText("Advertisement has been approved.");
            populateTable();
        }
    }//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel alert;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}