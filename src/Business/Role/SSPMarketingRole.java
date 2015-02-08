/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.SSPEnterprise;
import Business.Organization.Organization;
import Business.Organization.SSPMarketingOrganization;
import Business.UserAccount.UserAccount;
import UserInterface.SSPMarketing.SSPMarketWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author Neethan
 */
public class SSPMarketingRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem system) {
        return new SSPMarketWorkAreaJPanel(userProcessContainer, account, (SSPMarketingOrganization)organization, (SSPEnterprise)enterprise,system);
    }
    
}
