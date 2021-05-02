/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.simplebankapplication;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
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
             br.close();
             
        }catch(Exception e){
          
            System.out.print(e);
        
    }
       return accounts; 
       
    }
     public static void writeFile(ArrayList<Account> accounts,String fileName){
        for (Account account:accounts){
            try{
                FileWriter fw=new FileWriter(fileName);
                BufferedWriter bw=new BufferedWriter(fw);
                
                bw.append(account.getAccount()+"<>"+account.getHolder()+"<>"+account.getOpenDate()+"<>"+account.getBalance());
                
                bw.close();
            }
            catch (Exception e){
                System.out.print(e);
            }finally{
                
            }
        }
    }
    
    
}
