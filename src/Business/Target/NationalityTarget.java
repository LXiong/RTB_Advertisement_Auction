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
public class NationalityTarget extends Target{

    private String nation;
    
    public NationalityTarget() {
        super("nationality");
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }
    
    public boolean meetTarget(Customer c){
        if(c.getNationality().equals(this.nation))
            return true;
        else return false;
    }
    
}
