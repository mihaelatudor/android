package com.example.mihaela.proiectmihaela;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toolbar;

public class LogareActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.logare);

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

        Button btnRegister=findViewById(R.id.btnRegister);
        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),InregistreareActivity.class);
                startActivity(intent);
            }
        });

        Button btnRecuperare=findViewById(R.id.recuperareParolaBtn);
        btnRecuperare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText username=findViewById(R.id.userEditL);
                String email=username.getText().toString()+"@stud.ase.ro";
                Intent intent=new Intent(getApplicationContext(),RecuperareParolaActivity.class);
                intent.putExtra("email",email);
                startActivity(intent);
            }
        });

        //shared preferences
        CheckBox mentinere = findViewById(R.id.checkBoxLogare);
        SharedPreferences sp = getSharedPreferences("preferinte",MODE_PRIVATE);
        mentinere.setChecked(sp.getBoolean("check",false));
        if(mentinere.isChecked())
        {
            EditText username = findViewById(R.id.userEditL);
            username.setText(sp.getString("username",""));
            EditText parola = findViewById(R.id.parolaEdit);
            parola.setText(sp.getString("parola",""));
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.meniu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.teste:
                Intent intent=new Intent(getApplicationContext(),VizualizareTesteActivity.class);
                startActivity(intent);
                 return true;
            case R.id.rapoarte:
                Intent i=new Intent(getApplicationContext(),RapoarteActivity.class);
                startActivity(i);
                return true;
            case R.id.feedback:
                Intent in=new Intent(getApplicationContext(),FeedBackActivity.class);
                startActivity(in);
                return true;
            case R.id.profil:
                Intent inte=new Intent(getApplicationContext(),InscriereTestActivity.class);
                startActivity(inte);
                return true;
                 default:
                    return super.onOptionsItemSelected(item);
        }
    }

    public void getPreferinte(View view) {
        CheckBox mentinere = findViewById(R.id.checkBoxLogare);

          SharedPreferences sp = getSharedPreferences("preferinte",MODE_PRIVATE);
          SharedPreferences.Editor editor = sp.edit();
          String username =((EditText)findViewById(R.id.userEditL)).getText().toString();
          String parola =((EditText)findViewById(R.id.parolaEdit)).getText().toString();

          editor.putString("username",username);
          editor.putString("parola",parola);
          editor.putBoolean("check",mentinere.isChecked());

          editor.commit();

    }
}
