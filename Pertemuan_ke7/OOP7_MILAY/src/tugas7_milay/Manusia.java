/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas7_milay;

/**
 *
 * @author VivoBook
 */
public class Manusia {
    public void bernafas(){
        System.out.println("Manusia Bernapas");
    }
    
    public void makan(){
        System.out.println("Manusia Makan");
    }
    
    public void info(){
        this.bernafas();
        this.makan();
    }
}
