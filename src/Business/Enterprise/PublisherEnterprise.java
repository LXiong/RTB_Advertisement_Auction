/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Enterprise;

import Business.Role.Role;
import Business.Space.SpaceList;
import java.util.ArrayList;

/**
 *
 * @author Neethan
 */
public class PublisherEnterprise extends Enterprise{

    private SpaceList spaceList;
    
    public PublisherEnterprise(String name) {
        super(name, EnterpriseType.Publisher);
        this.spaceList = new SpaceList();
    }

    public SpaceList getSpaceList() {
        return spaceList;
    }

    public void setSpaceList(SpaceList spaceList) {
        this.spaceList = spaceList;
    }

    
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
    
}
