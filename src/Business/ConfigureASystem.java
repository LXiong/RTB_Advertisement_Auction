/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Person.Person;
import Business.Organization.AdminOrganization;
import Business.Role.AdminRole;
import Business.Role.SystemAdminRole;
import Business.UserAccount.UserAccount;

/**
 *
 * @author raunak
 */
public class ConfigureASystem {
    
    public static EcoSystem configure(){
        
        EcoSystem system = EcoSystem.getInstance();
        //Create a netwotk
        //Create an enterprise
        //Initialize some Organization
        //Have some employees
        //Create useraccount of them
        
        Person employee = system.getEmployeeDirectory().createPerson("Neethan");
        UserAccount ua = system.getUserAccountDirectory().createUserAccount("sysadmin", "sysadmin", employee, new SystemAdminRole());
        
        return system;
        
//        AdminOrganization adminOrganization = new AdminOrganization();
//        business.getOrganizationDirectory().getOrganizationList().add(adminOrganization);
//        
//        
//        employee.setName("Raunak Agarwal");
//        
//        UserAccount account = new UserAccount();
//        account.setUsername("admin");
//        account.setPassword("admin");
//        account.setRole(new AdminRole());
//        account.setEmployee(employee);
//        
//        adminOrganization.getEmployeeDirectory().getEmployeeList().add(employee);
//        adminOrganization.getUserAccountDirectory().getUserAccountList().add(account);
//        
//        return business;
    }
    
}
