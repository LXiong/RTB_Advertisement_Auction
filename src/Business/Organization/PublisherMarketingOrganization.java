/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Organization;

import Business.Role.PublisherMarketingRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Neethan
 */
public class PublisherMarketingOrganization extends Organization{

    public PublisherMarketingOrganization() {
        super(Organization.Type.PublisherMarketing.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<> ();
        roles.add(new PublisherMarketingRole());
        return roles;
    }
    
}
