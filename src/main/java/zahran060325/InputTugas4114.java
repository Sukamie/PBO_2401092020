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
public class InputTugas4114 {
    public static void main(String [] args){
        BufferedReader dataIn  = new BufferedReader(new InputStreamReader(System.in));
        
        int a=0;
        int b=0;
        int c=0;
        int d=0;
        int e=0;
        int f=0;
        int g=0;
        int h=0;
        
        int r=0;
        int s=0;
        int t=0;
        int u=0;
        int v=0;
        int w=0;
        int x=0;
        int y=0;
        
        double hasil1;
        double hasil2;
        double hasil3;
        
        try{
            System.out.print("Enter number 'A' : ");
            a = Integer.parseInt(dataIn.readLine());
            System.out.print("Enter number 'B' : ");
            b = Integer.parseInt(dataIn.readLine());
            System.out.print("Enter number 'C' : ");
            c = Integer.parseInt(dataIn.readLine());
            System.out.print("Enter number 'D' : ");
            d = Integer.parseInt(dataIn.readLine());
            System.out.print("Enter number 'E' : ");
            e = Integer.parseInt(dataIn.readLine());
            System.out.print("Enter number 'F' : ");
            f = Integer.parseInt(dataIn.readLine());
            System.out.print("Enter number 'G' : ");
            g = Integer.parseInt(dataIn.readLine());
            System.out.print("Enter number 'H' : ");
            h = Integer.parseInt(dataIn.readLine());
            
            System.out.println("========PEMBATAS=========");
            
            System.out.print("Enter number 'R' : ");
            r = Integer.parseInt(dataIn.readLine());
            System.out.print("Enter number 'S' : ");
            s = Integer.parseInt(dataIn.readLine());
            System.out.print("Enter number 'T' : ");
            t = Integer.parseInt(dataIn.readLine());
            System.out.print("Enter number 'U' : ");
            u = Integer.parseInt(dataIn.readLine());
            System.out.print("Enter number 'V' : ");
            v = Integer.parseInt(dataIn.readLine());
            System.out.print("Enter number 'W' : ");
            w = Integer.parseInt(dataIn.readLine());
            System.out.print("Enter number 'X' : ");
            x = Integer.parseInt(dataIn.readLine());
            System.out.print("Enter number 'Y' : ");
            y = Integer.parseInt(dataIn.readLine());
        }
        catch(IOException error){
            System.out.println("Error in getting input");
        }
        
        hasil1= (a/Math.pow(Math.pow(b,c),d))-e+f-(g*h)+1;
        hasil2= (((3*10)*2)/15)-2+Math.pow(Math.pow(4,2),2);
        hasil3= (((Math.pow(r, s) * t) / u) - v + Math.pow(w, x) - y++);
        
        System.out.println("Hasil Pertama: " + hasil1);
        System.out.println("Hasil Kedua: " + hasil2);
        System.out.println("Hasil Ketiga: " + hasil3);
    }  
}
