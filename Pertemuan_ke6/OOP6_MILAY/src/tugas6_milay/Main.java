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
public class Main {
    public static void main(String[] args) {
        
        DaftarGaji daf = new DaftarGaji(10);
        
        Pegawai peg = new Pegawai("2009129", "Anthonsen", "Malang");
        peg.setGaji(7000000);
        daf.addPegawai(peg);
        
        Pegawai peg2 = new Pegawai("2009130", "Mila", "Malang");
        peg2.setGaji(10000000);
        daf.addPegawai(peg2);
        
        Pegawai peg3 = new Pegawai("2009131", "Andrew", "Malang");
        peg3.setGaji(8000000);
        daf.addPegawai(peg3);
        
        Pegawai peg4 = new Pegawai("2009132", "Yura", "Jakarta");
        peg4.setGaji(8500000);
        daf.addPegawai(peg4);
        
        Dosen ds = new Dosen("20002938", "Akbar", "Surabaya");
        ds.setTarif_sks(1000000);
        ds.setSKS(9);
        ds.setGaji(ds.getGajiDosen());
        daf.addPegawai(ds);
        
        Dosen ds1 = new Dosen("20002939", "Berlina", "Gresik");
        ds1.setTarif_sks(1000000);
        ds1.setSKS(8);
        ds1.setGaji(ds1.getGajiDosen());
        daf.addPegawai(ds1);
        
        daf.printSemuaGaji();
        
    }
}
