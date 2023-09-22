package pl.pawit;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FileHandler {

    public static void readQuestion() throws IOException {
        Path inputPath = Paths.get("./Questions.txt");
        List<String> listOfAnswers = Files.readAllLines(inputPath, Charset.forName("UTF-8"));

    }

    public static void showAnswer() throws IOException {
        Path inputPath = Paths.get("./Answers.txt");
        List<String> listOfAnswers = Files.readAllLines(inputPath, Charset.forName("UTF-8"));

    }

}
