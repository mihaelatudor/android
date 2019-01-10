package com.example.mihaela.proiectmihaela;

import android.os.Parcel;
import android.os.Parcelable;

public class Utilizator implements Parcelable {
    private String numeSiPrenume;
    private String email;
    private String username;
    private String parola;
    private String facultate;
    private String tip;

    public Utilizator(String numeSiPrenume, String email, String username, String parola, String facultate, String tip) {
        this.numeSiPrenume = numeSiPrenume;
        this.email = email;
        this.username = username;
        this.parola = parola;
        this.facultate = facultate;
        this.tip = tip;
    }

    protected Utilizator(Parcel in) {
        numeSiPrenume = in.readString();
        email = in.readString();
        username = in.readString();
        parola = in.readString();
        facultate = in.readString();
        tip = in.readString();
    }

    public static final Creator<Utilizator> CREATOR = new Creator<Utilizator>() {
        @Override
        public Utilizator createFromParcel(Parcel in) {
            return new Utilizator(in);
        }

        @Override
        public Utilizator[] newArray(int size) {
            return new Utilizator[size];
        }
    };

    public String getNumeSiPrenume() {
        return numeSiPrenume;
    }

    public void setNumeSiPrenume(String numeSiPrenume) {
        this.numeSiPrenume = numeSiPrenume;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getParola() {
        return parola;
    }

    public void setParola(String parola) {
        this.parola = parola;
    }

    public String getFacultate() {
        return facultate;
    }

    public void setFacultate(String facultate) {
        this.facultate = facultate;
    }

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
         dest.writeString(numeSiPrenume);
         dest.writeString(email);
         dest.writeString(username);
         dest.writeString(parola);
         dest.writeString(facultate);
         dest.writeString(tip);
    }

    @Override
    public String toString() {
        return "Utilizator{" +
                "numeSiPrenume='" + numeSiPrenume + '\'' +
                ", email='" + email + '\'' +
                ", username='" + username + '\'' +
                ", parola='" + parola + '\'' +
                ", facultate='" + facultate + '\'' +
                ", tip='" + tip + '\'' +
                '}';
    }
}
