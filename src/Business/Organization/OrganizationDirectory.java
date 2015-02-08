/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Organization.Organization.Type;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class OrganizationDirectory {
    
    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList<>();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }

    public void setOrganizationList(ArrayList<Organization> organizationList) {
        this.organizationList = organizationList;
    }
    
    public Organization createOrganization(Type type){
        Organization organization = null;
        if (type.getValue().equals(Type.AdvertiserFinancial.getValue())){
            organization = new AdvertiserFinancialOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.DSPFinancial.getValue())){
            organization = new DSPFinancialOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.SSPFinancial.getValue())){
            organization = new SSPFinancialOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.PublisherFinancial.getValue())){
            organization = new PublisherFinancialOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.AdvertiserMarketing.getValue())){
            organization = new AdvertiserMarketingOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.DSPMarketing.getValue())){
            organization = new DSPMarketingOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.SSPMarketing.getValue())){
            organization = new SSPMarketingOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.PublisherMarketing.getValue())){
            organization = new PublisherMarketingOrganization();
            organizationList.add(organization);
        }
        else if(type.getValue().equals(Type.ADExchangeManagement.getValue())){
            organization = new ADExchangeManagementOrganization();
            organizationList.add(organization);
        }
        else if(type.getValue().equals(Type.AdvertiserCustomer.getValue())){
            organization = new AdvertiserCustomerOrganization();
            organizationList.add(organization);
        }
        return organization;
    }
}