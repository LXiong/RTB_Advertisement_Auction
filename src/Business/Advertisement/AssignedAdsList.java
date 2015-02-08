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
public class AssignedAdsList {
    
    private ArrayList<AssignedAd> assignedAdList;
    
    public AssignedAdsList(){
        assignedAdList = new ArrayList<>();
    }

    public ArrayList<AssignedAd> getAssignedAdList() {
        return assignedAdList;
    }

    public void setAssignedAdList(ArrayList<AssignedAd> assignedAdList) {
        this.assignedAdList = assignedAdList;
    }
    
    
    
    public void assignAd(AssignedAd ad){
        assignedAdList.add(ad);
    }    

    public void withdrawAd(AssignedAd ad){
        assignedAdList.remove(ad);
    }
}
