package com.engeto.domaciukol7;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Kontakt kontakt1 = new Kontakt("+420608124333","Jan", "Nový",Kategorie.RODINA);
        Kontakt kontakt2 = new Kontakt("+420608124123","Petr", "Krasny",Kategorie.PRACE);
        Kontakt kontakt3 = new Kontakt("+420608125565","Jan", "Hrozny",Kategorie.RODINA);
        Kontakt kontakt4 = new Kontakt("+420666124565","Eva", "Hezka",Kategorie.OSTATNI);
        Kontakt kontakt5 = new Kontakt("+420081244565","Jana", "Mala",Kategorie.RODINA);
        Kontakt kontakt6 = new Kontakt("+420608124565","Magda", "Hezka",Kategorie.RODINA);
        Kontakt kontakt7 = new Kontakt("+420738124578","Julie", "Hezka",Kategorie.PRACE);
        Kontakt kontakt8 = new Kontakt("+420739124565","Jan", "Stary",Kategorie.OSTATNI);

        ArrayList<Kontakt> telSeznam = new ArrayList<Kontakt>();
        telSeznam.add(kontakt1);
        telSeznam.add(kontakt2);
        telSeznam.add(kontakt3);
        telSeznam.add(kontakt4);
        telSeznam.add(kontakt5);
        telSeznam.add(kontakt6);
        telSeznam.add(kontakt7);
        telSeznam.add(kontakt8);

        Map<String,Kontakt> seznam = new HashMap();
        seznam.put(kontakt1.getTelCislo(),kontakt2);
        seznam.put(kontakt2.getTelCislo(),kontakt1);
        seznam.put(kontakt3.getTelCislo(),kontakt3);
        seznam.put(kontakt4.getTelCislo(),kontakt4);
        seznam.put(kontakt5.getTelCislo(),kontakt5);
        seznam.put(kontakt6.getTelCislo(),kontakt6);
        seznam.put(kontakt7.getTelCislo(),kontakt7);
        seznam.put(kontakt8.getTelCislo(),kontakt8);

        LogicFindRecord callLogic = new LogicFindRecord();

        System.out.println("Chceš vyhledávat podle: ");
        System.out.println("Celeho telefonního čísla - 1, Jména nebo příjmení - 2, části televonního čísla - 3");

        Scanner nacitaniZPrikazovehoRadku = new Scanner(System.in);
        String nactenaVolba;
        nactenaVolba = nacitaniZPrikazovehoRadku.nextLine();

        if (nactenaVolba.equals("1")){
            System.out.println("Vybrali jste hledaní podle celeho telefonního čísla. Zadejte celé telefonní číslo");
            //Rozpracovat volbu jedna
            String nacteneTelCislo;
            nacteneTelCislo = nacitaniZPrikazovehoRadku.nextLine();
            callLogic.najdiKontaktPodleTel(nacteneTelCislo,telSeznam);

        }else if(nactenaVolba.equals("2")){
            System.out.println("Vybrali jste hledaní podle jména nebo příjmení. Zadejte jméno nebo příjmení");
            //Rozpracovat volba dva
            String jmenoNeboPrijmeni;
            ArrayList<Kontakt> vypisSeznamu;
            jmenoNeboPrijmeni = nacitaniZPrikazovehoRadku.nextLine();
            vypisSeznamu =  callLogic.najdiZaznamPodleJmenaNeboPrijmeni(jmenoNeboPrijmeni,telSeznam);
            callLogic.vypisSeznam(vypisSeznamu);
        } else if (nactenaVolba.equals("3")){
            //Rozpracovat volbu 3
            System.out.println("Vybrali jste hledaní podle části telefonního čísla. Zadejte část telefonního čísla");
            String castTelCisla;
            ArrayList<Kontakt> vypisSeznamu;
            castTelCisla = nacitaniZPrikazovehoRadku.nextLine();
            vypisSeznamu = callLogic.najdiZaznamPodleCastiCisla(seznam,castTelCisla);
            callLogic.vypisSeznam(vypisSeznamu);

        }


    }




}
