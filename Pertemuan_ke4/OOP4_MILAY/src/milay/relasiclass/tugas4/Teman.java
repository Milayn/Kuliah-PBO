/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package milay.relasiclass.tugas4;

/**
 *
 * @author VivoBook
 */
public class Teman {
    private String nama;
    private String gender;
    private Anjing anjing;
    
    public Teman(){
    
    }

    public Teman(String nama, String gender) {
        this.nama = nama;
        this.gender = gender;
    }

    public Teman(String nama, String gender, Anjing anjing) {
        this.nama = nama;
        this.gender = gender;
        this.anjing = anjing;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Anjing getAnjing() {
        return anjing;
    }

    public void setAnjing(Anjing anjing) {
        this.anjing = anjing;
    }
    
    public String info(){
        String info ="";
        
        info += "Nama        : " + this.nama +"\n";
        info += "Gender      : " + this.gender +"\n";
        if(anjing != null){
            info += ">>Anjing Peliharaan<< \n" + this.anjing.info();
        }
        return info;   
    }
}
