package it.figuccia;

public class Start {
    public static void checkScore(double score) throws ArithmeticException {
        if (score > 0 && score <= 50.0) {
            System.out.println("Average score");
        } else if (score > 50.0 && score <= 100.0) {
            System.out.println("Very good score");
        } else {
            throw new ArithmeticException("Score is out of scale!");
        }
    }

    public static void main(String[] args) {
        double[] scores = {2.15, 50, 95.02, 100.01};
        for (double score : scores) {
            try {
                checkScore(score);
            } catch (ArithmeticException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
