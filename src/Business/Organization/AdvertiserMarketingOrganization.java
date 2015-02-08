/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Organization;

import Business.Role.AdvertiserMarketingRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Neethan
 */
public class AdvertiserMarketingOrganization extends Organization{

    public AdvertiserMarketingOrganization() {
        super(Organization.Type.AdvertiserMarketing.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new AdvertiserMarketingRole());
        return roles;
    }
    
}
