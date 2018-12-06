package com.example.mihaela.proiectmihaela;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toolbar;

public class Activity10 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_10);
        Toolbar toolbar=findViewById(R.id.act9_toolbar);
        toolbar.inflateMenu(R.menu.act9_meniu);
        ImageButton omuletBtn=findViewById(R.id.act9_omuletImgBtn);
        omuletBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),Activity11.class);
                startActivity(intent);
            }
        });
        ImageButton offBtn=findViewById(R.id.act9_offImgBtn);
        offBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),Activity4.class);
                startActivity(intent);
            }
        });
        ImageButton setariBtn=findViewById(R.id.act9_setariImgBtn);
        setariBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),Activity10.class);
                startActivity(intent);
            }
        });

        ImageButton creeazaBtn=findViewById(R.id.act10_creeazaImgBtn);
        creeazaBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),Activity8.class);
                startActivity(intent);
            }
        });
        ImageButton testeBtn=findViewById(R.id.act10_testelemeleImgBtn);
        testeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),Activity9.class);
                startActivity(intent);
            }
        });
        ImageButton modificaBtn=findViewById(R.id.act10_modificaImgBtn);
        modificaBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),Activity5.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.act9_meniu,menu);
        return true;
    }
}
