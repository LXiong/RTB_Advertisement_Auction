/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Validation;

/**
 *
 * @author Neethan
 */
public class Validation {
    
    public static boolean stringIsEmpty(String s){
        if(s.trim().equals("")||s==null)
            return true;
        else return false;
    }
    
    public static boolean allChar(String s){
        if(s.matches("[a-zA-Z]+")){
            return true;
        }
        else return false;
    }
    
    public static boolean isAge(String s){
        if(s.matches("[0-9]+") && s.charAt(0)!=0)
            if(Integer.parseInt(s)>0 && Integer.parseInt(s)<=100)
                return true;
            else return false;
        else return false;
    }
    
    public static boolean isFinBalance(String a){
        return a.matches("^[-+]?(([0-9]+)([.]([0-9]+))?|([.]([0-9]+))?)$");
    }
}
