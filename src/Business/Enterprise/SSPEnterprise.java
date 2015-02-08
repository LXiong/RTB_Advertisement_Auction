/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Enterprise;

import Business.Advertisement.BidAdsList;
import Business.Role.Role;
import Business.Space.SpaceList;
import java.util.ArrayList;

/**
 *
 * @author Neethan
 */
public class SSPEnterprise extends Enterprise {
    
    private float serviceFeePercentage;
    private BidAdsList bidAdsList;
    private ArrayList<DSPEnterprise> coopDSPList;
    private SpaceList spaceList;

    public float getServiceFeePercentage() {
        return serviceFeePercentage;
    }

    public void setServiceFeePercentage(float serviceFeePercentage) {
        this.serviceFeePercentage = serviceFeePercentage;
    }

    public SSPEnterprise(String name) {
        super(name, EnterpriseType.SSP);
        this.bidAdsList = new BidAdsList();
        this.coopDSPList = new ArrayList<> ();
        this.spaceList = new SpaceList();
    }

    public SpaceList getSpaceList() {
        return spaceList;
    }

    public void setSpaceList(SpaceList spaceList) {
        this.spaceList = spaceList;
    }

    public BidAdsList getBidAdsList() {
        return bidAdsList;
    }

    public void setBidAdsList(BidAdsList bidAdsList) {
        this.bidAdsList = bidAdsList;
    }

    public ArrayList<DSPEnterprise> getCoopDSPList() {
        return coopDSPList;
    }

    public void setCoopDSPList(ArrayList<DSPEnterprise> coopDSPList) {
        this.coopDSPList = coopDSPList;
    }
    
    public void addDSP(DSPEnterprise dsp){
        coopDSPList.add(dsp);
    }
    
    public void removeDSP(DSPEnterprise dsp){
        coopDSPList.remove(dsp);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
    
}
