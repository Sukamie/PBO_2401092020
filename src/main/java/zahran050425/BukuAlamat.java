/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zahran050425;

/**
 *
 * @author Suga
 */
public class BukuAlamat {
    //Atribut
    private String nama = "";
    private String alamat;
    private String noTelp;
    private String email;
    
    //Constructor
    public BukuAlamat(String nama, String alamat, String noTelp, String email){
        this.nama = nama;
        this.alamat = alamat;
        this.noTelp = noTelp;
        this.email = email;
    }
    
    //Accessor
    public String getNama(){
        return nama;
    }
    public String getAlamat(){
        return alamat;
    }
    public String getNoTelp(){
        return noTelp;
    }public String getEmail(){
        return email;
    }
    
    //Mutator
    public void setNama(String nama){
        this.nama = nama;
    }
    
    public void setAlamat(String alamat){
        this.alamat = alamat;
    }
    
    public void setNoTelp(String noTelp){
        this.noTelp = noTelp;
    }
    
    public void setEmail(String email){
        this.email = email;
    }
    
}
