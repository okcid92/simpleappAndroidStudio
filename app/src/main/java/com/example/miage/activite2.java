package com.example.miage;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import java.util.ArrayList;
public class activite2 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activite2);
//Récupération saisie
/* Intent intent = getIntent();
if (intent != null){
String strn = "";
String strp = "";
if (intent.hasExtra("nom")){
strn = intent.getStringExtra("nom");
}
if (intent.hasExtra("prenom")){
strp = intent.getStringExtra("prenom");
}*/
//Récupération à partir du contexte
        ArrayList<Personne> personnes;
        int taille;
        MonApplication mcontexte = (MonApplication)getApplicationContext();
        personnes = mcontexte.getPersonnes();
        taille=personnes.size();
        if(taille>0) {
            Personne p = personnes.get(taille - 1);
            TextView textView = (TextView) findViewById(R.id.welcome);
            textView.setText(" Akwaba " + p.getNom() + " " + p.getPrenom());
        }else {
            TextView textView = (TextView) findViewById(R.id.welcome);
            textView.setText(" Akwaba NoName");
        }
//ListView
// créer un adaptateur standard pour personnes
        ArrayAdapter<Personne> adapter = new ArrayAdapter<>(this,
                R.layout.item,
                R.id.pers,
                personnes);
// associer la liste affichée et l'adaptateur
        ListView lv = findViewById(R.id.lpers);
        lv.setAdapter(adapter);
    }
}