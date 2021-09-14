/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasJS2_milay;

/**
 *
 * @author VivoBook
 */
public class TestLingkaran {
    public static void main(String[] args) {
        System.out.println("=====LUAS DAN KELILING LINKARAN=====");
        Lingkaran ling = new Lingkaran();
        ling.r=10;
        ling.tampilData();
        
        System.out.println("------------------------------------");
        
        Lingkaran ling2 = new Lingkaran();
        ling2.r=7;
        ling2.tampilData();
    }
}
