/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zahran100425;

/**
 *
 * @author Suga
 */
public class Student extends Person{
    public Student(){
//        super("Budi","Jayakarta");
        super.name = "Leon";
        super.address = "Raccoon City";
        System.out.println("Inside Student: Constructor");
        
    }
    
    public String getName(){
        System.out.println("Student: getName");
        return name;
    }
}

