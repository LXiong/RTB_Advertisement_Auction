/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.DSPEnterprise;
import Business.Enterprise.Enterprise;
import Business.Organization.DSPFinancialOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import UserInterface.DSPFinancial.DSPFinancialWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author Neethan
 */
public class DSPFinancialRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem system) {
        return new DSPFinancialWorkAreaJPanel(userProcessContainer,account, (DSPFinancialOrganization)organization,(DSPEnterprise)enterprise,system);
    }
    
}
