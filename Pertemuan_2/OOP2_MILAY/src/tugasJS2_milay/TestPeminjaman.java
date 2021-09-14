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
public class TestPeminjaman {
    public static void main(String[] args) {
        Peminjaman pnj= new Peminjaman();
        pnj.id="H0098";
        pnj.namaMember="Mila Yunita";
        pnj.namaGame="DOTA 5";
        pnj.harga=20000;
        pnj.lamaSewa=5;
        pnj.tampilData();
        
        System.out.println("----------------------");
        
        Peminjaman pnj2= new Peminjaman();
        pnj2.id="H0099";
        pnj2.namaMember="Yunita";
        pnj2.namaGame="PS5";
        pnj2.harga=25000;
        pnj2.lamaSewa=7;
        pnj2.tampilData();
    }      
}
