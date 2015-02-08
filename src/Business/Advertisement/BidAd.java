/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Advertisement;

/**
 *
 * @author Neethan
 */
public class BidAd {
    
    private AssignedAd ad;
    private float sumbid;
    
    public BidAd(AssignedAd ad){
        this.ad = ad;
    }

    public AssignedAd getAd() {
        return ad;
    }

    public void setAd(AssignedAd ad) {
        this.ad = ad;
    }

    public float getSumbid() {
        return sumbid;
    }

    public void setSumbid(float sumbid) {
        this.sumbid = sumbid;
    }
    
    
}
