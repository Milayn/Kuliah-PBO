/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasJS3_milay;

import java.util.Scanner;

/**
 *
 * @author VivoBook
 */
public class TestKoperasi {
    public static void main(String[] args) {
        Scanner scMila = new Scanner(System.in);
                
        Anggota donny = new Anggota("111333444", "Donny", 5000000);
        
      do{
        System.out.println("---------------------------------------");
        System.out.println("Nama Anggota    : " + donny.getNama());
        System.out.println("Limit Pinjaman  : " + donny.getLimitPinjaman());
        System.out.println("========MENU========");
        System.out.println("1. Pinjam");
        System.out.println("2. Angsur");
        System.out.println("3. Tampil Info");
        System.out.println("4. Exit");
        System.out.print("Pilih kode(1-4): ");
        int pilih= scMila.nextInt();
        
        switch(pilih){
            case 1:
                System.out.println("==PINJAM==");
                System.out.print("Input jumlah pinjam: ");
                int pinjam1 = scMila.nextInt();
                donny.pinjam(pinjam1);
                System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());
                break;
            case 2:
                System.out.println("==ANGSUR==");
                System.out.print("Input jumlah angsur: ");
                int bayar = scMila.nextInt();
                donny.angsur(bayar);
                System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());
        
                break;
            case 3:
                System.out.println("-----------------");
                donny.tampilInfo();
                break;
            case 4:
                System.exit(0);
                break;
                
        }
      }while(true);
        
        /*System.out.println("Nama Anggota    : " + donny.getNama());
        System.out.println("Limit Pinjaman  : " + donny.getLimitPinjaman());
        
        System.out.println("\nMeminjam uang 10.000.000...");
        donny.pinjam(10000000);
        System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());
        
        System.out.println("\nMeminjam uang 4.000.000...");
        donny.pinjam(4000000);
        System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());
        
        System.out.println("\nMeminjam uang 2.000.000...");
        donny.pinjam(2000000);
        System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());
        
        System.out.println("\nMembayar angsuran 1.000.000");
        donny.angsur(1000000);
        System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());
        
        System.out.println("\nMembayar angsuran 200.000");
        donny.angsur(200000);
        System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());
        
        System.out.println("\nMembayar angsuran 3.000.000");
        donny.angsur(3000000);
        System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());
        
        System.out.println("\nMembayar angsuran 200.000");
        donny.angsur(200000);
        System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());*/
        
    }
}
