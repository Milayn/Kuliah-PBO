/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasJS3_milay;

/**
 *
 * @author VivoBook
 */
public class Anggota {
    private String ktp;
    private String nama;
    private int limitPinjaman=0;
    private int jumlahPinjaman;

    public Anggota(String ktp, String nama, int limitPinjaman) {
        this.ktp = ktp;
        this.nama = nama;
        this.limitPinjaman = limitPinjaman;
        jumlahPinjaman=0;
    }

    public String getKtp() {
        return ktp;
    }

    public String getNama() {
        return nama;
    }

    public int getLimitPinjaman() {
        return limitPinjaman;
    }

    public int getJumlahPinjaman() {
        return jumlahPinjaman;
    }
    
    public void pinjam(int newPinjam){
        int jumlah= jumlahPinjaman + newPinjam;
        
        if(jumlah <= limitPinjaman){
            jumlahPinjaman += newPinjam;
        }else{
            System.out.println("Maaf, jumlah pinjaman melebihi limit.");
        }
    }
    
    public void angsur(int newAngsur){
        
        if(jumlahPinjaman>0 && newAngsur<=jumlahPinjaman && newAngsur >= hitungAngsurMinimal()){
            jumlahPinjaman -= newAngsur;
        }
        else if(newAngsur>jumlahPinjaman && jumlahPinjaman>0 && newAngsur >= hitungAngsurMinimal()){
            int jumlah=jumlahPinjaman;
            jumlahPinjaman=0;
            System.out.println("Uang Kembalian: "+(newAngsur-jumlah));
        }
        else if(newAngsur < hitungAngsurMinimal()){
            System.out.println("Maaf, angsuran harus 10% dari jumlah pinjaman");
        }
        else{
            System.out.println("Maaf, angsuran tidak dilakukan. Tidak ada pinjaman");
        }
    }
    
    private int hitungAngsurMinimal(){
        return 10*jumlahPinjaman/100;
    }
    
    public void tampilInfo(){
        System.out.println("Nomor KTP         : "+ktp);
        System.out.println("Nama              : " + nama);
        System.out.println("Limit Pinjaman    : "+limitPinjaman);
        System.out.println("Jumlah Pinjaman   : "+jumlahPinjaman);
    }
}

/* if(jumlahPinjaman > 0 && newAngsur >= hitungAngsurMinimal()){
            jumlahPinjaman -= newAngsur;
        }else{
            System.out.println("Maaf, angsuran harus 10% dari jumlah pinjaman");
        }

    
*/