/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database_project1.dao;

import database_project1.model.Anggota;
import database_project1.model.Buku;
import database_project1.model.Peminjaman;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Suga
 */
public class PeminjamanDb {

    public void insert(Peminjaman peminjaman) throws Exception {
        java.sql.Connection con = new Connection().getConnection();
        String sql = "insert into peminjaman values (?,?,?,?)";

        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, peminjaman.getAnggota().getKode());
        ps.setString(2, peminjaman.getBuku().getKode());
        ps.setString(3, peminjaman.getTglPinjam());
        ps.setString(4, peminjaman.getTglKembali());
        ps.executeUpdate();
    }
    
    
    public void update(Peminjaman peminjaman) throws Exception{
        java.sql.Connection con = new Connection().getConnection();
        String sql = "update peminjaman set tgl_kembali=? where kode_anggota=? and kode_buku=? and tgl_pinjam=?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, peminjaman.getTglKembali());
        ps.setString(2, peminjaman.getAnggota().getKode());
        ps.setString(3, peminjaman.getBuku().getKode());
        ps.setString(4, peminjaman.getTglPinjam());
        
        ps.executeUpdate();
    }

    public void delete(Peminjaman peminjaman) throws Exception {
        java.sql.Connection con = new Connection().getConnection();
        String sql = "delete from peminjaman where kode_anggota=?  and kode_buku=? and tgl_pinjam=?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, peminjaman.getAnggota().getKode());
        ps.setString(2, peminjaman.getBuku().getKode());
        ps.setString(3, peminjaman.getTglPinjam());

        ps.executeUpdate();
    }

    public Peminjaman getPeminjaman(String kodeAnggota, String kodeBuku, String tglPinjam) throws Exception {
        java.sql.Connection con = new Connection().getConnection();
        String sql = "select * from peminjaman where kode_anggota=? and kode_buku=? and tgl_pinjam=?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, kodeAnggota);
        ps.setString(2, kodeBuku);
        ps.setString(3, tglPinjam);
        ResultSet rs = ps.executeQuery();
        Peminjaman peminjaman = null;
        AnggotaDb anggotaDb = new AnggotaDb();
        BukuDb bukuDb = new BukuDb();

        if (rs.next()) {
            peminjaman = new Peminjaman();
            Anggota anggota = anggotaDb.getAnggota(rs.getString(1));
            peminjaman.setAnggota(anggota);
            Buku buku = bukuDb.getBuku(rs.getString(2));
            peminjaman.setBuku(buku);
            peminjaman.setTglPinjam(rs.getString(3));
            peminjaman.setTglKembali(rs.getString(4));
        }

        return peminjaman;
    }

    public List<Peminjaman> getAllPeminjaman() throws Exception {
        java.sql.Connection con = new Connection().getConnection();
        String sql = "select * from peminjaman";
        PreparedStatement ps = con.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        List<Peminjaman> list = new ArrayList<>();
        Peminjaman peminjaman = null;
        AnggotaDb anggotaDb = new AnggotaDb();
        BukuDb bukuDb = new BukuDb();

        while (rs.next()) {
            peminjaman = new Peminjaman();
            Anggota anggota = anggotaDb.getAnggota(rs.getString(1));
            peminjaman.setAnggota(anggota);
            Buku buku = bukuDb.getBuku(rs.getString(2));
            peminjaman.setBuku(buku);
            peminjaman.setTglPinjam(rs.getString(3));
            peminjaman.setTglKembali(rs.getString(4));
            list.add(peminjaman);
        }
        return list;
    }
}
