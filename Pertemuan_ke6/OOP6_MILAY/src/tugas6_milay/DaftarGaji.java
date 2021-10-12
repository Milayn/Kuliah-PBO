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
public class DaftarGaji {
    private Pegawai[] listPegawai;
    private int size;
    
    
    public DaftarGaji(int jumlah){
        this.listPegawai = new Pegawai[jumlah];
        this.size=0;
    }
    
    public void addPegawai(Pegawai peg){
        if(size<=(listPegawai.length-1)){
            this.listPegawai[size]=peg;
            size++;
        }
    }
    
    public void printSemuaGaji(){
        for(int i=0; i<=size-1; i++){
            System.out.println("["+ (i+1) + "]");
            listPegawai[i].info();
            System.out.println();
        }
    }
    
}
