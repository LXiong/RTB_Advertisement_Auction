/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Target;

import Business.Customer.Customer;

/**
 *
 * @author Neethan
 */
public class OccupationTarget extends Target{

    private String occupt;
    
    public OccupationTarget() {
        super("occupation");
    }

    public String getOccupt() {
        return occupt;
    }

    public void setOccupt(String occupt) {
        this.occupt = occupt;
    }
    
    public boolean meetTarget(Customer c){
        if(c.getOccupation().equals(this.occupt))
            return true;
        else return false;
    }
    
    
}
