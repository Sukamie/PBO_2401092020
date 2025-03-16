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
public class InputTugas4112 {
    public static void main(String[] args){
        BufferedReader dataIn  = new BufferedReader(new InputStreamReader(System.in));
        int number1 = 0;
        int number2 = 0;
        int number3 = 0;
        
        try{
            System.out.print("Enter number 1 : ");
            number1 = Integer.parseInt(dataIn.readLine());
            System.out.print("Enter number 2 : ");
            number2 = Integer.parseInt(dataIn.readLine());
            System.out.print("Enter number 3 : ");
            number3 = Integer.parseInt(dataIn.readLine());
        }
        catch(IOException e){
                System.out.println("Error in getting input");
        }
        System.out.println("Average is : " + (number1 + number2 + number3) / 3);
        
    }
}
