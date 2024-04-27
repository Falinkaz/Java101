import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        double score = 0;
        double averageScore = 0;

        for (int i = 0; i < 3; i++) {
            System.out.println("How would you rate this movie?");
            score = keyboard.nextDouble();
            averageScore = averageScore + score;
        }
        System.out.println("The average score for this movie is: " + averageScore / 3);
    }
}


