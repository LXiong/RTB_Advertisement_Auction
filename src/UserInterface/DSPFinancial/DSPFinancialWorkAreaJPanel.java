/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package UserInterface.DSPFinancial;

import Business.EcoSystem;
import Business.Enterprise.DSPEnterprise;
import Business.Organization.DSPFinancialOrganization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author Neethan
 */
public class DSPFinancialWorkAreaJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private UserAccount userAccount;
    private DSPFinancialOrganization organization;
    private DSPEnterprise enterprise;
    private EcoSystem system;
    
    /**
     * Creates new form DSPFinancialWorkAreaJPanel
     */
    public DSPFinancialWorkAreaJPanel(JPanel userProcessContainer, UserAccount userAccount, DSPFinancialOrganization organization, DSPEnterprise enterprise, EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount ;
        this.enterprise = enterprise;
        this.organization = organization;
        this.system = system;
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
        jLabel2 = new javax.swing.JLabel();
        manageIncome = new javax.swing.JButton();
        manageBalance = new javax.swing.JButton();
        manageAdpay = new javax.swing.JButton();
        manageBalance1 = new javax.swing.JButton();

        setMinimumSize(new java.awt.Dimension(570, 440));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("My Work Area ");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("- DSP Financial Specialist");

        manageIncome.setFont(new java.awt.Font("Lucida Grande", 1, 16)); // NOI18N
        manageIncome.setText("Manage New Income");
        manageIncome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageIncomeActionPerformed(evt);
            }
        });

        manageBalance.setFont(new java.awt.Font("Lucida Grande", 1, 16)); // NOI18N
        manageBalance.setText("Check Enterprise Balance");
        manageBalance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageBalanceActionPerformed(evt);
            }
        });

        manageAdpay.setFont(new java.awt.Font("Lucida Grande", 1, 16)); // NOI18N
        manageAdpay.setText("Manage Ads Payment");
        manageAdpay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageAdpayActionPerformed(evt);
            }
        });

        manageBalance1.setFont(new java.awt.Font("Lucida Grande", 1, 16)); // NOI18N
        manageBalance1.setText("Check Enterprise Invoice");
        manageBalance1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageBalance1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(manageIncome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(manageBalance, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(manageAdpay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(manageBalance1, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(100, 100, 100))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(manageAdpay, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(manageBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(manageIncome, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(manageBalance1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void manageIncomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageIncomeActionPerformed
        // TODO add your handling code here:
        DSPManageIncomeJPanel dsmijp = new DSPManageIncomeJPanel(userProcessContainer,userAccount, organization,enterprise,system);
        userProcessContainer.add("DSPManageIncomeJPanel" , dsmijp);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageIncomeActionPerformed

    private void manageBalanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageBalanceActionPerformed
        // TODO add your handling code here:
        DSPCheckBalanceJPanel dcbjp = new DSPCheckBalanceJPanel(userProcessContainer, enterprise);
        userProcessContainer.add("DSPCheckBalanceJPanel" , dcbjp);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageBalanceActionPerformed

    private void manageAdpayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageAdpayActionPerformed
        // TODO add your handling code here:
        ManageAdPayJPanel madpjp = new ManageAdPayJPanel(userProcessContainer,userAccount, organization,enterprise,system);
        userProcessContainer.add("ManageAdPayJPanel",madpjp);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageAdpayActionPerformed

    private void manageBalance1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageBalance1ActionPerformed
        // TODO add your handling code here:
        CheckInvoiceJPanel cinjp = new CheckInvoiceJPanel(userProcessContainer,userAccount, organization,enterprise,system);
        userProcessContainer.add("DSPCheckInvoiceJPanel", cinjp);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageBalance1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton manageAdpay;
    private javax.swing.JButton manageBalance;
    private javax.swing.JButton manageBalance1;
    private javax.swing.JButton manageIncome;
    // End of variables declaration//GEN-END:variables
}
