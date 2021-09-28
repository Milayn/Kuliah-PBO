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
public class Goblin {
    private String nama;
    private String warna;
    private String gender;
    private int umur;
    
    
    public Goblin(){
    
    }

    public Goblin(String nama, String warna, String gender, int umur) {
        this.nama = nama;
        this.warna = warna;
        this.gender = gender;
        this.umur = umur;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }
    
    
    
    public String info(){
        String info ="";
        info += "Nama  : " + this.nama +"\n";
        info += "Warna : " + this.warna +"\n";
        info += "Gender: " + this.gender +"\n";
        info += "Umur  : " + this.umur +" tahun\n";
        return info;
    }
}
