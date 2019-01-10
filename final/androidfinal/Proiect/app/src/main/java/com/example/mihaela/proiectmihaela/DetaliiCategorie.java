package com.example.mihaela.proiectmihaela;

import java.util.ArrayList;
import java.util.Map;

public class DetaliiCategorie {
    private int nrCateg;
    private String titlu;
    private String detaliiCateg;
    private int anAparitie;
    private String numeDezvoltatori;
    private Map<String,String> teste;

    public DetaliiCategorie(int nrCateg) {
        this.nrCateg = nrCateg;
    }

    public DetaliiCategorie(int nrCateg, String titlu, String detaliiCateg, int anAparitie, String numeDezvoltatori, Map<String, String> teste) {
        this.nrCateg = nrCateg;
        this.titlu = titlu;
        this.detaliiCateg = detaliiCateg;
        this.anAparitie = anAparitie;
        this.numeDezvoltatori = numeDezvoltatori;
        this.teste = teste;
    }

    public int getNrCateg() {
        return nrCateg;
    }

    public void setNrCateg(int nrCateg) {
        this.nrCateg = nrCateg;
    }

    public String getTitlu() {
        return titlu;
    }

    public void setTitlu(String titlu) {
        this.titlu = titlu;
    }

    public String getDetaliiCateg() {
        return detaliiCateg;
    }

    public void setDetaliiCateg(String detaliiCateg) {
        this.detaliiCateg = detaliiCateg;
    }

    public int getAnAparitie() {
        return anAparitie;
    }

    public void setAnAparitie(int anAparitie) {
        this.anAparitie = anAparitie;
    }

    public String getNumeDezvoltatori() {
        return numeDezvoltatori;
    }

    public void setNumeDezvoltatori(String numeDezvoltatori) {
        this.numeDezvoltatori = numeDezvoltatori;
    }

    public Map<String, String> getTeste() {
        return teste;
    }

    public void setTeste(Map<String, String> teste) {
        this.teste = teste;
    }

    @Override
    public String toString() {
        return "DetaliiCategorie{" +
                "nrCateg=" + nrCateg +
                ", titlu='" + titlu + '\'' +
                ", detaliiCateg='" + detaliiCateg + '\'' +
                ", anAparitie=" + anAparitie +
                ", numeDezvoltatori=" + numeDezvoltatori +
                ", teste=" + teste +
                '}';
    }


}
