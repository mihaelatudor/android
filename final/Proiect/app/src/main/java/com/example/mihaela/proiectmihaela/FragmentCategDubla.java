package com.example.mihaela.proiectmihaela;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class FragmentCategDubla extends Fragment {

    public FragmentCategDubla() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fragment_categ_dubla, container, false);

        Bundle bundle = this.getArguments();
        String detalii1 = bundle.getString("detalii1");
        int an1 = bundle.getInt("an1");
        String nume1 = bundle.getString("nume1");
        String detalii2 = bundle.getString("detalii2");
        int an2 = bundle.getInt("an2");
        String nume2 = bundle.getString("nume2");

        TextView detaliiTV1 = view.findViewById(R.id.detalii1_fragDub);
        detaliiTV1.setText(detalii1);
        TextView anTV1=view.findViewById(R.id.anApar1_fragDub_TV);
        anTV1.setText(an1+"");
        TextView numeTV1 = view.findViewById(R.id.numeDezv1_fragDub_TV);
        numeTV1.setText(nume1);

        TextView detaliiTV2 = view.findViewById(R.id.detalii2_fragDub);
        detaliiTV2.setText(detalii2);
        TextView anTV2=view.findViewById(R.id.anApar2_fragDub_TV);
        anTV2.setText(an2+"");
        TextView numeTV2 = view.findViewById(R.id.numeDezv2_fragDub_TV);
        numeTV2.setText(nume2);

        return view;
    }

}
