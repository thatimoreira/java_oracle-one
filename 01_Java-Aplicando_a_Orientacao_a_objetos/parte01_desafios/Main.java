public class Main {
    public static void main(String[] args) {
        Person  person1 = new Person();
        person1.greeting();

        Calculator calculator1 = new Calculator();
        double n1 = 5.3;
        System.out.printf("2 * %f = %f\n", n1, calculator1.doubleNumber(n1));

        Music   music1 = new Music();
        double  newRate;
        music1.musicTitle = "My Hood (feat. Stormzy)";
        music1.artist = "RAY BLK";
        music1.releaseYear = 2016;
        newRate = music1.rateMusic();
        music1.rating = music1.calculateRatingAverage(newRate);
        music1.displayTechnicalSheet();
    }
}
