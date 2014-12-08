/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tictac;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Manoj Lakshan
 */
public class SinglePlayerDA {
    
    Connection connection;
    
    public void write(String PlayerName,int PlayerScore,int CompScore){
        try {
            
                Class.forName("com.mysql.jdbc.Driver");  // this will load the MySQL driver, each DB has its own driver
                // setup the connection with the DB.
                connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/" + "playerinfodb"+ "?" + "user=root");
                //result set filter by name annd no
                //sorted by no in ASCENDING order
                connection.createStatement().execute("INSERT INTO `playerinfodb`.`sigleplayertable` (\n" +"`Name` ,\n" +"`ComScore` ,\n" +"`PlayerScore`\n" +")\n" +"VALUES (\n" +"'"+PlayerName+"', '"+CompScore+"', '"+PlayerScore+"'\n" +");");
                System.out.println("writing finished");
        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println("not written");
            JOptionPane.showMessageDialog(null, ex.getLocalizedMessage(), "Fatal Error", JOptionPane.ERROR_MESSAGE); 
        }
    }
    
}
