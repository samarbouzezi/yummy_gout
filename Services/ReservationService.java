/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import entities.Reservation;
import IService.ReservationImpl;
import Tools.DataBaseConnection;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.lang.String;    
import java.time.LocalDate;

/**
 *
 * @author tchet
 */
public class ReservationService implements ReservationImpl<Reservation>{
    Connection connection = DataBaseConnection.getInstance().getCn();
 
    @Override
    public void ajouter(Reservation r) {
        
    try {
        String sql= "INSERT INTO reservation (description,emplacement,nb_personnes,Date_res,type_event,disponible,id_branche) values (?,?,?,?,?,?,?)" ;
        PreparedStatement  pste = connection.prepareStatement(sql);
            pste.setString(1, r.getDescription());
            pste.setString(2, r.getEmplacement());
            pste.setInt(3, r.getNb_personnes());
            String x = String.valueOf(r.getDate_res());
            pste.setDate(4,  java.sql.Date.valueOf(x));
            pste.setString(5, r.getType_event());
            pste.setBoolean(6, r.getDisponible());
            pste.setInt(7, r.getId_branche());
            
            pste.executeUpdate();
            System.out.println("Adding reservation with success");
    } catch (SQLException ex) {
        System.out.println(ex.getMessage());
    }
        
    }

    

    public void delete(Reservation r) {
         try {
       String sql= "delete from  reservation where id_reservation='"+r.getId_reservation()+"'" ;
            PreparedStatement  pste = connection.prepareStatement(sql);
          pste.executeUpdate();
            System.out.println("Deleting reservation with success");
    } catch (SQLException ex) {
        System.out.println(ex.getMessage());
    }
    }

   
    public void edit(Reservation r ) {
        try {
             
        String sql= "UPDATE reservation SET description=?, emplacement=?, nb_personnes=?, Date_res=?, type_event=?,disponible=?,Points=?, id_branche=? where id_reservation= '"+r.getId_reservation()+"'" ;
        PreparedStatement  pste = connection.prepareStatement(sql);
            
            pste.setString(1, r.getDescription());
            pste.setString(2, r.getEmplacement());
            pste.setInt(3, r.getNb_personnes());
            String x = String.valueOf(r.getDate_res());
            pste.setDate(4,  java.sql.Date.valueOf(x));
            pste.setString(5, r.getType_event());
            pste.setBoolean(6, r.getDisponible());
             pste.setInt(7, r.getPoints());
         pste.setInt(8, r.getId_branche());

            pste.executeUpdate();
            System.out.println("Editing reservation with success");
    } catch (SQLException ex) {
        System.out.println(ex.getMessage());
    }
    }
 


    
    @Override
    public List<Reservation> getAll() {
        
        List<Reservation> reservations = new ArrayList<Reservation>();
        String sql ="select * from reservation";
        try {
            Statement ste= connection.createStatement();
            ResultSet rs =ste.executeQuery(sql);
            while(rs.next()){
                Reservation r = new Reservation();
                r.setId_reservation(rs.getInt("id_reservation"));
                r.setDescription(rs.getString("description"));
                r.setEmplacement(rs.getString("emplacement"));
                r.setNb_personnes(rs.getInt("nb_personnes"));
                r.setDate_res(rs.getDate("date_res").toLocalDate());
                     r.setType_event(rs.getString("type_event"));
                   r.setDisponible(rs.getBoolean("disponible"));
                   r.setPoints(rs.getInt("points"));
                    r.setId_branche(rs.getInt("id_branche"));
                    reservations.add(r);
                   
            }
             System.out.println("This is our list ");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return reservations;
    
}
}