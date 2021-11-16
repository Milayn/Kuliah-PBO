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
public class WalkingZombie extends Zombie{
    
    public WalkingZombie(int health, int level){
        super.health=health;
        super.level=level;
    }
    
    @Override
    public void heal(){
        switch(super.level){
            case 1:
                //health bertambah 10%
                super.health += (super.health*0.1);
                break;
            case 2:
                //health bertambah 30%
                super.health += (super.health*0.3);
                break;
            case 3:
                //health bertambah 40%
                super.health += (super.health*0.4);
                break;
        }
    }
    
    @Override
    public void destroyed(){
        //health berkurang 2%
        super.health -= (super.health*0.02);
    }
    
    @Override
    public String getZombieInfo(){
        String info = "Walking Zombie's Data:\n" +super.getZombieInfo()+"\n";
        return info;
    }
}
