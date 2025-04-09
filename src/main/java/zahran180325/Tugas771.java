/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zahran180325;

/**
 *
 * @author Suga
 */
public class Tugas771 {
 public static void main(String[] args){
    String days[]  = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
    int i = 0;
    int j = 0;
    
    while(i<days.length){
        System.out.println("Hari ke ->" + (i+1) + " " +  "adalah :" + days[i]);
        i++;
    }
    
    System.out.println("");
    System.out.println("WHEN USE DO WHILE");
    do{
       System.out.println("Hari ke ->" + (j+1) + " " +  "adalah :" + days[j]);
       j++;
    }while(j<days.length);
    
    System.out.println("");
    System.out.println("WHEN USE FOR");
    
    for(i=0;i<days.length;i++)
    {
        System.out.println("Hari ke ->" + (i+1) + " " +  "adalah :" + days[i]);
    }
 }   
}
