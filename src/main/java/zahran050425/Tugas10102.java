/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zahran050425;
import java.io.*;
/**
 *
 * @author Suga
 */
public class Tugas10102 {
    static BukuAlamat[] daftarKontak = new BukuAlamat[10];
    static int jumlahKontak=0;
    
    static BufferedReader dataIn  = new BufferedReader(new InputStreamReader(System.in));
    
    public static void tambahKontak() throws IOException {
        if(jumlahKontak >= 10){
            System.out.println("Kontak Full Cuy!");
            return;
        }
        
        System.out.print("Masukkan nama: ");
        String nama = dataIn.readLine();
        
        System.out.print("Masukkan alamat: ");
        String alamat = dataIn.readLine();
        
        System.out.print("Masukkan No telepon: ");
        String noTelp = dataIn.readLine();
        
        System.out.print("Masukkan email: ");
        String email = dataIn.readLine();
        
        daftarKontak[jumlahKontak] = new BukuAlamat(nama, alamat, noTelp, email);
        jumlahKontak++;
        
        System.out.println("Kontak baru ditambahkan!\n");
    }
    
    public static void tampilKontak(){
        if(jumlahKontak == 0){
            System.out.println("Lu introvert.");
            return;
        }
        
        System.out.println("\n=== Daftar Kontak ===");
        
        for (int i = 0; i < jumlahKontak; i++) {
            System.out.println("Data ke-" + (i + 1));
            System.out.println("Nama: " + daftarKontak[i].getNama());
            System.out.println("Alamat: " + daftarKontak[i].getAlamat());
            System.out.println("Nomor Telepon: " + daftarKontak[i].getNoTelp());
            System.out.println("Email: " + daftarKontak[i].getEmail());
            System.out.println("---------------------------");
        }
    }
    
    public static void hapusKontak() throws IOException{
        tampilKontak();
        System.out.print("Masukkan nomor data yang akan dihapus (1 - " + jumlahKontak + "): ");
        int index = Integer.parseInt(dataIn.readLine()) - 1;
        
        if(index >= 0 && index < jumlahKontak){
            for (int i = index; i<jumlahKontak-1; i++){
                daftarKontak[i] = daftarKontak[i+1];
            }
            
            daftarKontak[jumlahKontak - 1] = null;
            jumlahKontak--;
            System.out.println("Kontak dah dihapus,jahat sih elu");
            
        }else{
            System.out.println("Salah indexnya pak cik!");
        }
    }
    
    public static void updateKontak() throws IOException{
        tampilKontak();
        System.out.print("Masukkan nomor data yang akan diupdate (1 - " + jumlahKontak + "): ");
        int index = Integer.parseInt(dataIn.readLine()) - 1;
        
        if(index >= 0 && index < jumlahKontak){
            
            System.out.print("Masukkan nama: ");
            String nama = dataIn.readLine();
        
            System.out.print("Masukkan alamat: ");
            String alamat = dataIn.readLine();
        
            System.out.print("Masukkan No telepon: ");
            String noTelp = dataIn.readLine();
        
            System.out.print("Masukkan email: ");
            String email = dataIn.readLine();
            
            daftarKontak[index].setNama(nama);
            daftarKontak[index].setAlamat(alamat);
            daftarKontak[index].setNoTelp(noTelp);
            daftarKontak[index].setEmail(email);
            
            System.out.println("Kontak dah diupdate!");
            
        }else{
            System.out.println("Salah indexnya pak cik!");
        }
    }
    
    public static void main(String[] args) throws IOException{
        int pilihan;
        
        do{
            System.out.println("\n====== Menu Kontak ======");
            System.out.println("1. tambah kontak");
            System.out.println("2. tampilin kontak");
            System.out.println("3. hapus kontak (introvert amat sih)");
            System.out.println("4. update kontak");
            System.out.print("mau yang mana : ");
            pilihan = Integer.parseInt(dataIn.readLine());
            
            switch(pilihan){
                case 1:
                    tambahKontak();
                    break;
                case 2:
                    tampilKontak();
                    break;
                case 3:
                    hapusKontak();
                    break;
                case 4:
                    updateKontak();
                    break;
                    
                case 5:
                    System.out.println("Makasih sudah liat aplikasi ini!");
                    break;
                default:
                    System.out.print("Not Found!!");
            }
        }while(pilihan != 5);
    }
}
