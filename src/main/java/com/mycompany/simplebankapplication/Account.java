/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.simplebankapplication;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;

/**
 *
 * @author Nabeel Bhatti
 */
public class Account {
    
    private String accountNumber;
    private String accountHolder;
    private String openDate;
    private Double balance;
    
    public Account(String accountNum,String accountHold,String openD,Double bal){
        this.accountNumber=accountNum;
        this.accountHolder=accountHold;
        this.openDate=openD;
        this.balance=bal;
        
    }
    
    
    public void withdraw(Double amount){
        this.balance=this.balance-amount;
    }
    
    public void deposit(Double amount){
        this.balance=this.balance+amount;
    }
    
    public void transfer(Account toAccount,double amount){
        this.withdraw(amount);
        toAccount.deposit(amount);
        
    }
    public String getAccount(){
        return this.accountNumber;
    }
    public String getHolder(){
        return this.accountHolder;
    }
    public String getOpenDate(){
        return this.openDate;
    }
    public Double getBalance(){
        return this.balance;
    }
    public Double setBalance(Double newAmount){
        this.balance=this.balance+newAmount;
        return this.balance;
    }
    @Override 
    public String toString(){
        return this.accountNumber;
    }
    
   
    
}
