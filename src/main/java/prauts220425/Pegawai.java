/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prauts220425;

/**
 *
 * @author Suga
 */
public class Pegawai {
    private String nip;
    private String nama;
    private int golongan;
    private double gapok;
    private double tunjangan;
    
    public Pegawai(String nama, String nip, int golongan){
        this.nama= nama;
        this.nip = nip;
        this.golongan = golongan;
        if (golongan == 1){
            this.gapok = 1000000;
        }else if(golongan == 2){
            this.gapok = 2000000;
        }else{
            this.gapok = 3000000;
        }
        
        
    }
    
    public String getNama(){
        return nama;
    }
    
    public String getNip(){
        return nip;
    }
    
    public int getGolongan(){
        return golongan;
    }
    
    public double getGapok(){
        return gapok;
    }
    
    public double getTunjangan(){
        return gapok*0.05;
    }
    
    public double getTotal(){
        return gapok+getTunjangan();
    }
}