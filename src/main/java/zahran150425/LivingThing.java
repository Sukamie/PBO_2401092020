/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zahran150425;

/**
 *
 * @author Suga
 */
public abstract class LivingThing {
    public void breath(){
        System.out.println("Living thing breathing");
    }
    
    public void eat(){
        System.out.println("Living Thing Eating");
    }
    
    public abstract void walk();
}
