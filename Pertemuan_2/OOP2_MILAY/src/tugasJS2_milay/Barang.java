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
public class Barang {
    public String kode;
    public String namaBarang;
    public int hargaDasar;
    public float diskon;
    
    public int hitungHargaJual(){
        int hargaJual;
        hargaJual=hargaDasar-(int)(diskon*hargaDasar/100);
        return hargaJual;
    }
    
    public void tampilData(){
        System.out.println("Kode        : "+kode);
        System.out.println("Nama Barang : "+namaBarang);
        System.out.println("Harga Dasar : Rp"+hargaDasar+",00");
        System.out.println("Diskon      : "+diskon+"%");
        System.out.println("Harga Jual  : Rp"+hitungHargaJual()+",00");
    }
}
