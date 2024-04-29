import java.util.Scanner;

public class Music {
    String  musicTitle;
    String  artist;
    int     releaseYear;
    double  rating = 8.5;    //Assigned value only to test the program
    int     numRatings = 2;  //Assigned value only to test the program

    void    displayTechnicalSheet(){
        System.out.printf("Music title: %s\n", musicTitle);
        System.out.printf("Artist: %s\n", artist);
        System.out.printf("Release year: %d\n", releaseYear);
        System.out.printf("Rating: %.2f\n", rating);
        System.out.printf("Number of ratings: %d\n", numRatings);
    }

    double    rateMusic(){
        Scanner scanner;
        double  newRate;

        scanner = new Scanner(System.in);
        System.out.printf("Rate '%s': ", musicTitle);
        newRate = scanner.nextDouble();
        scanner.close();
        numRatings++;
        return (newRate);
    }

    double    calculateRatingAverage(double newRate){
        if (numRatings == 1){
            rating = newRate;
        } else{
            rating = (rating + newRate) / 2;
        }
        return (rating);
    }
}
