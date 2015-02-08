/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Organization;

import Business.Role.DSPMarketingRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Neethan
 */
public class DSPMarketingOrganization extends Organization{

    public DSPMarketingOrganization() {
        super(Organization.Type.DSPMarketing.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<> ();
        roles.add(new DSPMarketingRole());
        return roles;
    }
    
}
