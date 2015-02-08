/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Advertisement;

import Business.Enterprise.AdvertiserEnterprise;
import Business.Enterprise.DSPEnterprise;
import Business.Target.TargetList;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Neethan
 */
public class Advertisement {
    private String name;
    private AdvertiserEnterprise owner;
    private TargetList targetMarketList;
    private String status;
    private String type;
    private int id;
    private static int counter = 0;
    //Add some basic attributes of an advertisement
    
    public Advertisement(){
        id = counter;
        counter++;
        status = "unassigned";
        targetMarketList = new TargetList();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
     
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public AdvertiserEnterprise getOwner() {
        return owner;
    }

    public void setOwner(AdvertiserEnterprise owner) {
        this.owner = owner;
    }
   
    public TargetList getTargetMarketList() {
        return targetMarketList;
    }

    public void setTargetMarketList(TargetList targetMarketList) {
        this.targetMarketList = targetMarketList;
    }
   
    @Override
    public String toString(){
        return name;
    }
    
}
