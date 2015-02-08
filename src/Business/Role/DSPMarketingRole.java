/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.DSPEnterprise;
import Business.Enterprise.Enterprise;
import Business.Organization.DSPMarketingOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import UserInterface.DSPMarketing.DSPMarketWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author Neethan
 */
public class DSPMarketingRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem system) {
        return new DSPMarketWorkAreaJPanel(userProcessContainer, account, (DSPMarketingOrganization)organization, (DSPEnterprise)enterprise, system);
    }
    
}
