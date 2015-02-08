/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Space;

import java.util.ArrayList;

/**
 *
 * @author Neethan
 */
public class SpaceList {
    
    private ArrayList<Space> spaceList;
    
    public SpaceList(){
        spaceList = new ArrayList<> ();
    }

    public ArrayList<Space> getSpaceList() {
        return spaceList;
    }

    public void setSpaceList(ArrayList<Space> spaceList) {
        this.spaceList = spaceList;
    }
    
    
}
