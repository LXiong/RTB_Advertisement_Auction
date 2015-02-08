/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Target;

/**
 *
 * @author Neethan
 */
public abstract class Target {
    
    private String type;
    private float bidding;

    public Target(String type){
        this.type = type;
    }
    
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public float getBidding() {
        return bidding;
    }

    public void setBidding(float bidding) {
        this.bidding = bidding;
    }

    @Override
    public String toString(){
        return type;
    }
}
