/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Advertisement;

import java.util.ArrayList;

/**
 *
 * @author Neethan
 */
public class OrgAdList {
    
    private ArrayList<OrgAd> orgAdList;
    
    public OrgAdList(){
        orgAdList = new ArrayList<> ();
    }

    public ArrayList<OrgAd> getOrgAdList() {
        return orgAdList;
    }

    public void setOrgAdList(ArrayList<OrgAd> orgAdList) {
        this.orgAdList = orgAdList;
    }
    
    public void addAd(OrgAd ad){
        orgAdList.add(ad);
    }
    
    public void deleteAd(OrgAd ad){
        orgAdList.remove(ad);
    }
}
