/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.WorkQueue;

import Business.Advertisement.OrgAd;
import Business.Enterprise.AdvertiserEnterprise;
import Business.Enterprise.DSPEnterprise;

/**
 *
 * @author Neethan
 */
public class AssignAdWorkRequest extends WorkRequest{
    
    private AdvertiserEnterprise adOwner;
    private OrgAd orgad;
    private DSPEnterprise adReceiver;
    
    public AssignAdWorkRequest (OrgAd orgad, AdvertiserEnterprise adOwner){
        this.adOwner = adOwner;
        this.orgad = orgad;
    }

    public DSPEnterprise getAdReceiver() {
        return adReceiver;
    }

    public void setAdReceiver(DSPEnterprise adReceiver) {
        this.adReceiver = adReceiver;
    }

    public AdvertiserEnterprise getAdOwner() {
        return adOwner;
    }

    public void setAdOwner(AdvertiserEnterprise adOwner) {
        this.adOwner = adOwner;
    }

    public OrgAd getOrgad() {
        return orgad;
    }

    public void setOrgad(OrgAd orgad) {
        this.orgad = orgad;
    }
    
    @Override
    public String toString(){
        return orgad.getAd().getName();
    }
    
}

