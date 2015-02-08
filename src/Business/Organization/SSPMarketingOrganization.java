/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Organization;

import Business.Role.Role;
import Business.Role.SSPMarketingRole;
import java.util.ArrayList;

/**
 *
 * @author Neethan
 */
public class SSPMarketingOrganization extends Organization{

    public SSPMarketingOrganization() {
        super(Organization.Type.SSPMarketing.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<> ();
        roles.add(new SSPMarketingRole());
        return roles;
    }
    
}
