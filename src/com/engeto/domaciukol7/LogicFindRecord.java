package com.engeto.domaciukol7;

import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;

public class LogicFindRecord {
    public void najdiKontaktPodleTel(String telCislo, ArrayList<Kontakt> list){

        for (int i = 0; i < list.size();i++) {
            if (Objects.equals(telCislo,list.get(i).getTelCislo())) {
                System.out.println(list.get(i).getJmeno() +" "+ list.get(i).getPrijmeni() +" "+ list.get(i).getTelCislo() +" "+ list.get(i).getKategorie());
            }
        }
    }

    public ArrayList<Kontakt> najdiZaznamPodleJmenaNeboPrijmeni(String jmenoNeboPrijmeni, ArrayList<Kontakt> list){
        ArrayList<Kontakt> nalezeno = new ArrayList<Kontakt>();

        for (int i = 0; i < list.size();i++) {
            if ((Objects.equals(jmenoNeboPrijmeni,list.get(i).getJmeno())||(Objects.equals(jmenoNeboPrijmeni,list.get(i).getPrijmeni())))) {
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
            System.out.println(kontakt.getJmeno() +" "+ kontakt.getPrijmeni() +" "+ kontakt.getTelCislo() +" "+ kontakt.getKategorie());
        }
    }
}
