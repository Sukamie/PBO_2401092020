/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database_project1.model;

import java.util.Date;

/**
 *
 * @author Suga
 */
public class Peminjaman {
    private Anggota anggota;
    private Buku buku;
    private String tglPinjam;
    private String tglKembali;

    public Peminjaman() {
    }

    public Anggota getAnggota() {
        return anggota;
    }

    public Buku getBuku() {
        return buku;
    }

    public String getTglPinjam() {
        return tglPinjam;
    }

    public String getTglKembali() {
        return tglKembali;
    }

    public void setAnggota(Anggota anggota) {
        this.anggota = anggota;
    }

    public void setBuku(Buku buku) {
        this.buku = buku;
    }

    public void setTglPinjam(String tglPinjam) {
        this.tglPinjam = tglPinjam;
    }

    public void setTglKembali(String tglKembali) {
        this.tglKembali = tglKembali;
    }
    
}
