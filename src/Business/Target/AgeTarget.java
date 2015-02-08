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
public class AgeTarget extends Target{
    
    private int maxAge;
    private int minAge;
    
    public AgeTarget() {
        super("age");
    }

    public int getMaxAge() {
        return maxAge;
    }

    public void setMaxAge(int maxAge) {
        this.maxAge = maxAge;
    }

    public int getMinAge() {
        return minAge;
    }

    public void setMinAge(int minAge) {
        this.minAge = minAge;
    }
    
    public boolean meetTarget(Customer c){
        if(c.getAge() >= this.minAge && c.getAge() <= this.maxAge)
            return true;
        else return false;
    }
}
