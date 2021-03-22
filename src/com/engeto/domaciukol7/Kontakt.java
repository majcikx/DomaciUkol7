package com.engeto.domaciukol7;

import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;

public class Kontakt {
    private String telCislo;
    private String jmeno;
    private String prijmeni;
    private Kategorie kategorie;

    public Kontakt(String telCislo, String jmeno, String prijmeni, Kategorie kategorie) {
        this.telCislo = telCislo;
        this.jmeno = jmeno;
        this.prijmeni = prijmeni;
        this.kategorie = kategorie;
    }

    public String getTelCislo() {
        return telCislo;
    }

    public void setTelCislo(String telCislo) {
        this.telCislo = telCislo;
    }

    public String getJmeno() {
        return jmeno;
    }

    public void setJmeno(String jmeno) {
        this.jmeno = jmeno;
    }

    public String getPrijmeni() {
        return prijmeni;
    }

    public void setPrijmeni(String prijmeni) {
        this.prijmeni = prijmeni;
    }

    public Kategorie getKategorie() {
        return kategorie;
    }

    public void setKategorie(Kategorie kategorie) {
        this.kategorie = kategorie;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Kontakt kontakt = (Kontakt) o;
        return Objects.equals(telCislo, kontakt.telCislo) && Objects.equals(jmeno, kontakt.jmeno) && Objects.equals(prijmeni, kontakt.prijmeni) && kategorie == kontakt.kategorie;
    }

    @Override
    public int hashCode() {
        return Objects.hash(telCislo, jmeno, prijmeni, kategorie);
    }







}
