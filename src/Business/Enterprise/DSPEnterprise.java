/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Enterprise;

import Business.Advertisement.AssignedAdsList;
import Business.Person.PersonDirectory;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Neethan
 */
public class DSPEnterprise extends Enterprise{

    private float serviceFee;
    private PersonDirectory customerDirectory;
    private AssignedAdsList assignedAdsList;
    private ArrayList<DSPCoopEnterprise> cooperationList;
    
    public DSPEnterprise(String name, EnterpriseType type){
        super(name,type);
        customerDirectory = new PersonDirectory();
        assignedAdsList = new AssignedAdsList();
        cooperationList = new ArrayList<>();
    }

    public ArrayList<DSPCoopEnterprise> getCooperationList() {
        return cooperationList;
    }

    public void setCooperationList(ArrayList<DSPCoopEnterprise> cooperationList) {
        this.cooperationList = cooperationList;
    }

    public void addCoopSSP(SSPEnterprise e ){
        DSPCoopEnterprise ssp = new DSPCoopEnterprise(e);
        cooperationList.add(ssp);
    }
    
    public void removeCoopSSP(SSPEnterprise e){
        for(DSPCoopEnterprise s : cooperationList){
            if(s.getSsp().equals(e)){
                cooperationList.remove(s);
                return;
            }
        }
    }
    
    public AssignedAdsList getAssignedAdsList() {
        return assignedAdsList;
    }

    public void setAssignedAdsList(AssignedAdsList assignedAdsList) {
        this.assignedAdsList = assignedAdsList;
    }

    public PersonDirectory getCustomerDirectory() {
        return customerDirectory;
    }

    public void setCustomerDirectory(PersonDirectory customerDirectory) {
        this.customerDirectory = customerDirectory;
    }


    public float getServiceFeePersentage() {
        return serviceFee;
    }

    public void setServiceFeePersentage(float serviceFeePersentage) {
        this.serviceFee = serviceFeePersentage;
    }
    
    public DSPEnterprise(String name) {
        super(name, EnterpriseType.DSP);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
    
    
}
