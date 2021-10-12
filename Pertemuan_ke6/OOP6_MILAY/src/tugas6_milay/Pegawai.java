/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas6_milay;

/**
 *
 * @author VivoBook
 */
public class Pegawai {
    private String nip;
    private String nama;
    private String alamat;
    private int gaji;

    public Pegawai(){
    
    }

    public Pegawai(String nip, String nama, String alamat) {
        this.nip = nip;
        this.nama = nama;
        this.alamat = alamat;
    }

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public int getGaji() {
        return gaji;
    }

    public void setGaji(int gaji) {
        this.gaji = gaji;
    }
    
    public void info(){
        System.out.println("NIP        : " + this.nip);
        System.out.println("Nama       : " + this.nama);
        System.out.println("Alamat     : " + this.alamat);
        System.out.println("Gaji       : Rp"+ this.gaji);
    }
     
}
