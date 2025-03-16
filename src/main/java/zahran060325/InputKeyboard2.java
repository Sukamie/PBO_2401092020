/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zahran060325;
import javax.swing.JOptionPane;
/**
 *
 * @author Suga
 */
public class InputKeyboard2 {
    public static void main(String[] args){
        String name="";
        name = JOptionPane.showInputDialog("Please enter ur name in the game: ");
        
        String msg = "Hi, im a baymax, hello "+ name  + "!";
        JOptionPane.showMessageDialog(null, msg);
    }
}
