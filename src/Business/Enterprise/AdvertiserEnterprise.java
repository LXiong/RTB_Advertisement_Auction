/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Advertisement.OrgAdList;
import Business.Person.PersonDirectory;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Ruiyue
 */
public class AdvertiserEnterprise extends Enterprise{
    
    private OrgAdList adsList;
    
    public AdvertiserEnterprise(String name){
        super(name, EnterpriseType.Advertiser);
        adsList = new OrgAdList();
    }


    public OrgAdList getAdsList() {
        return adsList;
    }

    public void setAdsList(OrgAdList adsList) {
        this.adsList = adsList;
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
    
}
