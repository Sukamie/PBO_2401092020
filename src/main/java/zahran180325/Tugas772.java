/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zahran180325;
import java.io.*;
import javax.swing.JOptionPane;
/**
 *
 * @author Suga
 */
public class Tugas772 {
    public static void main(String[] args){
        BufferedReader dataIn  = new BufferedReader(new InputStreamReader(System.in));
        
        int[] nilaiBR= new int[10];
        int[] nilaiJOR= new int[10];
        int i,j,max;
        
        
        try{
            for(i=0;i<10;i++){
              System.out.print("Enter nilai" + " " + (i+1) + ":");
              nilaiBR[i] = Integer.parseInt(dataIn.readLine());  
            }
        }
        catch(IOException error){
            System.out.println("Error in getting input");
        }
        System.out.print("Nilainya : ");
        for(i=0;i<10;i++){
            System.out.print(nilaiBR[i]+" ");
        }
        
        max= 0;
        
        for(i=0;i<10;i++){
            if(nilaiBR[i]> max){
                max = nilaiBR[i];
            }
        }
        
        System.out.println("\n");
        System.out.println("nilai tertinggi: " + max);
        
        
        String output = "";
        
        for(j=0;j<10;j++){
            String input = JOptionPane.showInputDialog("Masukkan nilai ke-" + (j+1) + ":");
            nilaiJOR[j] = Integer.parseInt(input);
        }
        
        max=0;
        for(j=0;j<10;j++){
            if(nilaiJOR[j]>max){
                max =nilaiJOR[j];
            }
        }
        
        output = "Nilai tertinggi adalah :  " + max;
        JOptionPane.showMessageDialog(null, output);
        
    }
}
