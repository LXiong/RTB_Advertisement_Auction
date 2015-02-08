/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.WorkQueue;

import Business.Advertisement.BidAd;
import Business.Customer.Customer;
import Business.Enterprise.DSPEnterprise;
import Business.Space.Space;

/**
 *
 * @author Neethan
 */
public class ChargeAdvertiserWorkRequest extends WorkRequest{
    
    private BidAd showAd;
    private Space showPlace;
    private Customer c;
    private DSPEnterprise saler;

    public BidAd getShowAd() {
        return showAd;
    }

    public void setShowAd(BidAd showAd) {
        this.showAd = showAd;
    }

    public Space getShowPlace() {
        return showPlace;
    }

    public void setShowPlace(Space showPlace) {
        this.showPlace = showPlace;
    }

    public Customer getC() {
        return c;
    }

    public void setC(Customer c) {
        this.c = c;
    }

    public DSPEnterprise getSaler() {
        return saler;
    }

    public void setSaler(DSPEnterprise saler) {
        this.saler = saler;
    }

    
}
