package com.example.mihaela.proiectmihaela;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toolbar;

public class Activity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);

        StringBuilder email=new StringBuilder();
        email.append(getIntent().getStringExtra("email"));
        EditText emailEt=findViewById(R.id.act3_emailR);
        emailEt.setText(email);

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
    }
}
