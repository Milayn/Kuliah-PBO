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
public class Dosen extends Pegawai{
    private int jumlahSKS;
    private int tarif_sks;

    public Dosen(String nip, String nama, String alamat) {
        super(nip, nama, alamat);
    }

    public int getJumlahSKS() {
        return jumlahSKS;
    }

    public void setSKS(int jumlahSKS) {
        this.jumlahSKS = jumlahSKS;
    }
    
    public int getTarif_sks() {
        return tarif_sks;
    }

    public int getGajiDosen(){
        super.setGaji((tarif_sks*jumlahSKS));
        return super.getGaji();
    }
    
    public void setTarif_sks(int tarif_sks) {
        this.tarif_sks = tarif_sks;
    }
    
    public void info(){
        super.info();
        System.out.println("Jumlah SKS : "+this.jumlahSKS);
        System.out.println("Tarif SKS  : "+this.tarif_sks);
    }
    
}
