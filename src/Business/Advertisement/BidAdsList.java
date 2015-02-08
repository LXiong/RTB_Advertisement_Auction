/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Advertisement;

import java.util.ArrayList;

/**
 *
 * @author Neethan
 */
public class BidAdsList {
    
    private ArrayList<BidAd> bidAdsList;
    
    public BidAdsList(){
        bidAdsList = new ArrayList<> ();
    }

    public ArrayList<BidAd> getBidAdsList() {
        return bidAdsList;
    }

    public void setBidAdsList(ArrayList<BidAd> bidAdsList) {
        this.bidAdsList = bidAdsList;
    }
    
    public void addBidAds(BidAd ad){
        bidAdsList.add(ad);
    }
    
    public void removeBidAd(BidAd ad){
        bidAdsList.remove(ad);
    }
    
    public void sortList(){
        int i = 1;
        int j;
        int count = bidAdsList.size();
        BidAd g = bidAdsList.get(0);
        for(i = 1; i<count;i++){
            if(bidAdsList.get(i).getAd().getAssignedTime() <bidAdsList.get(i-1).getAd().getAssignedTime()){
                g = bidAdsList.get(i);
                bidAdsList.set(i, bidAdsList.get(i-1));
                for(j = i-2 ;bidAdsList.get(j).getAd().getAssignedTime() > g.getAd().getAssignedTime();j--)
                    bidAdsList.set(j+1, bidAdsList.get(j));
                bidAdsList.set(j+1, g);
            }
        }
    }
}
