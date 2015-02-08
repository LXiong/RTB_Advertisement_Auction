/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Advertisement;

import Business.Enterprise.DSPEnterprise;
import java.util.ArrayList;

/**
 *
 * @author Neethan
 */
public class OrgAd {
    
    private Advertisement ad;
    private ArrayList<DSPEnterprise> salerList;
    
    public OrgAd(Advertisement ad){
        this.ad = ad;
        salerList = new ArrayList<>();
    }

    public Advertisement getAd() {
        return ad;
    }

    public void setAd(Advertisement ad) {
        this.ad = ad;
    }

    public ArrayList<DSPEnterprise> getSalerList() {
        return salerList;
    }

    public void setSalerList(ArrayList<DSPEnterprise> salerList) {
        this.salerList = salerList;
    }
    
    @Override
    public String toString(){
        return ad.getName();
    }
}
