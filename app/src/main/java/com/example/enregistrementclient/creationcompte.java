package com.example.enregistrementclient;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class creationcompte extends AppCompatActivity {
    //variables pour recuperer ce qui estsaisi
    EditText nm,pr,pse,pass;
    Button bva;
    RadioButton radiobu;
    RadioGroup radgroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_creationcompte);

        //recuperation des donnees saisies
        nm=findViewById(R.id.nom);
        pr=findViewById(R.id.prenom);
        pse=findViewById(R.id.pseudo);
        pass=findViewById(R.id.password);
        bva=findViewById(R.id.valide1);
        radgroup=findViewById(R.id.radiogroup);

        bva.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nm1=nm.getText().toString();
                String pr1=pr.getText().toString();
                String pse1=pse.getText().toString();
                String pass1=pass.getText().toString();
                int radgroup1=radgroup.getCheckedRadioButtonId();
                radiobu=findViewById(radgroup1);
                String genre=radiobu.getText().toString();

                Intent intent=new Intent(getApplicationContext(),MainActivity.class);
                intent.putExtra("nm2","nm1");
                intent.putExtra("pr2","pr1");
                intent.putExtra("pse2","pse1");
                intent.putExtra("pass2","pass1");
                intent.putExtra("genre2","genre");
                startActivity(intent);
            }
        });

    }
}