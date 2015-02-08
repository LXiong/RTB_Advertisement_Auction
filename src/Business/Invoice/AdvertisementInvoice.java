/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Invoice;

import Business.Advertisement.Advertisement;
import Business.Enterprise.DSPEnterprise;
import Business.Enterprise.SSPEnterprise;

/**
 *
 * @author Neethan
 */
public class AdvertisementInvoice extends Invoice{

    private SSPEnterprise sender;
    private DSPEnterprise receiver;
    private Advertisement ad;
    
    public AdvertisementInvoice() {
        super("Advertisement");
    }

    public SSPEnterprise getSender() {
        return sender;
    }

    public void setSender(SSPEnterprise sender) {
        this.sender = sender;
    }

    public DSPEnterprise getReceiver() {
        return receiver;
    }

    public void setReceiver(DSPEnterprise receiver) {
        this.receiver = receiver;
    }

    public Advertisement getAd() {
        return ad;
    }

    public void setAd(Advertisement ad) {
        this.ad = ad;
    }
    
    
    
}
