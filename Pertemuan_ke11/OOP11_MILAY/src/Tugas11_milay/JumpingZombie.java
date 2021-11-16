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
public class JumpingZombie extends Zombie{
    
    public JumpingZombie(int health, int level){
        super.health=health;
        super.level=level;
    }
    
    @Override
    public void heal(){
        switch(super.level){
            case 1:
                //health bertambah 30%
                super.health += (super.health*0.3);
                break;
            case 2:
                //health bertambah 40%
                super.health += (super.health*0.4);
                break;
            case 3:
                //health bertambah 50%
                super.health += (super.health*0.5);
                break;
        }
    }
    
    @Override
    public void destroyed(){
        //Health berkurang 1%
     super.health -= super.health*0.01;
    }
    
    @Override
    public String getZombieInfo(){
        String info = "Jumping Zombie's Data: \n" +super.getZombieInfo()+"\n";
        return info;
    }
}
