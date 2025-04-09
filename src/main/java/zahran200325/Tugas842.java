/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zahran200325;

/**
 *
 * @author Suga
 */
public class Tugas842 {
    public static void main(String[] args){
        int sum,difference,product,a,b;
        double quotient;
        
        a= Integer.parseInt(args[0]);
        b= Integer.parseInt(args[1]);
        
        sum= a+b;
        difference= a-b;
        product=a*b;
        quotient=a/b;
        
        System.out.println("Sum= " + sum);
        System.out.println("Difference= " + difference);
        System.out.println("product= " + product);
        System.out.println("Quotient= " + quotient);
        
    }
}
