import java.util.Scanner;

public class Read {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("What's your favorite movie?");
        String movie = keyboard.nextLine();
        System.out.println("What's the release year?");
        int releaseDate = keyboard.nextInt();
        System.out.println("Finally, what score would you give it");
        double score = keyboard.nextDouble();

        System.out.println(movie);
        System.out.println(releaseDate);
        System.out.println(score);
    }
}
