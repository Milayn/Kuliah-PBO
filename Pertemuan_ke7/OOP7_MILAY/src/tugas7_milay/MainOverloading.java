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
public class MainOverloading {
    public static void main(String[] args) {
        Segitiga sgt[] = new Segitiga[3];
        
        System.out.println("================== SEGITIGA 1 ==================");
        sgt[0] = new Segitiga();
        System.out.println("Total sudut B & C (180 - 45)          : " + sgt[0].totalSudut(45));
        System.out.println("Total sudut C (180 -(45 + 30))        : " + sgt[0].totalSudut(45, 30));
        System.out.println("Keliling (diketahui panjang 3 sisi)   : " + sgt[0].keliling(6, 8, 10));
        System.out.println("Keliling (tidak diketahui sisi miring): " + sgt[0].keliling(6, 8)+"\n");
        
        System.out.println("================== SEGITIGA 2 ==================");
        sgt[1] = new Segitiga();
        System.out.println("Total sudut B & C (180 - 54)          : " + sgt[1].totalSudut(54));
        System.out.println("Total sudut C (180 -(54 + 36))        : " + sgt[1].totalSudut(54, 36));
        System.out.println("Keliling (diketahui panjang 3 sisi)   : " + sgt[1].keliling(5, 12, 13));
        System.out.println("Keliling (tidak diketahui sisi miring): " + sgt[1].keliling(5, 12)+"\n");
        
        System.out.println("================== SEGITIGA 3 ==================");
        sgt[2] = new Segitiga();
        System.out.println("Total sudut B & C (180 - 56)          : " + sgt[2].totalSudut(56));
        System.out.println("Total sudut C(180 -(56 + 45))         : " + sgt[2].totalSudut(56, 45));
        System.out.println("Keliling (diketahui panjang 3 sisi)   : " + sgt[2].keliling(7, 24, 25));
        System.out.println("Keliling (tidak diketahui sisi miring): " + sgt[2].keliling(7, 24)+"\n");
        
    }
}
