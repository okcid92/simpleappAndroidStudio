package com.example.miage;
import android.app.Application;
import java.util.ArrayList;
public class MonApplication extends Application {
    private ArrayList<Personne> personnes;
    public ArrayList<Personne> getPersonnes() {
        return personnes;
    }
    public void AjoutePersonne(Personne p){
        personnes.add(p);
    }
    public void EnlevePersonne(Personne p){
        personnes.remove(p);
    }
    @Override
    public void onCreate(){
        super.onCreate();
        personnes=new ArrayList<Personne>();
    }
}