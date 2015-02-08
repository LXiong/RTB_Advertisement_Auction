/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.AdministrativeRole;

import Business.EcoSystem;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;
import Business.Person.Person;
import Business.UserAccount.UserAccount;
import Business.Validation.Validation;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author raunak
 */
public class ManageEmployeeJPanel extends javax.swing.JPanel {

    private OrganizationDirectory organizationDir;
    private JPanel userProcessContainer;
    private EcoSystem system;
    
    /**
     * Creates new form ManageOrganizationJPanel
     */
    public ManageEmployeeJPanel(JPanel userProcessContainer,OrganizationDirectory organizationDir,EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.organizationDir = organizationDir;
        this.system = system;
        
        populateOrganizationComboBox();
        populateOrganizationEmpComboBox();
    }
    
    public void populateOrganizationComboBox(){
        organizationJComboBox.removeAllItems();
        
        for (Organization organization : organizationDir.getOrganizationList()){
            organizationJComboBox.addItem(organization);
        }
    }
    
    public void populateOrganizationEmpComboBox(){
        organizationEmpJComboBox.removeAllItems();
        
        for (Organization organization : organizationDir.getOrganizationList()){
            organizationEmpJComboBox.addItem(organization);
        }
    }

    private void populateTable(Organization organization){
        DefaultTableModel model = (DefaultTableModel) employeeJTable.getModel();
        
        model.setRowCount(0);
        
        for (Person employee : organization.getEmployeeDirectory().getPersonList()){
            Object[] row = new Object[2];
            row[0] = employee.getId();
            row[1] = employee;
            model.addRow(row);
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
        employeeJTable = new javax.swing.JTable();
        addJButton = new javax.swing.JButton();
        organizationJComboBox = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        backJButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        nameJTextField = new javax.swing.JTextField();
        organizationEmpJComboBox = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        addJButton1 = new javax.swing.JButton();

        setMinimumSize(new java.awt.Dimension(570, 440));
        setPreferredSize(new java.awt.Dimension(570, 440));

        employeeJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(employeeJTable);
        if (employeeJTable.getColumnModel().getColumnCount() > 0) {
            employeeJTable.getColumnModel().getColumn(0).setResizable(false);
            employeeJTable.getColumnModel().getColumn(1).setResizable(false);
        }

        addJButton.setText("Create Employee");
        addJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addJButtonActionPerformed(evt);
            }
        });

        organizationJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        organizationJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                organizationJComboBoxActionPerformed(evt);
            }
        });

        jLabel1.setText("Organization");

        backJButton.setText("<< Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        jLabel2.setText("Employee Name");

        organizationEmpJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel3.setText("Organization");

        addJButton1.setText("Delete Employee");
        addJButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addJButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(34, 34, 34)
                        .addComponent(organizationJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(backJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3))
                            .addGap(57, 57, 57)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(addJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 126, Short.MAX_VALUE)
                                .addComponent(organizationEmpJComboBox, 0, 126, Short.MAX_VALUE)
                                .addComponent(nameJTextField)
                                .addComponent(addJButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, Short.MAX_VALUE)))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(71, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(organizationJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(organizationEmpJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(addJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addJButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void addJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addJButtonActionPerformed
        
        Organization organization = (Organization) organizationEmpJComboBox.getSelectedItem();
        String name = nameJTextField.getText();
        
        if(Validation.stringIsEmpty(name)){
            JOptionPane.showMessageDialog(null, "Name field cann't be empty, please type in the employee's name.");
            return;
        }
        
        if(!Validation.allChar(name)){
            JOptionPane.showMessageDialog(null, "Name shoul be composed of only letters, type in a validate name please.");
            nameJTextField.setText("");
            return;
        }
        
        boolean exist = false;
        
        for(Person testp : organization.getEmployeeDirectory().getPersonList()){
            if(testp.getName().equals(name)){
                exist = true;
                break;
            }
        }
        
        if(!exist){
        organization.getEmployeeDirectory().createPerson(name);
        }
        
    }//GEN-LAST:event_addJButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void organizationJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_organizationJComboBoxActionPerformed
        Organization organization = (Organization) organizationJComboBox.getSelectedItem();
        if (organization != null){
            populateTable(organization);
        }
    }//GEN-LAST:event_organizationJComboBoxActionPerformed

    private void addJButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addJButton1ActionPerformed
        // TODO add your handling code here:
        int selectedRow = employeeJTable.getSelectedRow();
        if(selectedRow <0 ){
            JOptionPane.showMessageDialog(null, "Please select an employee from the table.");
            return;
        }
        
        int selectedValue = JOptionPane.showConfirmDialog(null, "You sure you want to delete the employee?", "Warning", JOptionPane.YES_NO_OPTION);
        if(selectedValue == JOptionPane.YES_OPTION){
            Person e = (Person)employeeJTable.getValueAt(selectedRow, 1);
            Organization o = (Organization)organizationJComboBox.getSelectedItem();
            o.getEmployeeDirectory().getPersonList().remove(e);
            for(int i = o.getUserAccountDirectory().getUserAccountList().size()-1;i>=0;i--){
                UserAccount ua = o.getUserAccountDirectory().getUserAccountList().get(i);
                if(ua.getPerson().equals(e))
                    o.getUserAccountDirectory().getUserAccountList().remove(ua);
            }
           
        }
    }//GEN-LAST:event_addJButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addJButton;
    private javax.swing.JButton addJButton1;
    private javax.swing.JButton backJButton;
    private javax.swing.JTable employeeJTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nameJTextField;
    private javax.swing.JComboBox organizationEmpJComboBox;
    private javax.swing.JComboBox organizationJComboBox;
    // End of variables declaration//GEN-END:variables
}
