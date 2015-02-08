/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.AdvertiserMarketingOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import UserInterface.AdvertiserMarketing.AdvertiserMarketWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author Neethan
 */
public class AdvertiserMarketingRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem system) {
        return new AdvertiserMarketWorkAreaJPanel(userProcessContainer, account, (AdvertiserMarketingOrganization)organization, enterprise, system);
    }
    
}
