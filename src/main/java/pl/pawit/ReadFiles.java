package pl.pawit;


import org.jetbrains.annotations.Nullable;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class ReadFiles {
    public static void readQuestionsFromFile() throws IOException {

        Path inputPath = Paths.get("./Questions.txt");
        List<String> listOfWords = Files.readAllLines(inputPath, Charset.forName("UTF-8"));
        try {

            for (int i = 0; i < listOfWords.size() - 1; i++) {
                String[] wordsInQuestions = listOfWords.get(i).split("//");
                for (int j = 0; j < wordsInQuestions.length; j++) {
                    //pusta petla ?
                }
                System.out.println(Arrays.toString(wordsInQuestions));
            }
        } catch (IndexOutOfBoundsException e) {
            //jak dodajesz block catch to on nigdy nie powinien byc pusty - na poczatek zawsze mozesz dac chocaz sout z info ze wyskoczyl blad i cos poszlo nietak
        }
    }

    public static String readAnswerFromFile() throws IOException {

        Path inputPath2 = Paths.get("./Answers.txt");
        List<String> words = Files.readAllLines(inputPath2, Charset.forName("UTF-8"));
        try {
            for (int i = 0; i < words.size(); i++) {
                String[] wordsInAnswer = words.get(i).split("//");
                for (int j = 0; j < wordsInAnswer.length; j++) {
                    // String.valueOf(new AnswersConstructor(wordsInAnswer[0],wordsInAnswer[1]));
                     return wordsInAnswer[1];
                }

            }
        } catch (IndexOutOfBoundsException ex) {
        }

     return null;
    }
}
