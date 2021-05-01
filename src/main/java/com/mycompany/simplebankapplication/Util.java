/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.simplebankapplication;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

/**
 *
 * @author Nabeel Bhatti
 */
public class Util {
    
    public static ArrayList<Account> readFile(String fileName){
        ArrayList<Account> accounts=new ArrayList<>();
        try{
             FileReader fr=new FileReader(fileName);
             BufferedReader br=new BufferedReader(fr);
             String line;
             while((line=br.readLine()) != null){
                 String[] currentAccount=line.split("<>");
                 String accounNumber=currentAccount[0];
                 String accountHolder=currentAccount[1];
                 String acocuntDate=currentAccount[2];
                 double accountBalance=Double.parseDouble(currentAccount[3]);
                 Account account=new Account(accounNumber,accountHolder,acocuntDate,accountBalance);
                 
                 accounts.add(account);
             }
             
             
        }catch(Exception e){
            System.out.print(e);
        
    }
       return accounts; 
       
    }
    
    
}
