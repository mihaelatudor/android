package com.example.mihaela.proiectmihaela;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toolbar;

import java.util.ArrayList;
import java.util.List;

public class GestionareTesteActivity extends AppCompatActivity {

    public class TesteAdapter extends ArrayAdapter<Test>
    {
        private int layout;

        public TesteAdapter(Context context, int resource, List<Test> objects) {
            super(context, resource, objects);
            layout = resource;
        }

        @Override
        public View getView(int position,View convertView, ViewGroup parent) {
            Test test = getItem(position);
            LayoutInflater inflater = LayoutInflater.from(getApplicationContext());
            View item = inflater.inflate(layout,null);

            ImageView imagine = item.findViewById(R.id.imagAdaptorTest);
            if(test.getCodCategorie() == 1)
                imagine.setImageResource(R.drawable.testunu);
            else
                if (test.getCodCategorie() == 2)
                    imagine.setImageResource(R.drawable.testdoi);
            else
                if (test.getCodCategorie() == 3)
                    imagine.setImageResource(R.drawable.testtrei);
            else
                if (test.getCodCategorie()==4)
                    imagine.setImageResource(R.drawable.testpatru);
            else
                if (test.getCodCategorie() == 5)
                    imagine.setImageResource(R.drawable.testcinci);

            TextView titlu = item.findViewById(R.id.titluTest_TV);
            titlu.setText(test.getTitlu());
            TextView nrIntrebari = item.findViewById(R.id.nrIntrebTest_CTV);
            nrIntrebari.setText("Nr intrebari: "+test.getNrIntrebari());

            return item;
        }
    }

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

        //adaptor faza 2
        ArrayList<Test> teste = new ArrayList<>();
        teste.add(new Test(1,"Generalitati C#",10));
        teste.add(new Test(2,"Generalitati JAVA",10));
        teste.add(new Test(3,"Generalitati JAVASCRIPT",10));
        teste.add(new Test(4,"Generalitati CSS",10));
        teste.add(new Test(5,"Generalitati C",10));

        TesteAdapter adaptor = new TesteAdapter(getApplicationContext(),R.layout.layout_teste_adaptor,teste);
        ListView listaTeste_lv = findViewById(R.id.teste_gestionare_ListV);
        listaTeste_lv.setAdapter(adaptor);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.meniu,menu);
        return true;
    }
}
