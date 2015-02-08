/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Space;

import Business.Enterprise.PublisherEnterprise;
import Business.Enterprise.SSPEnterprise;

/**
 *
 * @author Neethan
 */
public class Space {
    
    private String name;
    private String pageType;
    private String size;
    private float price;
    private String status;
    private PublisherEnterprise owner;
    private SSPEnterprise saler;
    private int id;
    private static int counter = 1;

    public Space(){
        id = counter;
        counter++;
        status = "unassigned";
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

    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
    public String getPageType() {
        return pageType;
    }

    public void setPageType(String pageType) {
        this.pageType = pageType;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public PublisherEnterprise getOwner() {
        return owner;
    }

    public void setOwner(PublisherEnterprise owner) {
        this.owner = owner;
    }

    public SSPEnterprise getSaler() {
        return saler;
    }

    public void setSaler(SSPEnterprise saler) {
        this.saler = saler;
    }
    
    @Override
    public String toString(){
        return name;
    }
    
}
