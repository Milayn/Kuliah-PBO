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
public class KipasAngin {
    private String merk;
    private String warna;
    private int kecepatanPutar;
    
    public void setMerk(String newValue){
        merk = newValue;
    }
    
    public void setWarna(String newValue){
        warna = newValue;
    }
    
    public void tambahKecepatan(int newValue){
        kecepatanPutar += newValue;
    }
    
    public void kurangiKecepatan(int newValue){
        kecepatanPutar -= newValue;
    }
    
    public void cetakInformasi(){
        System.out.println("Merk        : " + merk);
        System.out.println("Warna       : " + warna);
        System.out.println("Kecepatan   : " + kecepatanPutar);
    }
}
