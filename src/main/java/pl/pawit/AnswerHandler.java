package pl.pawit;

import java.io.IOException;
import java.util.Scanner;

public class AnswerHandler {
    static Scanner scanner = new Scanner(System.in);


    public static void getAnswerFromUser() throws IOException {
        String userChoice = scanner.nextLine();
        String correctAnswer = ReadFiles.readAnswerFromFile(); //tutaj juz wyciagasz prawidlowa odpowiedz (zmienilem tylko nazwe zmiennej)
  /*    boolean contains1 = ReadFiles.readAnswerFromFile().contains(userChoice);
        if (contains1==true){
            System.out.println("brawo");
    }*/

        //ponizej trzeba jeszcze upewnic sie ze correctAnswer nie jest rowne null - bo jak tak bedzie dostaniesz blad
        boolean isUserAnswerCorrect = correctAnswer.equals(userChoice);  //wykorzystalem zmienna correctAnswer, bo po co znowu czytac odpowiedz z pliku (robiles tak wczesniej)
        if (isUserAnswerCorrect) {
            System.out.println("PRAWIDLOWA ODPOWIEDZ");
        }

    }
}
