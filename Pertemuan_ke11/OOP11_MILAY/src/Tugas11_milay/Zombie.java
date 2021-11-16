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
public class Zombie implements Destroyable{
    protected int health;
    protected int level;

    @Override
    public void destroyed() {
        health--;
    }
    
    public void heal(){
        health++;
    }
    
    public String getZombieInfo(){
        return "Health = "+this.health+"\nLevel = "+this.level;
    }
}
