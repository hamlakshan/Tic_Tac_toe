/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package game;

import java.util.Random;

/**
 *
 * @author Manoj Lakshan
 */
public class Game {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // TODO code application logic here
        /*int i=new Random().nextInt(10);
        int count=0;
        while(true){
            System.out.println("count is "+ count++);
            if(i==2){
                System.out.println("2 is printed");
                break;
            }
            i=new Random().nextInt(10);
        }*/
        
        System.out.println("printing man ");
        new Interface().setVisible(true);
        
    }
    
}
