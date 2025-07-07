/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database_project1.controller;

import database_project1.dao.AnggotaDb;
import database_project1.dao.BukuDb;
import database_project1.dao.PeminjamanDb;
import database_project1.model.Anggota;
import database_project1.model.Buku;
import database_project1.model.Peminjaman;
import database_project1.views.FormPeminjaman;
import java.util.List;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Suga
 */
public class PeminjamanController {

    private FormPeminjaman formPeminjaman;
    private Peminjaman peminjaman;
    private PeminjamanDb dao;
    private AnggotaDb anggotaDao;
    private BukuDb bukuDao;

    public PeminjamanController(FormPeminjaman formPeminjaman) {
        this.formPeminjaman = formPeminjaman;
        dao = new PeminjamanDb();
        anggotaDao = new AnggotaDb();
        bukuDao = new BukuDb();
    }

    public void clearScreen() {
        anggotaCodeOption();
        bukuCodeOption();
        formPeminjaman.getFieldTglPinjam().setText(" ");
        formPeminjaman.getFieldTglKembali().setText(" ");
    }

    public void insert() {
        try {
            peminjaman = new Peminjaman();

            String kodeAnggota = formPeminjaman.getOptionKodeAnggota()
                    .getSelectedItem().toString().split("-")[0];
            String kodeBuku = formPeminjaman.getOptionKodeBuku()
                    .getSelectedItem().toString();

            Anggota anggota = anggotaDao.getAnggota(kodeAnggota);
            Buku buku = bukuDao.getBuku(kodeBuku);

            peminjaman.setAnggota(anggota);
            peminjaman.setBuku(buku);
            peminjaman.setTglPinjam(formPeminjaman.getFieldTglPinjam().getText());
            peminjaman.setTglKembali(formPeminjaman.getFieldTglKembali().getText());
            dao.insert(peminjaman);

        } catch (Exception ex) {
            Logger.getLogger(PeminjamanController.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void update() {
        try {
            String kodeAnggota = formPeminjaman.getOptionKodeAnggota()
                    .getSelectedItem().toString().split("-")[0];
            String kodeBuku = formPeminjaman.getOptionKodeBuku()
                    .getSelectedItem().toString();
            
            Anggota anggota = anggotaDao.getAnggota(kodeAnggota);
            Buku buku = bukuDao.getBuku(kodeBuku);
            
            peminjaman = new Peminjaman();
            peminjaman.setTglKembali(formPeminjaman.getFieldTglKembali().getText());
            peminjaman.setAnggota(anggota);
            peminjaman.setBuku(buku);
            peminjaman.setTglPinjam(formPeminjaman.getFieldTglPinjam().getText());
            
            try {
                dao.update(peminjaman);
                JOptionPane.showMessageDialog(formPeminjaman, "Update Data Ok!");
            } catch (Exception ex) {
                Logger.getLogger(PeminjamanController.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (Exception ex) {
            Logger.getLogger(PeminjamanController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void delete() {
        try {
            if (peminjaman != null) {
                dao.delete(peminjaman);
            } else {
                JOptionPane.showMessageDialog(formPeminjaman, "Data Not Found");
            }

        } catch (Exception ex) {
            Logger.getLogger(PeminjamanController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void anggotaCodeOption() {
        try {
            List<Anggota> anggotaList = anggotaDao.getAllAnggota();
            formPeminjaman.getOptionKodeAnggota().removeAllItems();
            for (Anggota anggota : anggotaList) {
                formPeminjaman.getOptionKodeAnggota().addItem(anggota.getKode() + "-" + anggota.getNama());
            }
        } catch (Exception ex) {
            Logger.getLogger(PeminjamanController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void bukuCodeOption() {
        try {
            List<Buku> bukuList = bukuDao.getAllBuku();
            formPeminjaman.getOptionKodeBuku().removeAllItems();
            for (Buku buku : bukuList) {
                formPeminjaman.getOptionKodeBuku().addItem(buku.getKode());
            }
        } catch (Exception ex) {
            Logger.getLogger(PeminjamanController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void search() {
        try {
            String kodeAnggota = formPeminjaman.getOptionKodeAnggota()
                    .getSelectedItem().toString().split("-")[0];
            String kodeBuku = formPeminjaman.getOptionKodeBuku()
                    .getSelectedItem().toString();
            String tglPinjam = formPeminjaman.getFieldTglPinjam().getText();
            peminjaman = dao.getPeminjaman(kodeAnggota, kodeBuku, tglPinjam);

            if (peminjaman != null) {
                formPeminjaman.getOptionKodeAnggota().setSelectedItem(peminjaman.getAnggota().getKode() + "-" + peminjaman.getAnggota().getNama());
                formPeminjaman.getOptionKodeBuku().setSelectedItem(peminjaman.getBuku().getKode());
                formPeminjaman.getFieldTglPinjam().setText(peminjaman.getTglPinjam());
                formPeminjaman.getFieldTglKembali().setText(peminjaman.getTglKembali());
            } else {
                JOptionPane.showMessageDialog(formPeminjaman, "Data not found!");
            }
        } catch (Exception ex) {
            Logger.getLogger(PeminjamanController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void viewData() {

        try {
            DefaultTableModel model = (DefaultTableModel) formPeminjaman.getTabelPeminjaman().getModel();

            model.setNumRows(0);
            List<Peminjaman> list = dao.getAllPeminjaman();
            for (Peminjaman peminjaman : list) {
                Object[] data = {
                    peminjaman.getAnggota().getKode(),
                    peminjaman.getBuku().getKode(),
                    peminjaman.getTglPinjam(),
                    peminjaman.getTglKembali()
                };
                model.addRow(data);
            }
        } catch (Exception ex) {
            Logger.getLogger(PeminjamanController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
