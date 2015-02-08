/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.WorkQueue;

import Business.Advertisement.Advertisement;
import Business.Customer.Customer;
import Business.Enterprise.DSPEnterprise;
import Business.Space.Space;

/**
 *
 * @author Neethan
 */
public class CustomerClickWorkRequest extends WorkRequest {
    
    private Customer customer;
    private Space space;
    private Advertisement ad;
    private DSPEnterprise saler;

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Advertisement getAd() {
        return ad;
    }

    public void setAd(Advertisement ad) {
        this.ad = ad;
    }

    public DSPEnterprise getSaler() {
        return saler;
    }

    public void setSaler(DSPEnterprise saler) {
        this.saler = saler;
    }

    public Space getSpace() {
        return space;
    }

    public void setSpace(Space space) {
        this.space = space;
    }
    
    
}
