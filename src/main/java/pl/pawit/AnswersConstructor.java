package pl.pawit;

import java.util.ArrayList;
import java.util.List;

public class AnswersConstructor {
    String numberOfQuestion;
    String correctAnswer;

    public AnswersConstructor(String numberOfQuestion, String correctAnswer) {
        this.numberOfQuestion = numberOfQuestion;
        this.correctAnswer = correctAnswer;
    }

    @Override
    public String toString() {
        return "AnswersConstructor{" +
                "numberOfQuestion='" + numberOfQuestion + '\'' +
                ", correctAnswer='" + correctAnswer + '\'' +
                '}';
    }
}
