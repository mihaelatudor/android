package com.example.mihaela.proiectmihaela;

import android.os.Parcel;
import android.os.Parcelable;

public class Test implements Parcelable {
    private int codCategorie;
    private String titlu;
    private int nrIntrebari;

    public Test(int codCategorie, String titlu, int nrIntrebari) {
        this.codCategorie = codCategorie;
        this.titlu = titlu;
        this.nrIntrebari = nrIntrebari;
    }

    protected Test(Parcel in) {
        codCategorie = in.readInt();
        titlu = in.readString();
        nrIntrebari = in.readInt();
    }

    public static final Creator<Test> CREATOR = new Creator<Test>() {
        @Override
        public Test createFromParcel(Parcel in) {
            return new Test(in);
        }

        @Override
        public Test[] newArray(int size) {
            return new Test[size];
        }
    };

    public int getCodCategorie() {
        return codCategorie;
    }

    public void setCodCategorie(int codCategorie) {
        this.codCategorie = codCategorie;
    }

    public String getTitlu() {
        return titlu;
    }

    public void setTitlu(String titlu) {
        this.titlu = titlu;
    }

    public int getNrIntrebari() {
        return nrIntrebari;
    }

    public void setNrIntrebari(int nrIntrebari) {
        this.nrIntrebari = nrIntrebari;
    }

    @Override
    public String toString() {
        return "Test{" +
                "codCategorie=" + codCategorie +
                ", titlu='" + titlu + '\'' +
                ", nrIntrebari=" + nrIntrebari +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(codCategorie);
        dest.writeString(titlu);
        dest.writeInt(nrIntrebari);
    }
}
