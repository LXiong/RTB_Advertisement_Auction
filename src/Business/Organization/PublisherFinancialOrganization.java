/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Organization;

import Business.Role.PublisherFinancialRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Neethan
 */
public class PublisherFinancialOrganization extends Organization{

    public PublisherFinancialOrganization() {
        super(Organization.Type.PublisherFinancial.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new PublisherFinancialRole());
        return roles;
    }
    
}
