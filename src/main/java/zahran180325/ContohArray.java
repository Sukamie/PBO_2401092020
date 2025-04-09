/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zahran180325;

/**
 *
 * @author Suga
 */
public class ContohArray {
    public static void main(String[] args)
    {
        boolean result[] = {true,false,true,false};
        double grades[]= {100, 90, 80,75};
        String days[]  = {"Senin","Selasa","Rabu","Kamis","Jumat","Sabtu","Minggu"};
        int i = 0;
        
        System.out.println("Result ke -> 0 adalah : "+ result[0]);
        
        while (i<days.length){
            System.out.println("Hari :" + days[i]);
            i++;
        }
    }
}
