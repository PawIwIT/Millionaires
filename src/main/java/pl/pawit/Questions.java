package pl.pawit;

import java.util.List;
import java.util.Random;

public class Questions {
    public String getQuestionFromList(List<String> listaPytanIOdpowiedzi) {
        Random random = new Random();
        int losowePytanie = random.nextInt(listaPytanIOdpowiedzi.size());
        String los = listaPytanIOdpowiedzi.get(0);
        return los;
    }
}
