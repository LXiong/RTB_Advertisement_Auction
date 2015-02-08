/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.ADExchangeEnterprise;
import Business.Enterprise.Enterprise;
import Business.Organization.ADExchangeManagementOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import UserInterface.AdExManagement.AdExManagementWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author Neethan
 */
public class ManagementSpecialistRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem system) {
        return new AdExManagementWorkAreaJPanel(userProcessContainer,account,(ADExchangeEnterprise)enterprise,(ADExchangeManagementOrganization)organization,system);
    }
    
    
}
