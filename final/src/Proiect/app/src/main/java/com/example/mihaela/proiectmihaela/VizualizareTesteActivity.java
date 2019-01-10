package com.example.mihaela.proiectmihaela;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;

import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;
import android.widget.Toolbar;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;

public class VizualizareTesteActivity extends AppCompatActivity {

    public class GetCategorii extends AsyncTask<String, Void, ArrayList<DetaliiCategorie>>
    {

        @Override
        protected ArrayList<DetaliiCategorie> doInBackground(String... strings) {
            ArrayList<DetaliiCategorie> categ = new ArrayList<>();
            StringBuilder builder= new StringBuilder();
            try{
                URL url = new URL(strings[0]);
                HttpURLConnection http = (HttpURLConnection)url.openConnection();
                InputStream stream = http.getInputStream();

                InputStreamReader istrr = new InputStreamReader(stream);
                BufferedReader reader = new BufferedReader(istrr);
                String linie="";
                while((linie=reader.readLine())!=null)
                {
                    builder.append(linie);
                }

               JSONArray vector = new JSONArray(builder.toString());
                for(int i=0; i<7; i++)
                {
                    JSONObject obiect = (JSONObject)vector.get(i);
                    int nrCateg = obiect.getInt("nrCategorie");
                    String titlu = obiect.getString("titlu");
                    String detalii = obiect.getString("detalii");
                    int an = obiect.getInt("aparutIn");
                    String dezvoltatori = obiect.getString("dezvoltatDe");

                    JSONObject teste = obiect.getJSONObject("teste");
                    String codTest= teste.getString("cod");
                    String titluTest = teste.getString("titluTest");

                    Map<String,String> test = new HashMap<>();
                    test.put(codTest,titluTest);

                    categ.add(new DetaliiCategorie(nrCateg,titlu,detalii,an,dezvoltatori,test));
                }

            } catch (MalformedURLException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } catch (JSONException e) {
                e.printStackTrace();
            }

            return categ;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.vizualizare_teste);

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
        setActionBar(toolbar);

        Fragment fragment;
        fragment= new FragmentCategorie();

        FragmentManager manager = getFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.replace(R.id.frame_fragmente,fragment);
        transaction.commit();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.meniu,menu);
        return true;
    }

    public void vizualizareFragment(View view) {

        //colectare date in mod asincron
        GetCategorii obiect = new GetCategorii(){
            @Override
            protected void onPostExecute(ArrayList<DetaliiCategorie> detaliiCateg) {

            }
        };

         obiect.execute("https://api.myjson.com/bins/ior3a");

        try {
            ArrayList<DetaliiCategorie> categFragment = obiect.get();

            //  datele colectate se afiseaza in fragment
            Fragment fragment;
            Bundle bundle = new Bundle();

            if(view == findViewById(R.id.veziTeste1))
            {
                fragment= new FragmentCategSimpla();
                bundle.putString("detalii",categFragment.get(0).getDetaliiCateg());
                bundle.putInt("an",categFragment.get(0).getAnAparitie());
                bundle.putString("nume",categFragment.get(0).getNumeDezvoltatori());
            }
            else
                if(view == findViewById(R.id.veziTeste2))
                {
                    fragment= new FragmentCategSimpla();
                    bundle.putString("detalii",categFragment.get(1).getDetaliiCateg());
                    bundle.putInt("an",categFragment.get(1).getAnAparitie());
                    bundle.putString("nume",categFragment.get(1).getNumeDezvoltatori());
                }
                else
                    if(view == findViewById(R.id.veziTeste3))
                    {
                        fragment= new FragmentCategSimpla();
                        bundle.putString("detalii",categFragment.get(2).getDetaliiCateg());
                        bundle.putInt("an",categFragment.get(2).getAnAparitie());
                        bundle.putString("nume",categFragment.get(2).getNumeDezvoltatori());
                    }
                    else
                        if(view == findViewById(R.id.veziTeste4))
                        {
                            fragment= new FragmentCategDubla();
                            bundle.putString("detalii1",categFragment.get(3).getDetaliiCateg());
                            bundle.putInt("an1",categFragment.get(3).getAnAparitie());
                            bundle.putString("nume1",categFragment.get(3).getNumeDezvoltatori());
                            bundle.putString("detalii2",categFragment.get(4).getDetaliiCateg());
                            bundle.putInt("an2",categFragment.get(4).getAnAparitie());
                            bundle.putString("nume2",categFragment.get(4).getNumeDezvoltatori());
                        }
                        else
                            if(view == findViewById(R.id.veziTeste5))
                            {
                                fragment= new FragmentCategDubla();
                                bundle.putString("detalii1",categFragment.get(5).getDetaliiCateg());
                                bundle.putInt("an1",categFragment.get(5).getAnAparitie());
                                bundle.putString("nume1",categFragment.get(5).getNumeDezvoltatori());
                                bundle.putString("detalii2",categFragment.get(6).getDetaliiCateg());
                                bundle.putInt("an2",categFragment.get(6).getAnAparitie());
                                bundle.putString("nume2",categFragment.get(6).getNumeDezvoltatori());
                            }
                            else
                            {
                                fragment = new FragmentCategorie();
                            }


            fragment.setArguments(bundle);

            FragmentManager manager = getFragmentManager();
            FragmentTransaction transaction = manager.beginTransaction();
            transaction.replace(R.id.frame_fragmente,fragment);
            transaction.commit();

        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
