/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Invoice;

import Business.Enterprise.Enterprise;

/**
 *
 * @author Neethan
 */
public abstract class Invoice {
    

    private float amount;
    private int invoiceId;
    private static int counter = 0;
    private String type;
    
    public Invoice(String type){
        this.invoiceId = counter;
        counter++;
        this.type = type;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public int getInvoiceId() {
        return invoiceId;
    }

    public void setInvoiceId(int invoiceId) {
        this.invoiceId = invoiceId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
    
    
}
