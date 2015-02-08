/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Enterprise;

/**
 *
 * @author Neethan
 */
public class DSPCoopEnterprise {
    
    private SSPEnterprise ssp;
    
    public DSPCoopEnterprise(SSPEnterprise ssp){
        this.ssp = ssp;
    }

    public SSPEnterprise getSsp() {
        return ssp;
    }

    public void setSsp(SSPEnterprise ssp) {
        this.ssp = ssp;
    }


}
