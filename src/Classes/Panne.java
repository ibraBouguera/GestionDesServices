/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author NetShadow
 */
public class Panne {
    int id,aministrateur;
    String type,lieu,date,etat;

    public int getId() {
        return id;
    }

    public int getAministrateur() {
        return aministrateur;
    }

    public String getType() {
        return type;
    }

    public String getLieu() {
        return lieu;
    }

    public String getDate() {
        return date;
    }

    public String getEtat() {
        return etat;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAministrateur(int aministrateur) {
        this.aministrateur = aministrateur;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setLieu(String lieu) {
        this.lieu = lieu;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setEtat(String etat) {
        this.etat = etat;
    }
    
}
