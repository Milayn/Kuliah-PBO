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
public class Mahasiswa extends Manusia{
    public void makan(){
        System.out.println("Mahasiswa makan buah");
    }
    
    public void tidur(){
        System.out.println("Mahasiswa Tidur");
    }
    
    public void info(){
        super.info();
        this.tidur();
    }
    
}
