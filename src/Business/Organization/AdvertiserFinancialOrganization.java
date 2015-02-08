/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Organization;

import Business.Role.AdvertiserFinancialRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Neethan
 */
public class AdvertiserFinancialOrganization extends Organization{

    public AdvertiserFinancialOrganization() {
        super(Organization.Type.AdvertiserFinancial.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<> ();
        roles.add(new AdvertiserFinancialRole());
        return roles;
    }
    
}
