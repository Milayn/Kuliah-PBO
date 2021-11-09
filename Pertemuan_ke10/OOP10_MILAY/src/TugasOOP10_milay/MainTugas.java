/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasOOP10_milay;

/**
 *
 * @author VivoBook
 */
public class MainTugas {
    public static void main(String[] args) {
        Singa s = new Singa("Leo", 4, "mengaum", "Cream");
        Keledai k = new Keledai("Dodo", 4, "meringkik", "Coklat");
        Gorilla g = new Gorilla("Gogo", 2, "menggeram", "Hitam");
        
        s.displayBinatang();
        s.displayMakan();
        s.displayData();
        System.out.println("-------------------------------------------");
        
        k.displayBinatang();
        k.displayMakan();
        k.displayData();
        System.out.println("-------------------------------------------");
        
        g.displayBinatang();
        g.displayMakan();
        g.displayData();
        System.out.println("-------------------------------------------");
        
    }
}
