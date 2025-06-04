/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prauts220425;

import java.io.*;

/**
 *
 * @author Suga
 */
public class PegawaiExample {

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.print("Masukkan nama : ");
            String nama = br.readLine();

            System.out.print("Masukkan NIP : ");
            String nip = br.readLine();

            System.out.println("~List golongan pegawai~");
            System.out.println("1. Golongan 1A");
            System.out.println("2. Golongan 2A");
            System.out.println("3. Golongan 3A");
            System.out.println(" ");

            System.out.print("Masukkan golongan : ");
            int golongan = Integer.parseInt(br.readLine());

            Pegawai pg = new Pegawai(nama, nip, golongan);
            
            System.out.println(" ");
            System.out.println("\n Data Pegawai:");
            System.out.println("Nama      :  " + pg.getNama());
            System.out.println("NIP       :  " + pg.getNip());
            System.out.println("Golongan  :  " + pg.getGolongan());
            System.out.println("Gaji pokok:  " + pg.getGapok());
            System.out.println("Tunjangan :  " + pg.getTunjangan()) ;
            System.out.println("Total     :  " + pg.getTotal());
          
        }catch (IOException e){
            System.out.println("Terjadi kesalahan input: " + e.getMessage());
        }catch (NumberFormatException e ){
            System.out.println("Input golongan tidak valid!");
        }
    }
}
