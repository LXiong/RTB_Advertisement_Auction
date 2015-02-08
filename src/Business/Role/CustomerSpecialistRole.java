/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.AdvertiserEnterprise;
import Business.Enterprise.Enterprise;
import Business.Organization.AdvertiserCustomerOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import UserInterface.AdvertiseCustomer.AdvertiserCustomerWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author Neethan
 */
public class CustomerSpecialistRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem system) {
        return new AdvertiserCustomerWorkAreaJPanel(userProcessContainer, account ,(AdvertiserEnterprise)enterprise , (AdvertiserCustomerOrganization)organization,system);
    }
    
}
