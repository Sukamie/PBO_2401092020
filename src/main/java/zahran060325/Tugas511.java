/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zahran060325;
import java.io.*;
/**
 *
 * @author Suga
 */
public class Tugas511 {
    public static void main(String[] args){
        BufferedReader dataIn  = new BufferedReader(new InputStreamReader(System.in));
        String word1="";
        String word2="";
        String word3="";
        
        try{
         System.out.print("Enter word 1 : ");
         word1 = dataIn.readLine();
         System.out.print("Enter word 2 : ");
         word2= dataIn.readLine();
         System.out.print("Enter word 3 : ");
         word3 = dataIn.readLine();
        }
        catch(IOException e){
            System.out.println("Error in getting input");
        }
        System.out.println(word1 + " " + word2 + " " + word3);
    }
}
