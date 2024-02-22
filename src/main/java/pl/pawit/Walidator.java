package pl.pawit;

import java.util.List;

public class Walidator {

    private static List<String> availableAnswers = List.of("A", "B", "C", "D");

    public static boolean correctFormatOfAnswer(String userChoice) {
        return availableAnswers.contains(userChoice);
    }

}
