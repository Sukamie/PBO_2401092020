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
public class InputTugas4111 {
    public static void main(String[] args){
        BufferedReader dataIn  = new BufferedReader(new InputStreamReader(System.in));
        int number = 0;
        char letter = 'a';
        boolean result = true;
        String str  = "";
        
        try{
            System.out.print("Enter number : ");
            number = Integer.parseInt(dataIn.readLine());
            System.out.print("Enter Char : ");
            letter = dataIn.readLine().charAt(0);
            System.out.print("Enter Boolean: ");
            result = Boolean.parseBoolean(dataIn.readLine());
            System.out.print("Enter String : ");
            str = dataIn.readLine();
        }
            catch(IOException e){
                System.out.println("Error in getting input");
        }
            System.out.println("");
            System.out.println(number);
            System.out.println(letter);
            System.out.println(result);
            System.out.println(str);
    }
}
