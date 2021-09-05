/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBO_TugasPraktikum_1_MILAY;

/**
 *
 * @author VivoBook
 */
public class Demo {
    public static void main(String[] args) {
        //2C_12_2041720027_MILA YUNITA
        
       //membuat objek class KipasAngin
       KipasAngin kps= new KipasAngin();
       //memanggil method didalam class objek KipasAngin
       System.out.println("====KIPAS ANGIN====");
       kps.setMerk("Miyako");
       kps.setWarna("Biru Muda");
       kps.tambahKecepatan(3);
       kps.kurangiKecepatan(2);
       kps.cetakInformasi();
       System.out.println("");
           
       //membuat objek class OvenListrik
       OvenListrik ovn= new OvenListrik();
       //memanggil method didalam class objek OvenListrik
        System.out.println("====OVEN LISTRIK====");
        ovn.setMerk("Maspion");
        ovn.setRakPanggangan(3);
        ovn.tambahSuhu(150);
        ovn.kurangSuhu(30);
        ovn.setRakPanggangan(2);
        ovn.cetakInformasi();
        System.out.println("");
        
       //membuat objek class Tas
       Tas ts = new Tas();
       //memanggil method didalam class objek Tas
       System.out.println("====  TAS  ====");
       ts.setMerk("Jansport");
       ts.setJenisBahan("Denim");
       ts.setKantong(3);
       ts.setResleting(2);
       ts.tambahBeban(3);
       ts.kurangBeban((float) 1.5);
       ts.cetakInformasi();
       System.out.println("");
        
       //membuat objek class TasRansel
       TasGunung tsGng = new TasGunung();
       //memanggil method didalam class objek TasRansel
       System.out.println("====TAS GUNUNG====");
       tsGng.setMerk("Eiger");
       tsGng.setJenisBahan("Parasut");
       tsGng.setKantong(15);
       tsGng.setResleting(13);
       tsGng.tambahBeban(5);
       tsGng.kurangBeban(1);
       tsGng.setTipeSuspensi("Hip Belt");
       tsGng.PasangTopLid(1);
       tsGng.tambahBarangHipBelt(5);
       tsGng.kurangBarangHipBelt(1);
       tsGng.cetakStatus();
       System.out.println("");
        
       //membuat objek class TasTroli
       TasTroli tsTroli = new TasTroli();
       //memanggil method didalam class objek TasTroli
       System.out.println("====TAS TROLI====");
       tsTroli.setMerk("Reebook");
       tsTroli.setJenisBahan("Denim");
       tsTroli.setKantong(6);
       tsTroli.setResleting(4);
       tsTroli.tambahBeban(4);
       tsTroli.kurangBeban(1);
       tsTroli.setTipeSuspensi("Perlengkapan Troli");
       tsTroli.tambahKecepatanTarik(2);
       tsTroli.KurangiKecepatanTarik(1);
       tsTroli.cetakStatus();
    }
}
