/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise1_milay;

/**
 *
 * @author VivoBook
 */
public class Manager extends Pegawai{
    private int tunjangan;
    
    public Manager(String nama, int gaji, int tunjangan){
        super.nama = nama;
        super.gaji = gaji;
        this.tunjangan = tunjangan;
    }
    
    @Override
    public int getGaji(){
        return super.gaji;
    }
    
    public int getTunjangan(){
        return this.tunjangan;
    }
}
