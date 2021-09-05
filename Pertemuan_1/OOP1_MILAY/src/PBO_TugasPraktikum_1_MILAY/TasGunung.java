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
public class TasGunung extends Tas{
    private String tipeSuspensi;
    private String topLid;
    private int hipBeltPocket;
    
    public void setTipeSuspensi(String newValue){
        tipeSuspensi = newValue;
    }
    
    public void PasangTopLid(int psg){
        if(psg==0){
            topLid = "Tidak Dipasang";
        }if (psg==1){
            topLid = "Dipasang"; 
        }else{
            System.out.println("Input 0(Tidak Dipasang) / 1(Dipasang)");
        }
    }
    
    public void tambahBarangHipBelt(int barang){
        hipBeltPocket+=barang;
    }
    
    public void kurangBarangHipBelt(int barang){
        hipBeltPocket-=barang;
    }
    
    public void cetakStatus(){
        super.cetakInformasi();
        System.out.println("Tipe Suspensi                   : "+tipeSuspensi);
        System.out.println("Top Lid                         : "+ topLid);
        System.out.println("Jumlah Barang di HipBelt Pocket : "+ hipBeltPocket);

    }
}
