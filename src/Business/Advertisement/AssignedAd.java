/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Advertisement;

import Business.Enterprise.DSPEnterprise;
import java.util.Date;

/**
 *
 * @author Neethan
 */
public class AssignedAd {
    
    private Advertisement ad;
    private Long assignedTime;
    private DSPEnterprise saler;
    
    public AssignedAd(Advertisement ad){
        this.ad = ad;
        Date dt = new Date();
        assignedTime = dt.getTime();
    }

    public Advertisement getAd() {
        return ad;
    }

    public DSPEnterprise getSaler() {
        return saler;
    }

    public void setSaler(DSPEnterprise saler) {
        this.saler = saler;
    }

    public void setAd(Advertisement ad) {
        this.ad = ad;
    }

    public Long getAssignedTime() {
        return assignedTime;
    }

    public void setAssignedTime(Long assignedTime) {
        this.assignedTime = assignedTime;
    }
    
    @Override
    public String toString(){
        return ad.getName();
    }
    
}
