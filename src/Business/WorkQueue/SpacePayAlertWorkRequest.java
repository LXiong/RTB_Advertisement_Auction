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
public class SpacePayAlertWorkRequest extends WorkRequest {
    
    private PublisherEnterprise spaceOwner;
    private SSPEnterprise spaceSaler;
    private Space space;
    
    public SpacePayAlertWorkRequest(Space space){
        this.space = space;
    }

    public PublisherEnterprise getSpaceOwner() {
        return spaceOwner;
    }

    public void setSpaceOwner(PublisherEnterprise spaceOwner) {
        this.spaceOwner = spaceOwner;
    }

    public SSPEnterprise getSpaceSaler() {
        return spaceSaler;
    }

    public void setSpaceSaler(SSPEnterprise spaceSaler) {
        this.spaceSaler = spaceSaler;
    }

    public Space getSpace() {
        return space;
    }

    public void setSpace(Space space) {
        this.space = space;
    }
    
    
}
