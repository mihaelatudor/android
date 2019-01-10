package com.example.mihaela.proiectmihaela;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toolbar;

public class CreareTestActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.creare_test);
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

        Button salveazaBtn=findViewById(R.id.salveazaBtn);
        salveazaBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText intrebareET=findViewById(R.id.inputIntrebareEdit);
                String intrebare= intrebareET.getText().toString();
                EditText raspuns1Et=findViewById(R.id.raspuns1EditCreare);
                String raspuns1=raspuns1Et.getText().toString();
                EditText raspuns2Et=findViewById(R.id.raspuns2EditCreare);
                String raspuns2=raspuns2Et.getText().toString();
                EditText raspuns3Et=findViewById(R.id.raspuns3EditCreare);
                String raspuns3=raspuns3Et.getText().toString();
                EditText raspuns4Et=findViewById(R.id.raspuns4EditCreare);
                String raspuns4=raspuns3Et.getText().toString();

                Intent intent=new Intent(getApplicationContext(),TestActivity.class);
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

    public void salveazaCreare(View view) {
    }
}
