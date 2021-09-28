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
public class BolaMakhluk {
     private String tipe;
     private String warna;
 
    BolaMakhluk(){
    }

    public BolaMakhluk(String tipe, String warna) {
        this.tipe = tipe;
        this.warna = warna;
    }

    public String getTipe() {
        return tipe;
    }

    public void setTipe(String tipe) {
        this.tipe = tipe;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }
 
    public String info(){
        String info ="";
        info += "Tipe  : " + this.tipe +"\n";
        info += "Warna : " + this.warna +"\n";
        return info;
    }
}
