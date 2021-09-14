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
public class Peminjaman {
    public String id;
    public String namaMember;
    public String namaGame;
    public int harga;
    public int lamaSewa;
    
    public void tampilData(){
        System.out.println("ID          : "+id);
        System.out.println("Nama Member : "+namaMember);
        System.out.println("Nama Game   : "+namaGame);
        System.out.println("Harga       : Rp"+harga+",00");
        System.out.println("Lama Sewa   : "+lamaSewa);
        System.out.println("Harga Bayar : Rp"+hitungHargaBayar(harga,lamaSewa)+",00");
    }
    
    public int hitungHargaBayar(int hrg, int sewa){
        int hargaBayar;
        hargaBayar = hrg * sewa;
        
        return hargaBayar;  
    }
}
