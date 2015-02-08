/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Target;

import java.util.ArrayList;

/**
 *
 * @author Neethan
 */
public class TargetList {
    
    private ArrayList<Target> targetList;
    
    public TargetList(){
        targetList = new ArrayList<> ();
    }

    public ArrayList<Target> getTargetList() {
        return targetList;
    }

    public void setTargetList(ArrayList<Target> targetList) {
        this.targetList = targetList;
    }
    
    public void addTarget(Target t){
        this.targetList.add(t);
    }
    
    public void removeTarget(Target t){
        this.targetList.remove(t);
    }
}
