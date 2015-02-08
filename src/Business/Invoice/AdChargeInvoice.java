/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Invoice;

import Business.Advertisement.Advertisement;
import Business.Enterprise.AdvertiserEnterprise;
import Business.Enterprise.DSPEnterprise;

/**
 *
 * @author Neethan
 */
public class AdChargeInvoice extends Invoice{

    private DSPEnterprise sender;
    private AdvertiserEnterprise receiver;
    private Advertisement ad;
    
    public AdChargeInvoice() {
        super("Advertisement Charge");
    }

    public Advertisement getAd() {
        return ad;
    }

    public void setAd(Advertisement ad) {
        this.ad = ad;
    }

    public DSPEnterprise getSender() {
        return sender;
    }

    public void setSender(DSPEnterprise sender) {
        this.sender = sender;
    }

    public AdvertiserEnterprise getReceiver() {
        return receiver;
    }

    public void setReceiver(AdvertiserEnterprise receiver) {
        this.receiver = receiver;
    }
    
}
