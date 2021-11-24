/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;

import java.util.ArrayList;
import java.sql.*;
/**
 *
 * @author VivoBook
 */
public class Peminjaman {
    private int idpeminjaman;
    private Anggota anggota;
    private Buku buku;
    private String tanggalpinjam;
    private String tanggalkembali;

    public int getIdpeminjaman() {
        return idpeminjaman;
    }

    public void setIdpeminjaman(int idpeminjaman) {
        this.idpeminjaman = idpeminjaman;
    }

    public Anggota getAnggota() {
        return anggota;
    }

    public void setAnggota(Anggota anggota) {
        this.anggota = anggota;
    }

    public Buku getBuku() {
        return buku;
    }

    public void setBuku(Buku buku) {
        this.buku = buku;
    }


    public String getTanggalpinjam() {
        return tanggalpinjam;
    }

    public void setTanggalpinjam(String tanggalpinjam) {
        this.tanggalpinjam = tanggalpinjam;
    }

    public String getTanggalkembali() {
        return tanggalkembali;
    }

    public void setTanggalkembali(String tanggalkembali) {
        this.tanggalkembali = tanggalkembali;
    }

    
    public Peminjaman(){}

    public Peminjaman(Anggota anggota, Buku buku, String tanggalpinjam, String tanggalkembali) {
        this.anggota = anggota;
        this.buku = buku;
        this.tanggalpinjam = tanggalpinjam;
        this.tanggalkembali = tanggalkembali;
    }
    
    public Peminjaman getById(int id) {
        Peminjaman pinjam = new Peminjaman();
        ResultSet rs = DBHelper.selectQuery("SELECT "
                                            + " p.idpeminjaman AS idpeminjaman, "
                                            + " p.idanggota AS idanggota, "
                                            + " p.idbuku AS idbuku, "
                                            + " p.tanggalpinjam AS tanggalpinjam, "
                                            + " p.tanggalkembali AS tanggalkembali, "
                                            + " b.idbuku AS idbuku, "
                                            + " b.judul AS judul, "
                                            + " b.penerbit AS penerbit, "
                                            + " b.penulis AS penulis, "
                                            + " a.idanggota as id anggota, "
                                            + " a.nama as nama,"
                                            + " a.alamat as alamat, "
                                            + " a.telepon as telepon "
                                            + " FROM peminjaman p "
                                            + " LEFT JOIN buku b ON b.idbuku = p.idbuku"
                                            + " LEFT JOIN anggota a ON a.idanggota=p.idanggota"
                                            + " WHERE p.idpeminjaman = '" + id + "'");
        try {
            while(rs.next()){
                pinjam = new Peminjaman();
                pinjam.setIdpeminjaman(rs.getInt("idpeminjaman"));
                pinjam.getAnggota().setIdanggota(rs.getInt("idanggota"));
                pinjam.getBuku().setIdbuku(rs.getInt("idbuku"));
                pinjam.setTanggalpinjam(rs.getString("tanggalpinjam"));
                pinjam.setTanggalkembali(rs.getString("tanggalkembali"));
            }
    }
    catch (Exception e) {
        e.printStackTrace();
    }
        return pinjam;
    }
    
    public ArrayList<Peminjaman> getAll() {
    ArrayList<Peminjaman> ListPeminjaman = new ArrayList();

        ResultSet rs = DBHelper.selectQuery("SELECT "
                                            + " p.idpeminjaman AS idpeminjaman, "
                                            + " p.idanggota AS idanggota, "
                                            + " p.idbuku AS idbuku, "
                                            + " p.tanggalpinjam AS tanggalpinjam, "
                                            + " p.tanggalkembali AS tanggalkembali, "
                                            + " b.idbuku AS idbuku, "
                                            + " b.judul AS judul, "
                                            + " b.penerbit AS penerbit, "
                                            + " b.penulis AS penulis, "
                                            + " a.idanggota as id anggota, "
                                            + " a.nama as nama,"
                                            + " a.alamat as alamat, "
                                            + " a.telepon as telepon "
                                            + " FROM peminjaman p "
                                            + " LEFT JOIN buku b ON b.idbuku = p.idbuku"
                                            + " LEFT JOIN anggota a ON a.idanggota=b.idanggota"
                                            + " ");                                
    try {
        while(rs.next()){
            Peminjaman pinjam = new Peminjaman();
            pinjam = new Peminjaman();
                pinjam.setIdpeminjaman(rs.getInt("idpeminjaman"));
                pinjam.getAnggota().setIdanggota(rs.getInt("idanggota"));
                pinjam.getBuku().setIdbuku(rs.getInt("idbuku"));
                pinjam.setTanggalpinjam(rs.getString("tanggalpinjam"));
                pinjam.setTanggalkembali(rs.getString("tanggalkembali"));

            ListPeminjaman.add(pinjam);
        }
    }
    catch (Exception e) {
        e.printStackTrace();
    }
        return ListPeminjaman;
    }

    public ArrayList<Peminjaman> search(String keyword) {
        ArrayList<Peminjaman> ListPeminjaman = new ArrayList();

        ResultSet rs = DBHelper.selectQuery("SELECT "
                                            + " p.idpeminjaman AS idpeminjaman, "
                                            + " p.idanggota AS idanggota, "
                                            + " p.idbuku AS idbuku, "
                                            + " p.tanggalpinjam AS tanggalpinjam, "
                                            + " p.tanggalkembali AS tanggalkembali, "
                                            + " b.idbuku AS idbuku, "
                                            + " b.judul AS judul, "
                                            + " b.penerbit AS penerbit, "
                                            + " b.penulis AS penulis, "
                                            + " a.idanggota as id anggota, "
                                            + " a.nama as nama,"
                                            + " a.alamat as alamat, "
                                            + " a.telepon as telepon "
                                            + " FROM peminjaman p "
                                            + " LEFT JOIN buku b ON b.idbuku = p.idbuku"
                                            + " LEFT JOIN anggota a ON a.idanggota=b.idanggota"
                                            + " WHERE p.idanggota LIKE '%" + keyword + "%' "
                                            + "  OR p.idbuku LIKE '%" + keyword + "%' ");
        try {
            while(rs.next()){
                Peminjaman pinjam;
                pinjam = new Peminjaman();
                pinjam.setIdpeminjaman(rs.getInt("idpeminjaman"));
                pinjam.getAnggota().setIdanggota(rs.getInt("idanggota"));
                pinjam.getBuku().setIdbuku(rs.getInt("idbuku"));
                pinjam.setTanggalpinjam(rs.getString("tanggalpinjam"));
                pinjam.setTanggalkembali(rs.getString("tanggalkembali"));

            ListPeminjaman.add(pinjam);
        }
    }
    catch (Exception e) {
        e.printStackTrace();
    }
        return ListPeminjaman;
    }
    
    public void save() {
        if(getById(idpeminjaman).getIdpeminjaman() == 0) {
            String SQL = "INSERT INTO peminjaman(idanggota, idbuku, tanggalpinjam, tanggalkembali) VALUES("
                        + " '" + this.getAnggota().getIdanggota()+ "', "
                        + " '" + this.getBuku().getIdbuku() +"', "
                        + " '" + this.tanggalpinjam + "', "
                        + " '" + this.tanggalkembali + "' "
                        + " )";
            this.idpeminjaman = DBHelper.insertQueryGetId(SQL);
        }
        else {
            String SQL = "UPDATE buku SET "
                        + " idanggota = '" + this.getAnggota().getIdanggota()+ "', "
                        + " idkbuku = '" + this.getBuku().getIdbuku() + "', "
                        + " tanggalpinjam = '" + this.tanggalpinjam + "', "
                        + " tanggalkembali = '" + this.tanggalkembali + "' "
                        + " WHERE idpeminjaman = '" + this.idpeminjaman + "'";
            DBHelper.executeQuery(SQL);
        }
    }

    public void delete() {
        String SQL = "DELETE FROM peminjaman WHERE idpeminjaman = '" + this.idpeminjaman + "'";
        DBHelper.executeQuery(SQL);
    }
}
