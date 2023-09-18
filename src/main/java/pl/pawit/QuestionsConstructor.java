package pl.pawit;


public class QuestionsConstructor {

    String numberOfQuestion;
    String ContentOfQuestion;
    String A;
    String B;
    String C;
    String D;

    public QuestionsConstructor(String numerPytania, String trescPytania, String answerA, String answerB, String answerC, String answerD) {
        this.numberOfQuestion = numerPytania;
        this.ContentOfQuestion = trescPytania;
        A = answerA;
        B = answerB;
        C = answerC;
        D = answerD;
    }

    @Override
    public String toString() {
        return "Questions{" +
                "numerPytania=" + numberOfQuestion +
                ", trescPytania='" + ContentOfQuestion + '\'' +
                ", A='" + A + '\'' +
                ", B='" + B + '\'' +
                ", C='" + C + '\'' +
                ", D='" + D + '\'' +
                '}';
    }

}