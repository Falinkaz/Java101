import java.util.Scanner;

public class Ratings {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        double score = 0;
        double averageScore = 0;
        double totalRatings = 0;

        while (score != -1){
            System.out.println("How would you rate this movie?");
            score = keyboard.nextDouble();
            if (score != -1) {
                averageScore += score;
                totalRatings++;
            }
        }
        System.out.println("The average score for this movie is: " + averageScore / totalRatings);
        }
}
