/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tools;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author DELL PRCISION 3551
 */
public class MaCon {
     private Connection cnx;
    public String url="jdbc:mysql://localhost:3306/restaurant";
    public String user="root";
    public String pwd ="";
    private static MaCon mc;

    private MaCon() {
        try {
            cnx=DriverManager.getConnection(url, user, pwd);
            System.out.println("Connexion etablie");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            
        }
    }
    public static MaCon getInstance(){
        if(mc==null)
        mc = new MaCon();
        return mc;
    
}

    public Connection getCnx() {
        return cnx;
    }
    
    
}
