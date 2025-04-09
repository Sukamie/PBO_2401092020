/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zahran180325;

/**
 *
 * @author Suga
 */
public class Tugas773 {
    public static void main(String[] args){
        
        int i;
        
        String[][] data ={
            {"Florence", "735-1234", "Manila"},
            {"Joyce", "983-3333", "Quezon City"},
            {"Becca", "456-3322", "Manila"}
        };
        
        for(i=0;i<data.length;i++){
            System.out.println("Name    : " + data[i][0]);
            System.out.println("Phone   : " + data[i][1]);
            System.out.println("Address : " + data[i][2]);
            System.out.println();
        };
    }
}
