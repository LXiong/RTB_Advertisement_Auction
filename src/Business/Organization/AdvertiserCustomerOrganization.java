/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Organization;

import Business.Role.CustomerSpecialistRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Neethan
 */
public class AdvertiserCustomerOrganization extends Organization{

    public AdvertiserCustomerOrganization() {
        super(Organization.Type.AdvertiserCustomer.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new CustomerSpecialistRole());
        return roles;
    }
    
}
