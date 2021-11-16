/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas11_milay;

/**
 *
 * @author VivoBook
 */
public class Barrier implements Destroyable{
    private int strength;

    public Barrier(int strength) {
        this.strength = strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }
    
    public int getStrength() {
        return strength;
    }
        
    @Override
    public void destroyed() {
        strength -= (strength*0.03);
    }
    
    public String getBarrierInfo(){
        String info = "Barrier's Strength = "+this.strength+"\n";
        return info;
    }
    
}
