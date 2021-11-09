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
public class TelevisiModern extends Elektronik{
    private String modeInput;
    
    public TelevisiModern(){}
    
    public TelevisiModern(int voltase, String modeInput){
        super.voltase = voltase;
        this.modeInput = modeInput;
    }
    
    public String getModeInput(){
        return "Nyalakan televisi modern dengan input: "+modeInput;
    }
    
}
