/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import entities.Branche;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import tools.MaConnexion;

/**
 *
 * @author LENOVO
 */
public class BrancheService implements IService <Branche>{
Connection cnx= MaConnexion.getInstance().getCnx();
    @Override
    public void ajouter(Branche y) {
        String sql ="insert into Branche(Nombranche,Contact, Emplacement, Heureo, Heuref, Imageb ) values(?,?,?,?,?,?) ";
        try {
            PreparedStatement ste =cnx.prepareStatement(sql);
            ste.setString(1, y.getNomBranche());
            ste.setString(2, y.getContact());//lezem tkoun 8
            ste.setString(3, y.getEmplacement());
            ste.setString(4, y.getHeureo());
            ste.setString(5, y.getHeuref());
            ste.setString(6, y.getImageb());
            ste.executeUpdate();
            System.out.println("Branche Ajoutée");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    @Override
    public List<Branche> afficher() {
        List<Branche> branches = new ArrayList<>();
        String sql ="select * from Branche";
        try {
            Statement ste= cnx.createStatement();
            ResultSet rs =ste.executeQuery(sql);
            while(rs.next()){
                Branche b = new Branche();
                b.setIdbranche(rs.getInt("Idbranche"));
                b.setNomBranche(rs.getString("NomBranche"));
                b.setContact(rs.getString("Contact"));
                b.setEmplacement(rs.getString("Emplacement"));
                b.setHeureo(rs.getString("Heureo"));
                b.setHeureo(rs.getString("Heuref"));
                branches.add(b);
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return branches;
    }

    @Override
    public void modifier(Branche y) {
            String sql="update Branche set Nombranche=?, Contact=?, Emplacement=?,  Heureo= ?, Heuref= ?, Imageb=? where Idbranche='"+y.getIdbranche()+"'";
            try {
            PreparedStatement ste =cnx.prepareStatement(sql);
            ste.setString(1, y.getNomBranche());
            ste.setString(2, y.getContact());
            ste.setString(3, y.getEmplacement());
            ste.setString(4, y.getHeureo());
            ste.setString(5, y.getHeuref());
            ste.setString(6, y.getImageb());
            ste.executeUpdate();
            System.out.println("Branche Modifié");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    @Override
    public void supprimer(Branche y) {
        String sql="delete from branche where Idbranche = '"+y.getIdbranche()+"'";
        try {            
            PreparedStatement ste =cnx.prepareStatement(sql);           
            ste.executeUpdate(sql);
            System.out.println("Branche supprimé");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
}
