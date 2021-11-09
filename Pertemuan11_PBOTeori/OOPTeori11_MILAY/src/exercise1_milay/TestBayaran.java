/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise1_milay;

/**
 *
 * @author VivoBook
 */
public class TestBayaran {
    public static void main(String[] args) {
        Manager man = new Manager("Agus", 800, 50);
        Programmer prog = new Programmer("Budi", 600, 30);
        Bayaran hr = new Bayaran();
        
        System.out.println("Bayaran untuk Manager: "+ hr.hitungBayaran(man));
        System.out.println("Bayaran untuk Programmer: "+ hr.hitungBayaran(prog));
    }
}
