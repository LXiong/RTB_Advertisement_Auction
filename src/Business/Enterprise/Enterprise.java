/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;


import Business.Financial.FinancialAccount;
import Business.Invoice.InvoiceList;
import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;

/**
 *
 * @author Ruiyue
 */
public abstract class Enterprise extends Organization{
    private OrganizationDirectory organizationDirectory;
    private EnterpriseType enterpriseType;
    private FinancialAccount financialAccount;
    private InvoiceList invoiceList;
    
    public Enterprise(String name, EnterpriseType type){
        super(name);
        this.enterpriseType = type;
        organizationDirectory = new OrganizationDirectory();
        financialAccount = new FinancialAccount();
        invoiceList = new InvoiceList();
    }
    
    public enum EnterpriseType{
        Advertiser("Advertiser"),
        DSP("DSP"),
        SSP("SSP"),
        Publisher("Publisher"),
        ADExchange("ADExchange");
        private String value;
        
        private EnterpriseType(String value){
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

    public FinancialAccount getFinancialAccount() {
        return financialAccount;
    }

    public void setFinancialAccount(FinancialAccount financialAccount) {
        this.financialAccount = financialAccount;
    }

    public InvoiceList getInvoiceList() {
        return invoiceList;
    }

    public void setInvoiceList(InvoiceList invoiceList) {
        this.invoiceList = invoiceList;
    }
    
    public OrganizationDirectory getOrganizationDirectory() {
        return organizationDirectory;
    }

    public void setOrganizationDirectory(OrganizationDirectory organizationDirectory) {
        this.organizationDirectory = organizationDirectory;
    }

    
    
    public EnterpriseType getEnterpriseType() {
        return enterpriseType;
    }
    
    
    
}
