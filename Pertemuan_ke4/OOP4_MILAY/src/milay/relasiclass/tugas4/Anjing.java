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
public class Anjing {
    private String nama;
    private String jenis;
    
    public Anjing(){
    
    }

    public Anjing(String nama, String jenis) {
        this.nama = nama;
        this.jenis = jenis;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }
    
    public String info(){
        String info ="";
        info += "Nama   : " + this.nama +"\n";
        info += "Jenis  : " + this.jenis +"\n";
        return info;
    }
}
