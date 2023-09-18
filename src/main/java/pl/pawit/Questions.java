package pl.pawit;


import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Questions {

    String numerPytania;
    String trescPytania;
    String A;
    String B;
    String C;
    String D;

    public Questions(String numerPytania, String trescPytania, String a, String b, String c, String d) {
        this.numerPytania = numerPytania;
        this.trescPytania = trescPytania;
        A = a;
        B = b;
        C = c;
        D = d;
    }

    @Override
    public String toString() {
        return "Questions{" +
                "numerPytania=" + numerPytania +
                ", trescPytania='" + trescPytania + '\'' +
                ", A='" + A + '\'' +
                ", B='" + B + '\'' +
                ", C='" + C + '\'' +
                ", D='" + D + '\'' +
                '}';
    }

    public static void showQuestion() throws IOException {
        Path inputPath = Paths.get("./Questions.txt");
        List<String> listOfWords = Files.readAllLines(inputPath, Charset.forName("UTF-8"));

        for (int i = 0; i <= listOfWords.size(); i++) {
            String[] elementOfQuestion = listOfWords.get(i).split("//");
            
        }

    }
}
