package com.example.miage;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class ListeActivity extends AppCompatActivity {
    private Button retour;
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_liste);
        
        this.retour = findViewById(R.id.btnretour);
        this.listView = findViewById(R.id.listView);
        
        // Récupérer les personnes depuis MonApplication
        MonApplication mcontexte = (MonApplication) getApplicationContext();
        ArrayList<Personne> personnes = mcontexte.getPersonnes();
        
        // Créer et associer l'adaptateur
        ArrayAdapter<Personne> adapter = new ArrayAdapter<>(this,
                R.layout.item,
                R.id.pers,
                personnes);
        listView.setAdapter(adapter);
        
        // Bouton retour
        this.retour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(home);
                finish();
            }
        });
    }
}
