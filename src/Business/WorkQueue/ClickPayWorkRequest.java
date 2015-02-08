/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.WorkQueue;

import Business.Advertisement.BidAd;
import Business.Enterprise.AdvertiserEnterprise;
import Business.Enterprise.DSPEnterprise;

/**
 *
 * @author Neethan
 */
public class ClickPayWorkRequest extends WorkRequest{
    private BidAd showAd;
    private AdvertiserEnterprise paySender;
    private DSPEnterprise payReceiver;

    public BidAd getShowAd() {
        return showAd;
    }

    public void setShowAd(BidAd showAd) {
        this.showAd = showAd;
    }

    public AdvertiserEnterprise getPaySender() {
        return paySender;
    }

    public void setPaySender(AdvertiserEnterprise paySender) {
        this.paySender = paySender;
    }

    public DSPEnterprise getPayReceiver() {
        return payReceiver;
    }

    public void setPayReceiver(DSPEnterprise payReceiver) {
        this.payReceiver = payReceiver;
    }
    
    @Override
    public String toString(){
        return showAd.getAd().getAd().getName();
    }
}
