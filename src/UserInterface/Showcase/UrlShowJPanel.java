/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package UserInterface.Showcase;

import Business.Advertisement.AssignedAd;
import Business.Advertisement.BidAd;
import Business.Advertisement.BidAdsList;
import Business.Customer.Customer;
import Business.EcoSystem;
import Business.Enterprise.AdvertiserEnterprise;
import Business.Enterprise.DSPEnterprise;
import Business.Enterprise.Enterprise;
import Business.Enterprise.SSPEnterprise;
import Business.Network.Network;
import Business.Organization.AdvertiserCustomerOrganization;
import Business.Organization.DSPFinancialOrganization;
import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;
import Business.Organization.SSPFinancialOrganization;
import Business.Space.Space;
import Business.Target.AgeTarget;
import Business.Target.GenderTarget;
import Business.Target.NationalityTarget;
import Business.Target.OccupationTarget;
import Business.Target.PageTypeTarget;
import Business.Target.Target;
import Business.WorkQueue.AdShowWorkRequest;
import Business.WorkQueue.CustomerClickWorkRequest;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Neethan
 */
public class UrlShowJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private EcoSystem system;
    private Customer c;
    /**
     * Creates new form UrlShowJPanel
     */
    public UrlShowJPanel(JPanel userProcessContainer, EcoSystem system, Customer c) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        this.c = c;
        customerName.setText(c.getName());
        populateTable();
    }
    
    private void populateTable(){
        DefaultTableModel dtm = (DefaultTableModel)pageList.getModel();
        dtm.setRowCount(0);
        
        
        for(Network n : system.getNetworkList()){
            for(Enterprise e : n.getEnterpriseDirecotory().getEnterpriseList()){
                if(e instanceof SSPEnterprise){
                    for(Space s : ((SSPEnterprise)e).getSpaceList().getSpaceList()){
                        Object[] row = new Object[3];
                        row[0] = s;
                        row[1] = s.getPageType();
                        row[2] = s.getOwner();
                        dtm.addRow(row);
                    }
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

        jLabel1 = new javax.swing.JLabel();
        customerName = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        pageList = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setMinimumSize(new java.awt.Dimension(570, 440));

        jLabel1.setText("Hi");

        pageList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Space Name ", "Page Type", "Publisher"
            }
        ));
        jScrollPane1.setViewportView(pageList);

        jLabel2.setText("Page List");

        jButton2.setText("Enter the page");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton1.setText("<< Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(customerName)))))
                .addContainerGap(75, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(customerName))
                .addGap(41, 41, 41)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
                                // TODO add your handling code here:
        int selectedRow = pageList.getSelectedRow();
        if(selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Please select a page from the table.");
            return;
        }
        
        
        Space s = (Space) pageList.getValueAt(selectedRow, 0);
        SSPEnterprise ssp = s.getSaler();
        if(ssp.getCoopDSPList().isEmpty()){
            JOptionPane.showMessageDialog(null, "Sorry, but no Advertisement is in need for publish.");
            return;
        }
        
        //BIDDING PROCESS
        float maxbid = 0;
        for(DSPEnterprise dsp : ssp.getCoopDSPList()){
            for(AssignedAd asad : dsp.getAssignedAdsList().getAssignedAdList()){
                float sumbid = 0;
                for(Target t :asad.getAd().getTargetMarketList().getTargetList()){
                    switch(t.getType()){
                        case "gender" :
                            if(((GenderTarget)t).meetTarget(c))
                                sumbid += t.getBidding();
                            break;
                        case "age":
                            if(((AgeTarget)t).meetTarget(c))
                                sumbid += t.getBidding();
                            break;
                        case "nationality":
                            if(((NationalityTarget)t).meetTarget(c))
                                sumbid += t.getBidding();
                            break;
                        case "occupation":
                            if(((OccupationTarget)t).meetTarget(c))
                                sumbid += t.getBidding();
                            break;
                        case "pageType":
                            if(((PageTypeTarget)t).meetTarget(s))
                                sumbid += t.getBidding();
                            break;
                    }
                }
                if(sumbid != 0){
                    BidAd bidad = new BidAd(asad);
                    ssp.getBidAdsList().addBidAds(bidad);
                    bidad.setSumbid(sumbid);
                    if(sumbid >= maxbid)
                        maxbid = sumbid;
                }   
            }
        }
        BidAdsList finalList = new BidAdsList ();
        for(BidAd b : ssp.getBidAdsList().getBidAdsList()){
            if(b.getSumbid() == maxbid){
                finalList.addBidAds(b);
            }
        }
        
        BidAd winAd;
        if(finalList.getBidAdsList().size() != 1)
           finalList.sortList();
        if(finalList.getBidAdsList().isEmpty())
            winAd = null;
        else
            winAd = finalList.getBidAdsList().get(0);
        
        AdShowJPanel adsjp = new AdShowJPanel(userProcessContainer,winAd,c);
        userProcessContainer.add("AdShowJPanel", adsjp);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        
        //SEND DSP PAYMENT ALARM & BASIC INFORMATION OF THE CLICK customer, space, ad, ssp
        
        AdShowWorkRequest adswr = new AdShowWorkRequest();
        adswr.setC(c);
        adswr.setShowAd(winAd);
        adswr.setShowEn(ssp);
        adswr.setShowPlace(s);
        
        //TELL SSP THAT DSP HAS PAID FOR THE AD
        
       /** for(Organization oo: ssp.getOrganizationDirectory().getOrganizationList()){
            if(oo instanceof SSPFinancialOrganization){
                oo.getWorkQueue().getWorkRequestList().add(adswr);
                break;
            }
        }**/
        
        
        //SEND WR TO DSP AND MINUS DSP'S ACCOUNT
        
        DSPEnterprise dsp = winAd.getAd().getSaler();
        for(Organization o : dsp.getOrganizationDirectory().getOrganizationList()){
            if(o instanceof DSPFinancialOrganization){
                o.getWorkQueue().getWorkRequestList().add(adswr);
                break;
            }
        }
        
        //send customer and space information to advertiser for further decision making
        
        CustomerClickWorkRequest ccwr = new CustomerClickWorkRequest();
        ccwr.setCustomer(c);
        ccwr.setSpace(s);
        ccwr.setAd(winAd.getAd().getAd());
        ccwr.setSaler(dsp);
        AdvertiserEnterprise adenp = winAd.getAd().getAd().getOwner();
        
        //if(adenp.getOrganizationDirectory()==null){
        //    adenp.setOrganizationDirectory(new OrganizationDirectory());
        //}
        
        for(Organization o :adenp.getOrganizationDirectory().getOrganizationList()){
            if(o instanceof AdvertiserCustomerOrganization){
                o.getWorkQueue().getWorkRequestList().add(ccwr);
            }
        }
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel customerName;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable pageList;
    // End of variables declaration//GEN-END:variables
}
