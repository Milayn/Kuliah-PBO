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
public class TelevisiJadul extends Elektronik{
    private String modeInput;
    
    public TelevisiJadul(){}
    
    public TelevisiJadul(int voltase, String modeInput) {
        super.voltase = voltase;
        this.modeInput = modeInput;
    }
    
    public String getModeInput(){
        return "Nyalakan televisi jadul dengan input: "+modeInput;
    }
    
}
