package com.example.miage;
import java.util.Objects;
public class Personne {
    private String nom;
    private String prenom;
    Personne(String n, String p){
        nom=n;
        prenom=p;
    }
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public String getPrenom() {
        return prenom;
    }
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    @Override
    public String toString() {
        return nom + " " + prenom ;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Personne personne = (Personne) o;
        return Objects.equals(getNom(), personne.getNom()) &&
                Objects.equals(getPrenom(), personne.getPrenom());
    }
    @Override
    public int hashCode() {
        return Objects.hash(getNom(), getPrenom());
    }
}