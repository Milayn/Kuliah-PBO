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
public class Tas {
    private String merk;
    private String jenisBahan;
    private int resleting, kantong;
    private float bebanMuat;
    
    public void setMerk(String merk){
        this.merk = merk;
    }
    
    public void setJenisBahan(String jenisBahan){
        this.jenisBahan = jenisBahan;
    }
    
    public void setResleting(int resleting){
        this.resleting = resleting;
    }
    
    public void setKantong(int kantong){
        this.kantong = kantong;
    }
    
    public void tambahBeban(float newValue){
        bebanMuat += newValue;
    }
    
    public void kurangBeban(float newValue){
        bebanMuat -= newValue;
    }
    
    public void cetakInformasi(){
        System.out.println("Merk            : "+ merk);
        System.out.println("Jenis Bahan     : "+ jenisBahan);
        System.out.println("Kantong         : "+ kantong);
        System.out.println("Resleting       : "+ resleting);
        System.out.println("Beban Muat(kg)  : "+ bebanMuat);
    }
}
