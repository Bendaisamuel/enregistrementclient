package com.example.enregistrementclient;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // declaration
        Button b1 = findViewById(R.id.creation);
        TextView tx;


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //initialisation

        tx= findViewById(R.id.text1);

     // recuperations de mes extraits
        String name=getIntent().getStringExtra("nm2");
        String sn=getIntent().getStringExtra("pr2");
        String pseudo=getIntent().getStringExtra("pse2");
        String couple=getIntent().getStringExtra("genre2");
        String password=getIntent().getStringExtra("pass2");
      //afficger mes entrees
        tx.setText(name);
        tx.setText(sn);
        tx.setText(pseudo);
        tx.setText(couple);
        tx.setText(password);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(getApplicationContext(),creationcompte.class);
                startActivity(intent);
            }
        });

    }
}