package com.example.mihaela.proiectmihaela;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toolbar;

public class ActivityLogin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1);

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

        Button btnRegister=findViewById(R.id.act1_btnRegister);
        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),noulNume.class);
                startActivity(intent);
            }
        });

        Button btnRecuperare=findViewById(R.id.act1_btnRecuperareParola);
        btnRecuperare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText username=findViewById(R.id.act1_user);
                String email=username.getText().toString()+"@stud.ase.ro";
                Intent intent=new Intent(getApplicationContext(),Activity3.class);
                intent.putExtra("email",email);
                startActivity(intent);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.act9_meniu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.act9_teste:
                Intent intent=new Intent(getApplicationContext(),Activity9.class);
                startActivity(intent);
                 return true;
            case R.id.act9_rapoarte:
                Intent i=new Intent(getApplicationContext(),Activity12.class);
                startActivity(i);
                return true;
            case R.id.act9_feedback:
                Intent in=new Intent(getApplicationContext(),Activity4.class);
                startActivity(in);
                return true;
            case R.id.act9_profil:
                Intent inte=new Intent(getApplicationContext(),Activity5.class);
                startActivity(inte);
                return true;
                 default:
                    return super.onOptionsItemSelected(item);
        }
    }
}
