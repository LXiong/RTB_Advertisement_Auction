/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.WorkQueue;

import Business.Enterprise.PublisherEnterprise;
import Business.Enterprise.SSPEnterprise;
import Business.Space.Space;

/**
 *
 * @author Neethan
 */
public class AssignSpaceWorkRequest extends WorkRequest{
    
    private Space space;
    private PublisherEnterprise spaceOwner;
    private SSPEnterprise requestReveiver;
    
    public AssignSpaceWorkRequest(Space s, PublisherEnterprise owner){
        this.space = s;
        this.spaceOwner = owner;
    }

    public Space getSpace() {
        return space;
    }

    public void setSpace(Space space) {
        this.space = space;
    }

    public PublisherEnterprise getSpaceOwner() {
        return spaceOwner;
    }

    public void setSpaceOwner(PublisherEnterprise spaceOwner) {
        this.spaceOwner = spaceOwner;
    }

    public SSPEnterprise getRequestReveiver() {
        return requestReveiver;
    }

    public void setRequestReveiver(SSPEnterprise requestReveiver) {
        this.requestReveiver = requestReveiver;
    }
    
    @Override
    public String toString(){
        return space.getName();
    }
    
}
