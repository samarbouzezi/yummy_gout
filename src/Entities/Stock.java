/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entités;


import java.sql.Date;

/**
 *
 * @author DELL PRCISION 3551
 */
public class Stock {
    private int ids;
    //private Fournisseur f;
    private int idf;
    private String noms;
    private Date date_ajout_s;
    private Date date_fin_s;
    private float prix_s;
    private int qt_s;

    public Stock() {
    }

    public Stock(int ids) {
        this.ids = ids;
    }

    public Stock(int idf, String noms, Date date_ajout_s, Date date_fin_s, float prix_s, int qt_s) {
        this.idf = idf;
        this.noms = noms;
        this.date_ajout_s = date_ajout_s;
        this.date_fin_s = date_fin_s;
        this.prix_s = prix_s;
        this.qt_s = qt_s;
    }

    public Stock(int ids, int idf, String noms, Date date_ajout_s, Date date_fin_s, float prix_s, int qt_s) {
        this.ids = ids;
        this.idf = idf;
        this.noms = noms;
        this.date_ajout_s = date_ajout_s;
        this.date_fin_s = date_fin_s;
        this.prix_s = prix_s;
        this.qt_s = qt_s;
    }

    public int getIds() {
        return ids;
    }

    public void setIds(int ids) {
        this.ids = ids;
    }

    public int getIdf() {
        return idf;
    }

    public void setIdf(int idf) {
        this.idf = idf;
    }

    public String getNoms() {
        return noms;
    }

    public void setNoms(String noms) {
        this.noms = noms;
    }

    public Date getDate_ajout_s() {
        return date_ajout_s;
    }

    public void setDate_ajout_s(Date date_ajout_s) {
        this.date_ajout_s = date_ajout_s;
    }

    public Date getDate_fin_s() {
        return date_fin_s;
    }

    public void setDate_fin_s(Date date_fin_s) {
        this.date_fin_s = date_fin_s;
    }

    public float getPrix_s() {
        return prix_s;
    }

    public void setPrix_s(float prix_s) {
        this.prix_s = prix_s;
    }

    public int getQt_s() {
        return qt_s;
    }

    public void setQt_s(int qt_s) {
        this.qt_s = qt_s;
    }

    public Stock(String noms, float prix_s) {
        this.noms = noms;
        this.prix_s = prix_s;
    }
    

    @Override
    public String toString() {
        return "Stock{" + "ids=" + ids + ", idf=" + idf + ", noms=" + noms + ", date_ajout_s=" + date_ajout_s + ", date_fin_s=" + date_fin_s + ", prix_s=" + prix_s + ", qt_s=" + qt_s + '}';
    }

}