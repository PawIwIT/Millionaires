package pl.pawit;

import java.util.*;

public class LosowePytanie {

    static String losowePytanie(List<String> listaPytan) {
        Random random = new Random();
//musi z mapy wziac info ktora odp jest poprawna. wtedy przypisac do niego literke i zapisacc w elemencie listy jaka literka mam poprawna odpowiedz
        int losowyIndex = random.nextInt(listaPytan.size());

 //       Collections.shuffle(listaPytan);
        return listaPytan.get(losowyIndex);
    }



}
