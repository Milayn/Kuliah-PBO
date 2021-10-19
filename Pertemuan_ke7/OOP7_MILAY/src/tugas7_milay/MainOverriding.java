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
public class MainOverriding {
    public static void main(String[] args) { 

        System.out.println("====================="); 
        System.out.println("       MANUSIA");
        System.out.println("====================="); 
         Manusia man = new Manusia();
         man.info();
         System.out.println();
         
         System.out.println("====================="); 
         System.out.println("       DOSEN");
         System.out.println("====================="); 
         Manusia dsn = new Dosen();
         dsn.info();
         System.out.println();
         
         System.out.println("====================="); 
         System.out.println("       MAHASISWA");
         System.out.println("====================="); 
         Manusia mhs = new Mahasiswa();
         mhs.info();
         System.out.println();

    }
}
