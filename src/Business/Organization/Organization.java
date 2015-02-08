/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Person.PersonDirectory;
import Business.Role.Role;
import Business.UserAccount.UserAccountDirectory;
import Business.WorkQueue.WorkQueue;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public abstract class Organization {

    private String name;
    private WorkQueue workQueue;
    private PersonDirectory personDirectory;
    private UserAccountDirectory userAccountDirectory;
    private int organizationID;
    private static int counter = 1;
    
    public enum Type{
        Admin("Admin Organization") {
//            //@Override
//            public Organization createOrganization() {
//                return new AdminOrganization();
//            }
        }, AdvertiserFinancial("Advertiser Financial Organization"){
//            public Organization createOrganization() {
//                return new DoctorOrganization();
//            }
        }, DSPFinancial("DSP Financial Organization"){
            
        }, SSPFinancial("SSP Financial Organization"){
            
        }, PublisherFinancial("Publisher Financial Organization"){
            
        }, AdvertiserMarketing("Advertiser Marketing Organization"){
//            public Organization createOrganization() {
//                return new LabOrganization();
//            }
        }, DSPMarketing("DSP Marketing Organization"){
            
        }, SSPMarketing("SSP Marketing Organization"){
            
        }, PublisherMarketing("Publisher Marketing Orgnaization"){
            
        }, ADExchangeManagement("ADExchange Management Organization"){
            
        }, AdvertiserCustomer("Advertiser Customer Organization"){
        };
        
        private String value;
        private Type(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
//        public Organization createOrganization(Type t) {
//            return t.createOrganization();
//        }
    }

    public Organization(String name) {
        this.name = name;
        workQueue = new WorkQueue();
        personDirectory = new PersonDirectory();
        userAccountDirectory = new UserAccountDirectory();
        organizationID = counter;
        ++counter;
    }

    public abstract ArrayList<Role> getSupportedRole();
    
    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public int getOrganizationID() {
        return organizationID;
    }

    public PersonDirectory getEmployeeDirectory() {
        return personDirectory;
    }
    
    public String getName() {
        return name;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

    @Override
    public String toString() {
        return name;
    }
    
    
}
