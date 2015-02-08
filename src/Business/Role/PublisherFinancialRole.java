/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.PublisherEnterprise;
import Business.Organization.Organization;
import Business.Organization.PublisherFinancialOrganization;
import Business.UserAccount.UserAccount;
import UserInterface.PublisherFinancial.PublisherFinancialWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author Neethan
 */
public class PublisherFinancialRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem system) {
        return new PublisherFinancialWorkAreaJPanel(userProcessContainer,account,(PublisherFinancialOrganization)organization,(PublisherEnterprise)enterprise, system);
    }
    
}
