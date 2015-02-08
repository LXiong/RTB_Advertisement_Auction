/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Invoice;

import Business.Enterprise.PublisherEnterprise;
import Business.Enterprise.SSPEnterprise;
import Business.Space.Space;

/**
 *
 * @author Neethan
 */
public class SpaceInvoice extends Invoice{

    private PublisherEnterprise sender;
    private SSPEnterprise receiver;
    private Space space;
    
    public SpaceInvoice() {
        super("Space");        
    }

    public PublisherEnterprise getSender() {
        return sender;
    }

    public void setSender(PublisherEnterprise sender) {
        this.sender = sender;
    }

    public SSPEnterprise getReceiver() {
        return receiver;
    }

    public void setReceiver(SSPEnterprise receiver) {
        this.receiver = receiver;
    }

    public Space getSpace() {
        return space;
    }

    public void setSpace(Space space) {
        this.space = space;
    }
    
    
    
}
