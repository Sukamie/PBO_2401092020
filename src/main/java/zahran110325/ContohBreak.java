/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zahran110325;

/**
 *
 * @author Suga
 */
public class ContohBreak {
    public static void main(String[] args){
        String names[] = {"Beah", "Bianca", "Lance", "Belle",
            "Nico", "Yza", "Gem", "Ethan"};
        
        String searchName = "Abel";
        boolean foundName = false;
        
        for(int i=0; i<names.length; i++){
            if(names[i].equals(searchName)){
                foundName = true;
                break;
            }
        }
        
        if(foundName){
            System.out.println(searchName + " "  + "Found!");
        }else{
            System.out.println(searchName + " "  +  "Not Found!");
        }
    }
}
