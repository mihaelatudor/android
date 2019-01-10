package com.example.mihaela.proiectmihaela;

import android.os.Parcel;
import android.os.Parcelable;

public class CategoriaCSharp implements Parcelable {

    private String denumireTest;
    private static final int codCategorie=1;
    private int codTest;
    private int nrIntrebare;
    private String intrebare;
    private String[] raspunsuri;

    public CategoriaCSharp(String denumireTest, int codTest, int nrIntrebare, String intrebare, String[] raspunsuri) {
        this.denumireTest = denumireTest;
        this.codTest = codTest;
        this.nrIntrebare = nrIntrebare;
        this.intrebare = intrebare;
        this.raspunsuri = raspunsuri;
    }

    protected CategoriaCSharp(Parcel in) {
        denumireTest = in.readString();
        codTest = in.readInt();
        nrIntrebare = in.readInt();
        intrebare = in.readString();
        raspunsuri = in.createStringArray();
    }

    public static final Creator<CategoriaCSharp> CREATOR = new Creator<CategoriaCSharp>() {
        @Override
        public CategoriaCSharp createFromParcel(Parcel in) {
            return new CategoriaCSharp(in);
        }

        @Override
        public CategoriaCSharp[] newArray(int size) {
            return new CategoriaCSharp[size];
        }
    };

    public String getDenumireTest() {
        return denumireTest;
    }

    public void setDenumireTest(String denumireTest) {
        this.denumireTest = denumireTest;
    }

    public static int getCodCategorie() {
        return codCategorie;
    }

    public int getCodTest() {
        return codTest;
    }

    public void setCodTest(int codTest) {
        this.codTest = codTest;
    }

    public int getNrIntrebare() {
        return nrIntrebare;
    }

    public void setNrIntrebare(int nrIntrebare) {
        this.nrIntrebare = nrIntrebare;
    }

    public String getIntrebare() {
        return intrebare;
    }

    public void setIntrebare(String intrebare) {
        this.intrebare = intrebare;
    }

    public String[] getRaspunsuri() {
        return raspunsuri;
    }

    public void setRaspunsuri(String[] raspunsuri) {
        this.raspunsuri = raspunsuri;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(denumireTest);
        dest.writeInt(codTest);
        dest.writeInt(nrIntrebare);
        dest.writeString(intrebare);
        dest.writeStringArray(raspunsuri);
    }
}
