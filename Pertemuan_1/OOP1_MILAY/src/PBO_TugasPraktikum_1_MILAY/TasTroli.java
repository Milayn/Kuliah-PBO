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
public class TasTroli extends Tas{
    private String tipeSuspensi;
    private int KecepatanTarikTroli;
    
    public void setTipeSuspensi(String newValue){
        tipeSuspensi = newValue;
    }
    
    public void tambahKecepatanTarik(int tarik){
        KecepatanTarikTroli += tarik;
    }
    
    public void KurangiKecepatanTarik(int kurang){
        KecepatanTarikTroli -= kurang;
    }
    
    public void cetakStatus(){
        super.cetakInformasi();
        System.out.println("Tipe suspensi   : " + tipeSuspensi);
        System.out.println("Kecepatan Tarik Troli(m/s): "+ KecepatanTarikTroli);
    }
}
