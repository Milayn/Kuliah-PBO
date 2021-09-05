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
public class OvenListrik {
    private String merk;
    private int suhu;
    private int rakPanggangan;
    
    public void setMerk(String merk){
        this.merk = merk;
    }
    
    public void tambahSuhu(int suhu){
        this.suhu += suhu;
    }
    
    public void kurangSuhu(int suhu){
        this.suhu -= suhu;
    }
    
    public void setRakPanggangan(int rakPanggangan){
        this.rakPanggangan = rakPanggangan;
    }
    
    public void cetakInformasi(){
        System.out.println("Merk            : "+ merk);
        System.out.println("Suhu(Celcius)   : "+ suhu);
        System.out.println("Rak Panggangan  : "+ rakPanggangan);
    }
}
