/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan150425;

/**
 *
 * @author Suga
 */
public class Square extends Shape{
    private double side;
    
    public Square(double side){
        this.side = side;
    }

    @Override
    public double getArea() {
        return side*side;
    }

    @Override
    public String getName() {
        return "Square";
    }
}
    
