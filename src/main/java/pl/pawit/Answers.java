package pl.pawit;

import java.util.*;

public class Answers {

    public List<String> answers(List<String> listaPytanIOdpowiedzi) {

        char litera = 'A';

        List<String> answers = new ArrayList<>();
        String odp1 = listaPytanIOdpowiedzi.get(1);
        String odp2 = listaPytanIOdpowiedzi.get(2);
        String odp3 = listaPytanIOdpowiedzi.get(3);
        String odp4 = listaPytanIOdpowiedzi.get(4);

        answers.add(odp1);
        answers.add(odp2);
        answers.add(odp3);
        answers.add(odp4);


        String literkaPoprawnejOdpowiedzi = listaPytanIOdpowiedzi.get(5);
        String poprawnaOdpowiedz = answers.get(wezIndexPoprawnejOdpowiedzi(literkaPoprawnejOdpowiedzi));


        List<String> listaPomieszanychOdpowiedziZPrawidlowaOdpowiedziaNaKoncu = new ArrayList<>();
        String finalnaLiterkaZPoprawnaOdpowiedzia = null;

        Collections.shuffle(answers);

        for (String answer : answers) {
            String trescOdpowiedziZLiterka = litera + "." + answer + ", ";
            listaPomieszanychOdpowiedziZPrawidlowaOdpowiedziaNaKoncu.add(trescOdpowiedziZLiterka);

            if (answer.equals(poprawnaOdpowiedz)) {
                finalnaLiterkaZPoprawnaOdpowiedzia = String.valueOf(litera);
            }
            litera++;
//            return answers;
        }
        listaPomieszanychOdpowiedziZPrawidlowaOdpowiedziaNaKoncu.add(finalnaLiterkaZPoprawnaOdpowiedzia);
        return listaPomieszanychOdpowiedziZPrawidlowaOdpowiedziaNaKoncu;
    }


    private int wezIndexPoprawnejOdpowiedzi(String literkaPoprawnejOdpowiedzi) {
        if (literkaPoprawnejOdpowiedzi.equals("A")) {
            return 0;
        } else if (literkaPoprawnejOdpowiedzi.equals("B")) {
            return 1;
        } else if (literkaPoprawnejOdpowiedzi.equals("C")) {
            return 2;
        } else if (literkaPoprawnejOdpowiedzi.equals("D")) {
            return 3;
        }
        return 0; // do poprawy bo w tej sytuacji powinno rzucic bledem

    }


}

