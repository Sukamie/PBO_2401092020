/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan100425;

/**
 *
 * @author Suga
 */
public class Academic extends StudentRecord{
    public Academic(){
        super.name="Budi";
        super.course="MTK";
        super.grade=90;
    }
    
    public String getName(){
        return name;
    }
}
