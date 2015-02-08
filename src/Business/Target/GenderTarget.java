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
public class GenderTarget extends Target{

    private String gender;
    
    public GenderTarget(){
        super("gender");
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    
    public boolean meetTarget(Customer c) {        
        if(c.getGender().equals(this.gender))
            return true;
        else return false;
    }
    
}
