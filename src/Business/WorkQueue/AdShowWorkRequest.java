/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.WorkQueue;

import Business.Advertisement.BidAd;
import Business.Customer.Customer;
import Business.Enterprise.SSPEnterprise;
import Business.Space.Space;

/**
 *
 * @author Neethan
 */
public class AdShowWorkRequest extends WorkRequest{
    
    private BidAd showAd;
    private SSPEnterprise showEn;
    private Customer c;
    private Space showPlace;

    public BidAd getShowAd() {
        return showAd;
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

    public void setShowAd(BidAd showAd) {
        this.showAd = showAd;
    }

    public SSPEnterprise getShowEn() {
        return showEn;
    }

    public void setShowEn(SSPEnterprise showEn) {
        this.showEn = showEn;
    }
    
    @Override 
    public String toString(){
        return showAd.getAd().getAd().getName();
    }
}
