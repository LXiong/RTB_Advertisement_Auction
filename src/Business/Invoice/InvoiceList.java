/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Invoice;

import java.util.ArrayList;

/**
 *
 * @author Neethan
 */
public class InvoiceList {
    private ArrayList<Invoice> invoiceList;
    
    public InvoiceList(){
        invoiceList = new ArrayList<> ();
    }

    public ArrayList<Invoice> getInvoiceList() {
        return invoiceList;
    }

    public void setInvoiceList(ArrayList<Invoice> invoiceList) {
        this.invoiceList = invoiceList;
    }
    
    
}
