/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.WorkQueue;

import Business.Advertisement.BidAd;
import Business.Enterprise.DSPEnterprise;


/**
 *
 * @author Neethan
 */
public class AdPayWorkRequest extends WorkRequest{
    
    private BidAd bidad;
    private DSPEnterprise adSender;
    
    public AdPayWorkRequest(BidAd bidad){
        this.bidad = bidad;
    }

    public BidAd getBidad() {
        return bidad;
    }

    public void setBidad(BidAd bidad) {
        this.bidad = bidad;
    }

    public DSPEnterprise getAdSender() {
        return adSender;
    }

    public void setAdSender(DSPEnterprise adSender) {
        this.adSender = adSender;
    }
    
    @Override
    public String toString(){
        return bidad.getAd().getAd().getName();
    }
}
