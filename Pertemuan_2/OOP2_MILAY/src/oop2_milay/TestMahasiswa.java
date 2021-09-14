/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop2_milay;

/**
 *
 * @author VivoBook
 */
public class TestMahasiswa {
    public static void main(String[] args) {
        Mahasiswa mhs1 = new Mahasiswa();
        
        Mahasiswa mhs2 = new Mahasiswa();
        Mahasiswa mhs3 = new Mahasiswa();
        
        mhs1.nim=101;
        mhs1.nama="Mila Yunita";
        mhs1.alamat="Jl.Vinolia No 1A";
        mhs1.kelas="2C";
        mhs1.tampilBiodata();
    }
}
