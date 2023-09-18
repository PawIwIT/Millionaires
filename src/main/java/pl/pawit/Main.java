package pl.pawit;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {


        Scanner scanner = new Scanner(System.in);

        boolean continueGame = true;
        while (continueGame) {
            System.out.println("1.Start the game");
            System.out.println("2.Skorzystaj z kola ratunkowego");
            System.out.println("3.End the game");
            continueGame = false;

            int userChoice = scanner.nextInt();
            ;
            switch (userChoice) {
                case 1 -> Questions.showQuestion();
                case 2 -> System.out.println("");
                case 3 -> continueGame = false;
            }
        }

    }

}

