package pl.pawit;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FileHandler {

    public static void showQuestion() throws IOException {
        try {
            Path inputPath = Paths.get("./Questions.txt");
            List<String> listOfWords = Files.readAllLines(inputPath, Charset.forName("UTF-8"));
            for (int i = 0; i <= listOfWords.size() -1 ; i++) {
                String[] elementOfQuestion = listOfWords.get(i).split("//");
                for (int j = 0; j <= elementOfQuestion.length; j++) {
                    System.out.println(elementOfQuestion[j]);
                }
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
    }
}
