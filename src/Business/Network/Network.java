/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Network;
import Business.Enterprise.EnterpriseDirectory;

/**
 *
 * @author Ruiyue
 */
public class Network {
    private String name;
    private EnterpriseDirectory enterpriseDirecotory;
    
    
    public Network(){
        enterpriseDirecotory = new EnterpriseDirectory(); 
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EnterpriseDirectory getEnterpriseDirecotory() {
        return enterpriseDirecotory;
    }

    @Override
    public String toString() {
        return name;
    }


    
    
}
