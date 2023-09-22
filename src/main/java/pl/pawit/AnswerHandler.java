package pl.pawit;

import java.io.IOException;
import java.util.Scanner;

public class AnswerHandler {
    static Scanner scanner = new Scanner(System.in);


    public static void getAnswerFromUser() throws IOException {
        String userChoice = scanner.nextLine();
        String s = ReadFiles.readAnswerFromFile();
  /*    boolean contains1 = ReadFiles.readAnswerFromFile().contains(userChoice);
        if (contains1==true){
            System.out.println("brawo");
    }*/

        boolean equals = ReadFiles.readAnswerFromFile().equals(userChoice);
        if (equals==true){
            System.out.println("");
        }

    }
}
