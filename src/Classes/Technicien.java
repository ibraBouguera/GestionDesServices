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
public class Technicien {
    int id, id_administrateur;
    String nom,prenom,login,password;

    public void setId(int id) {
        this.id = id;
    }

    public void setId_administrateur(int id_administrateur) {
        this.id_administrateur = id_administrateur;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Technicien() {
    }

    public int getId() {
        return id;
    }

    public int getId_administrateur() {
        return id_administrateur;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }
    
}
