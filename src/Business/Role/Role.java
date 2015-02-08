/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;


import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author raunak
 */
public abstract class Role {
    
    public enum RoleType{
        Admin("Admin"),
        AdvertiserFinancialSpecialist("Advertiser Financial Specialist"),
        DSPFinancialSpecialist("DSP Financial Specialist"),
        SSPFinancialSpecialist("SSP Financial Specialist"),
        PublisherFinancialSpecialist("Publisher Financial Specialist"),
        AdvertiserMarketingSpecialist("Advertiser Marketing Specialist"),
        DSPMarketingSpecialist("DSP Marketing Specialist"),
        SSPMarketingSpecialist("SSP Marketing Specialist"),
        PublisherMarketingSpecialist("Publisher Marketing Specialist"),
        ADExchangeManagementSpecialist("ADExchange Management Specialist"),
        AdvertiserCustomerSpecialist("Advertiser Customer Specialist");
        
        private String value;
        private RoleType(String value){
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }
    
    public abstract JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem system);

    @Override
    public String toString() {
        return this.getClass().getName();
    }
    
    
}