package com.example.mihaela.proiectmihaela;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toolbar;

public class Activity8 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_8);
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

        Button salveazaBtn=findViewById(R.id.act8_salveaza);
        salveazaBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText intrebareET=findViewById(R.id.act8_inputIntrebare);
                String intrebare= intrebareET.getText().toString();
                EditText raspuns1Et=findViewById(R.id.act8_raspunsEdit);
                String raspuns1=raspuns1Et.getText().toString();
                EditText raspuns2Et=findViewById(R.id.act8_raspunsEdit1);
                String raspuns2=raspuns2Et.getText().toString();
                EditText raspuns3Et=findViewById(R.id.act8_raspunsEdit2);
                String raspuns3=raspuns3Et.getText().toString();

                Intent intent=new Intent(getApplicationContext(),Activity6.class);
                intent.putExtra("intrebare",intrebare);
           //     intent.putExtra("raspuns1",raspuns1);
//                intent.putExtra("raspuns2",raspuns2);
//                intent.putExtra("raspuns3",raspuns3);
                startActivity(intent);
            }
        });
    }

    public void act8_adaugaClick(View view) {
    }

    public void act8_stergeClick(View view) {
    }

    public void act8_salveazaClick(View view) {
    }
}
