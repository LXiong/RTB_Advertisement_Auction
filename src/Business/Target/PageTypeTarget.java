/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Target;

import Business.Space.Space;

/**
 *
 * @author Neethan
 */
public class PageTypeTarget extends Target{

    private String pageType;
    
    public PageTypeTarget() {
        super("pageType");
    }

    public String getPageType() {
        return pageType;
    }

    public void setPageType(String pageType) {
        this.pageType = pageType;
    }
    
    public boolean meetTarget(Space s){
        if(s.getPageType().equals(this.pageType))
            return true;
        else return false;
    }
}
