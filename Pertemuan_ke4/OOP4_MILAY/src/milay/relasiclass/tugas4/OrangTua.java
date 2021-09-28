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
public class OrangTua {
    private String nama;
    private String jenisKelamin;

    public OrangTua(){
    
    }
    
    public OrangTua(String nama, String jenisKelamin) {
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }
    
    public String info(){
        String info ="";
        info += "Nama          : " + this.nama +"\n";
        info += "Jenis Kelamin : " + this.jenisKelamin +"\n";
        return info;
    }
}
