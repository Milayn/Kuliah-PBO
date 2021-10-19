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
public class Dosen extends Manusia{
    public void makan(){
        System.out.println("Dosen Makan Malam");
    }
    
    public void lembur(){
        System.out.println("Dosen Lembur");
    }
    
    public void info(){
        super.info();
        this.lembur();
    }
}
