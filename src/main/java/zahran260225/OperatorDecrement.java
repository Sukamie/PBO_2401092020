/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zahran260225;

/**
 *
 * @author Suga
 */
public class OperatorDecrement {
    public static void main(String[] args) {
        int i1 = 10;
        int j1 = 3;
        int k1 = 0;
        
        int i2 = 10;
        int j2 = 3;
        int k2 = 0;
        
        k1 = --j1 + i1;
        System.out.println("nilai 'I' adalah : " +i1);
        System.out.println("nilai 'J' adalah : " +j1);
        System.out.println("nilai 'K' adalah : " +k1);
        
        System.out.println();
        
        k2 = j2-- + i2;
        System.out.println("nilai 'I-2' adalah : " +i2);
        System.out.println("nilai 'J-2' adalah : " +j2);
        System.out.println("nilai 'K-2' adalah : " +k2);
    }
}
