package pl.pawit;


public class QuestionsConstructor {

    String numberOfQuestion;
    String ContentOfQuestion;
    String A;
    String B;
    String C;
    String D;

    public QuestionsConstructor(String numberOfQuestion, String contentOfQuestion, String a, String b, String c, String d) {
        this.numberOfQuestion = numberOfQuestion;
        ContentOfQuestion = contentOfQuestion;
        A = a;
        B = b;
        C = c;
        D = d;
    }

    @Override
    public String toString() {
        return "QuestionsConstructor{" +
                "numberOfQuestion='" + numberOfQuestion + '\'' +
                ", ContentOfQuestion='" + ContentOfQuestion + '\'' +
                ", A='" + A + '\'' +
                ", B='" + B + '\'' +
                ", C='" + C + '\'' +
                ", D='" + D + '\'' +
                '}';
    }
}