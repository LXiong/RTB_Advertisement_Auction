/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.WorkQueue;

import Business.Enterprise.PublisherEnterprise;
import Business.Enterprise.SSPEnterprise;
import Business.Space.Space;

/**
 *
 * @author Neethan
 */
public class SpacePayWorkRequest extends WorkRequest{
    
    private Space space;
    private SSPEnterprise payEn;
    private float payAmount;
    
    public SpacePayWorkRequest(Space space){
        this.space = space;
        this.payAmount = space.getPrice();
    }

    public Space getSpace() {
        return space;
    }

    public void setSpace(Space space) {
        this.space = space;
    }

    public SSPEnterprise getPayEn() {
        return payEn;
    }

    public void setPayEn(SSPEnterprise payEn) {
        this.payEn = payEn;
    }

    public float getPayAmount() {
        return payAmount;
    }

    public void setPayAmount(float payAmount) {
        this.payAmount = payAmount;
    }

    @Override
    public String toString(){
        return space.getName();
    }
    
}
