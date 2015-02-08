/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Financial;

/**
 *
 * @author Neethan
 */
public class FinancialAccount {
    
    private float accountBalance;
    
    public FinancialAccount(){
        accountBalance = 0;
    }

    public float getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(float accountBalance) {
        this.accountBalance = accountBalance;
    }
    
    public void getIncome(float income){
        accountBalance += income;
    }
    
    public void makePayment(float payment){
        accountBalance -= payment;
    }
    
}
