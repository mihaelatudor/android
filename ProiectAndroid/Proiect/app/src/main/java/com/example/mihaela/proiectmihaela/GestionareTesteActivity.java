package com.example.mihaela.proiectmihaela;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toolbar;

public class GestionareTesteActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gestionare_teste);
        Toolbar toolbar=findViewById(R.id.toolbar);
        toolbar.inflateMenu(R.menu.meniu);
        ImageButton omuletBtn=findViewById(R.id.omuletImgBtn);
        omuletBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),ProfilActivity.class);
                startActivity(intent);
            }
        });
        ImageButton offBtn=findViewById(R.id.offImgBtn);
        offBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),FeedBackActivity.class);
                startActivity(intent);
            }
        });
        ImageButton setariBtn=findViewById(R.id.setariImgBtn);
        setariBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),GestionareTesteActivity.class);
                startActivity(intent);
            }
        });

        ImageButton creeazaBtn=findViewById(R.id.creeazaImgBtn);
        creeazaBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),CreareTestActivity.class);
                startActivity(intent);
            }
        });
        ImageButton testeBtn=findViewById(R.id.testelemeleImgBtn);
        testeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),VizualizareTesteActivity.class);
                startActivity(intent);
            }
        });
        ImageButton modificaBtn=findViewById(R.id.modificaImgBtn);
        modificaBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),InscriereTestActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.meniu,menu);
        return true;
    }
}
