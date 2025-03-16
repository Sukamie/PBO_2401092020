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
public class InputTugas4113 {
    public static void main(String[] args){
        BufferedReader dataIn  = new BufferedReader(new InputStreamReader(System.in));
        
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        int num4 = 0;
        int result = 0;
        
        try{
            System.out.print("Enter number 1 : ");
            num1 = Integer.parseInt(dataIn.readLine());
            System.out.print("Enter number 2 : ");
            num2 = Integer.parseInt(dataIn.readLine());
            System.out.print("Enter number 3 : ");
            num3 = Integer.parseInt(dataIn.readLine());
        }
        catch(IOException e){
            System.out.println("Error in getting input");
        }
        
        num4 = (num1 > num2)? num1 : num2;
        result = (num4 > num3)? num4 : num3;
        
        System.out.println("Angka terbesar adalah : " + result);
    }   
}
