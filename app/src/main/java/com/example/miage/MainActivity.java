package com.example.miage;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
public class MainActivity extends AppCompatActivity {
    private ImageView logo;
    private EditText nom;
    private EditText prenom;
    private Button btnValider;
    private Button btnAnnuler;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
// Récupération du logo grâce à l'id
        this.logo = findViewById(R.id.lien);
//Récupération élément
        this.nom = findViewById(R.id.nom);
        this.prenom = findViewById(R.id.prenom);
        this.btnValider = findViewById(R.id.btnvalider);
        this.btnAnnuler = findViewById(R.id.btnannuler);
// Implémentation de la navigation au click
        btnValider.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent activite2 = new Intent(getApplicationContext(),
                        activite2.class);
                String strn = nom.getText().toString();
                String strp = prenom.getText().toString();
//activite2.putExtra("nom", strn);
//activite2.putExtra("prenom", strp);
                Personne p = new Personne(strn,strp);
                MonApplication mcontexte =
                        (MonApplication)getApplicationContext();
                mcontexte.AjoutePersonne(p);
                startActivity(activite2);
//finish();
            }
        });
    }
}