
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tictac;

/**
 *
 * @author HP
 */
public class TicTac {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic 
        new MultiPlayerDA().write("Tharaka", 5, "Dilan",0 );
        Front front=new Front();
        front.setVisible(true);
        front.setTitle("Tic Tac Toe");
//        front.load.initialize();
     //   front.load.setVisible(false);
        
    }
}
