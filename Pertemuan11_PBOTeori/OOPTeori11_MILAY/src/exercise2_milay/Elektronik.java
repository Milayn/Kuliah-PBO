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
public class Elektronik {
    protected int voltase;
    
    public Elektronik(){}
    
    public Elektronik(int voltase){
        this.voltase = voltase;
    }
    
    public int getVoltase(){
        return this.voltase;
    }
}
