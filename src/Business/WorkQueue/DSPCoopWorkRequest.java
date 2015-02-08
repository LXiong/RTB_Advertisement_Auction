/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.WorkQueue;

import Business.Enterprise.DSPEnterprise;
import Business.Enterprise.SSPEnterprise;

/**
 *
 * @author Neethan
 */
public class DSPCoopWorkRequest extends WorkRequest{
    
    private DSPEnterprise dsp;
    private SSPEnterprise ssp;
    
    public DSPCoopWorkRequest(DSPEnterprise dsp){
        this.dsp = dsp;
    }

    public DSPEnterprise getDsp() {
        return dsp;
    }

    public void setDsp(DSPEnterprise dsp) {
        this.dsp = dsp;
    }

    public SSPEnterprise getSsp() {
        return ssp;
    }

    public void setSsp(SSPEnterprise ssp) {
        this.ssp = ssp;
    }
    
    @Override
    public String toString(){
        return dsp.getName();
    }
}
