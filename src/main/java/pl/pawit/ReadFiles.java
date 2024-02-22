package pl.pawit;


import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;


public class ReadFiles {

    public static void readQuestionsFromFile() throws IOException {
        Questions questions = new Questions();
        Answers answers = new Answers();


        LosowePytanie losowePytanie = new LosowePytanie();
        Scanner scanner = new Scanner(System.in);
        Path inputPath = Paths.get("./Questions.txt");
        List<String> listOfWords = Files.readAllLines(inputPath, Charset.forName("UTF-8"));
        int liczbaPoprawnychOdpowiedzi = 0;
        Tabela_Kwota kwotaGwarantowana = null;


        try {
            for (String listOfWord : listOfWords) {

                String[] pytaniaIOdpowiedzi = LosowePytanie.losowePytanie(listOfWords).split(";");// losujemy pytanie

                System.out.println(questions.getQuestionFromList(Arrays.stream(pytaniaIOdpowiedzi).toList()));

                List<String> odpowiedziPlusOstatniaLiterkaZPrawidlowaOdpowiedzia = answers.answers(Arrays.stream(pytaniaIOdpowiedzi).toList());
                String literkaZPrawidlowaOdpowiedzia = odpowiedziPlusOstatniaLiterkaZPrawidlowaOdpowiedzia.get(4);

                List<String> listaSamychOdpowiedzi = new ArrayList<>();
                for (int i = 0; i < 4; i++) {
                    listaSamychOdpowiedzi.add(odpowiedziPlusOstatniaLiterkaZPrawidlowaOdpowiedzia.get(i));
                }

                System.out.println(listaSamychOdpowiedzi);

                System.out.println("Ktora odpowiedz wybierasz?");
                String odpowiedzUzytkownika = scanner.nextLine().trim(); //usuwamy biale znaki na poczatku i koncu odpowiedzi
                String odpowiedzZDuzejLitery = odpowiedzUzytkownika.toUpperCase(); // jezeli uzytkownik poda mala litere - ustawiamy na duza

                if (odpowiedzUzytkownika.isEmpty()) {
                    System.out.println("Nie podales odpowiedzi. Sprobuj ponownie");
                    return;
                }

                if (odpowiedzZDuzejLitery.equals(literkaZPrawidlowaOdpowiedzia)) {
                    liczbaPoprawnychOdpowiedzi++;
                    kwotaGwarantowana = Tabela_Kwota.values()[liczbaPoprawnychOdpowiedzi - 1];
                    System.out.println("Brawo to poprawna odpwoiedz " + "Twoja liczba poprawnych odpowiedzi to: " + liczbaPoprawnychOdpowiedzi);
                    System.out.println("Kwota gwarantowana to: " + kwotaGwarantowana.getKwota());


                } else {
                    System.out.println("bledna odpwoiedz");
                    break;
                }

            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Koniec gry. Laczna kwota to: " + (kwotaGwarantowana != null ? kwotaGwarantowana.getKwota() : "0"));
        }
    }
}

