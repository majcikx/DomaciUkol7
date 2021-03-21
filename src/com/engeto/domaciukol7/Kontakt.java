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

    public void najdiKontaktPodleTel(String telCislo, ArrayList<Kontakt> list){

        for (int i = 0; i < list.size();i++) {
            if (Objects.equals(telCislo,list.get(i).telCislo)) {
                System.out.println(list.get(i).jmeno + list.get(i).prijmeni + list.get(i).telCislo + list.get(i).kategorie);
            }
        }

    }

    public ArrayList<Kontakt> najdiZaznamPodleJmenaNeboPrijmeni(String jmenoNeboPrijmeni, ArrayList<Kontakt> list){
        ArrayList<Kontakt> nalezeno = new ArrayList<Kontakt>();

        for (int i = 0; i < list.size();i++) {
            if ((Objects.equals(jmenoNeboPrijmeni,list.get(i).jmeno)||(Objects.equals(jmenoNeboPrijmeni,list.get(i).prijmeni)))) {
                nalezeno.add(list.get(i));
            }

        }
        return nalezeno;

    }

    public ArrayList<Kontakt> najdiZaznamPodleCastiCisla(Map<String,Kontakt> seznam, String cislo){
        ArrayList<Kontakt> nalezeno = new ArrayList<Kontakt>();


        for (Map.Entry<String, Kontakt> entry: seznam.entrySet()) {
            if (entry.getKey().contains(cislo)){
            nalezeno.add(entry.getValue());
            }
        }
        return nalezeno;
    }

    public void vypisSeznam(ArrayList<Kontakt> list){
        for (Kontakt kontakt:list) {
            System.out.println(kontakt.jmeno + kontakt.prijmeni + kontakt.kategorie + kontakt.telCislo);
        }
    }





}
