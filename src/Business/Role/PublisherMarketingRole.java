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
import Business.Organization.PublisherMarketingOrganization;
import Business.UserAccount.UserAccount;
import UserInterface.PublisherMarketing.PublisherMarketWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author Neethan
 */
public class PublisherMarketingRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem system) {
        return new PublisherMarketWorkAreaJPanel(userProcessContainer, account, (PublisherMarketingOrganization)organization, (PublisherEnterprise)enterprise, system);
    }
    
}
