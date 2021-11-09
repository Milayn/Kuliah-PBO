/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise2_milay;

/**
 *
 * @author VivoBook
 */
public class Manusia {
   public void nyalakanPerangkat(Elektronik perangkat){
        
       if(perangkat instanceof TelevisiJadul){
           System.out.println(((TelevisiJadul)perangkat).getModeInput());
       }else if(perangkat instanceof TelevisiModern){
           System.out.println(((TelevisiModern)perangkat).getModeInput());  
       }
       System.out.println("Voltase televisi: "+ perangkat.voltase);
   } 
}
