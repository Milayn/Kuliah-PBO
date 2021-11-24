/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frontend;

import backend.*;

/**
 *
 * @author VivoBook
 */
public class TestBackend {
    public static void main(String[] args){
        //KATEGORI
//        Kategori kat1 = new Kategori("Novel", "Koleksi buku novel");
//        Kategori kat2 = new Kategori("Referensi", "Buku referensi ilmiah");
//        Kategori kat3 = new Kategori("Komik", "Komik anak-anak");
//
//        // test insert
//        kat1.save();
//        kat2.save();
//        kat3.save();
//
//        // test update
//        kat2.setKeterangan("Koleksi buku referensi ilmiah");
//        kat2.save();
//
//        // test delete
//        kat3.delete();
//
//        // test select all
//        for(Kategori k : new Kategori().getAll()){
//            System.out.println("Nama: " + k.getNama() + ", Ket: " + k.getKeterangan());
//        }
//
//        // test search
//        for(Kategori k : new Kategori().search("ilmiah"))
//        {
//            System.out.println("Nama: " + k.getNama() + ", Ket: " + k.getKeterangan());
//        }
        

//       //ANGGOTA
//        Anggota ang1 = new Anggota("Mila", "Malang", "082192822298");
//        Anggota ang2 = new Anggota("Yunita", "Surabaya", "083928912728");
//        Anggota ang3 = new Anggota("Anggi", "Malang", "081229287381");
//
//        // test insert
//        ang1.save();
//        ang2.save();
//        ang3.save();
//
//        // test update
//        ang2.setAlamat("Sidoarjo");
//        ang2.save();
//
//        // test delete
//        ang3.delete();
//
//        // test select all
//        for(Anggota a : new Anggota().getAll()){
//            System.out.println("Nama: " + a.getNama() + ", Alamat: " + a.getAlamat()+ ", Telepon: " + a.getTelepon());
//        }
//
//        // test search
//        for(Anggota a : new Anggota().search("Mila"))
//        {
//            System.out.println("Nama: " + a.getNama() + ", Alamat: " + a.getAlamat()+ ", Telepon: " + a.getTelepon());
//        }

          
        // --BUKU--
//          Kategori novel = new Kategori().getById(19);
//          Kategori referensi = new Kategori().getById(20);
//
//          Buku buku1 = new Buku(novel, "Timun Mas", "Elex Media", "Bang Supit");
//          Buku buku2 = new Buku(referensi, "Metode Linier", "Springer", "Alex Baldwin");
//          Buku buku3 = new Buku(novel, "Bintang Terang", "Erlangga", "Mat Sewoot");
//
//            // test insert
//                buku1.save();
//                buku2.save();
//
//            // test update
//                buku2.setJudul("Aljabar Linier");
//                buku2.save();
//
//            // test delete
//                buku3.delete();
//
//            // test select all
//            for(Buku b : new Buku().getAll())
//            {
//                System.out.println("Kategori: " + b.getKategori().getNama() + ", Judul: " + b.getJudul());
//            }
//
//        // test search
//        for(Buku b : new Buku().search("timun"))
//        {
//            System.out.println("Kategori: " + b.getKategori().getNama() + ", Judul: " + b.getJudul());
//        }
        
        //PEMINJAMAN
          Buku timunmas = new Buku().getById(7);
          Buku sphere = new Buku().getById(9);
          
          Anggota a1 = new Anggota().getById(19);
          Anggota a2 = new Anggota().getById(20);
          Anggota a3 = new Anggota().getById(22);
          
          Peminjaman p = new Peminjaman(a1, timunmas, "20211123", "20211127");
          Peminjaman p1 = new Peminjaman(a2, sphere, "20211117", "20211113");
          Peminjaman p2 = new Peminjaman(a3, timunmas, "20211115", "20211110");

            // test insert
                p.save();
                p1.save();

            // test update
                p.setTanggalkembali("20211121");
                p.save();

            // test delete
                p2.delete();

            // test select all
            for(Peminjaman pjm : new Peminjaman().getAll())
            {
                System.out.println("Anggota: " + pjm.getAnggota().getNama() + ""
                        + ", Buku: " + pjm.getBuku().getJudul()+ ", "
                        + "  Tanggal Pinjam: " +pjm.getTanggalpinjam()+","
                        + "  Tanggal Kembali: " +pjm.getTanggalkembali());
            }

        // test search
        for(Peminjaman pjm : new Peminjaman().search("timun"))
        {
            System.out.println("Anggota: " + pjm.getAnggota().getNama() + ""
                        + ", Buku: " + pjm.getBuku().getJudul()+ ", "
                        + "  Tanggal Pinjam: " +pjm.getTanggalpinjam()+","
                        + "  Tanggal Kembali: " +pjm.getTanggalkembali());
        }
    }
}
