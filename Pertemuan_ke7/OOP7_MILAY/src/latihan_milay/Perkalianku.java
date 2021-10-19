/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan_milay;

/**
 *
 * @author VivoBook
 */
public class Perkalianku {  
    void perkalian(int a, int b){  
        System.out.println(a*b); 
    }
    
//    void perkalian(int a, int b, int c){
//        System.out.println(a * b * c);
//    }
    
    void perkalian(double a, double b){
        System.out.println(a * b);
    }
    
    public static void main(String[] args) {
        Perkalianku objek = new Perkalianku();
        
        objek.perkalian(25, 43);
//      objek.perkalian(34, 23, 56);
        objek.perkalian(34.56, 23.7);
    }
}
