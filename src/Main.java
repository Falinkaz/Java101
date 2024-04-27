public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Screen Match");
        System.out.println("Movie: Matrix");

        int releaseDate = 1999;
        boolean includedInPlan = true;
        double movieScore = 8.2;

        double average = (8.2 + 6.0 + 9.0) / 3;
        System.out.println(average);

        String synopsis = """
                The Matrix is a paradox
                Regarded as the most influential sci-fi movie of the last century
                It was released in:
                """ + releaseDate;
        System.out.println(synopsis);

        int rating = (int) (average / 2);
        System.out.println(rating);
    }
}