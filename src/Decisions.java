public class Decisions {
    public static void main(String[] args) {
        int releaseDate = 1999;
        boolean includedInPlan = true;
        double movieScore = 8.2;
        String planType = "plus";

        if (releaseDate >= 2022){
            System.out.println("Most Popular Movies");
        }else{
            System.out.println("Retro Movies worth watching");
        }

        if (includedInPlan || planType.equals("plus")){
            System.out.println("Enjoy your Movie");
        } else {
            System.out.println("Subscribe to Plus to watch!");
        }
    }
}
