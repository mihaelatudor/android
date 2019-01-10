package com.example.mihaela.proiectmihaela;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class FragmentCategSimpla extends Fragment {

    public FragmentCategSimpla() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fragment_categ_simpla, container, false);
        Bundle bundle = this.getArguments();
        String detalii = bundle.getString("detalii");
        int an = bundle.getInt("an");
        String nume = bundle.getString("nume");
        TextView detaliiTV = view.findViewById(R.id.detalii_frSimplu_TV);
        detaliiTV.setText(detalii);
        TextView anTV = view.findViewById(R.id.anAparitie_fragTV);
        anTV.setText(an+"");
        TextView numeTV = view.findViewById(R.id.numeDezvoltator_fragTV);
        numeTV.setText(nume);

        return view;
    }

}
