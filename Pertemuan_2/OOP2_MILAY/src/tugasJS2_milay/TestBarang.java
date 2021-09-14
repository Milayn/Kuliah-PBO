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
public class TestBarang {
    public static void main(String[] args) {
        Barang brg = new Barang();
        brg.kode="001";
        brg.namaBarang="FlashDisk 16GB";
        brg.hargaDasar=120000;
        brg.diskon=10;
        brg.tampilData();
        
        System.out.println("-------------------------");
        
        Barang brg2 = new Barang();
        brg2.kode="002";
        brg2.namaBarang="HardDisk";
        brg2.hargaDasar=300000;
        brg2.diskon=15;
        brg2.tampilData();
    }
}
