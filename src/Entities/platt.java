/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

/**
 *
 * @author chaim
 */
public class platt {
    
    private int Idplat;
    private String Descplat;
    private String Nomplat;
    private String image;
    private int favorie;
    private int idcatt;
    //categorie c;
    public platt(){
        
    }
   
    public platt(int Idplat, String Descplat, String Nomplat, String image, int favorie, int  idcatt) {
        this.Idplat = Idplat;
        this.Descplat = Descplat;
        this.Nomplat = Nomplat;
        this.image = image;
        this.favorie = favorie;
        this.idcatt = idcatt;
    }

    public platt( String Descplat, String Nomplat, String image, int favorie,  int idcatt) {
       
        this.Descplat = Descplat;
        this.Nomplat = Nomplat;
        this.image = image;
        this.favorie = favorie;
        this.idcatt = idcatt;
    }
    
   public platt(int Idplat) {
        this.Idplat = Idplat;
    }


    

    public int getIdplat() {
        return Idplat;
    }

    public String getDescplat() {
        return Descplat;
    }

    public String getNomplat() {
        return Nomplat;
    }

    public String getimage() {
        return image;
    }

    public int getFavorie() {
        return favorie;
    }

   
    public int  getidcatt() {
        return idcatt;
    }

    public void setIdplat(int Idplat) {
        this.Idplat = Idplat;
    }

    public void setDescplat(String Descplat) {
        this.Descplat = Descplat;
    }

    public void setNomplat(String Nomplat) {
        this.Nomplat = Nomplat;
    }

    public void setimage(String image) {
        this.image = image;
    }

    public void setFavorie(int favorie) {
        this.favorie = favorie;
    }

    public void setidcatt(int idcatt) {
        this.idcatt = idcatt;
    }


    @Override
    public String toString() {
        return "plat{" + "Idplat=" + Idplat + ", Descplat=" + Descplat + ", Nomplat=" + Nomplat + ", image=" + image + ", favorie=" + favorie + ", idcatt=" + idcatt + '}';
    }
    
    
}
