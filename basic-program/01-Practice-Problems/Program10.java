import java.util.Scanner;

public class Program10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        final double KM_TO_MILES_RATIO = 0.621371;

        System.out.println("=== Distance Converter (KM to Miles) ===");


        System.out.print("Enter distance in kilometers: ");
        double kilometers = scanner.nextDouble();


        double miles = kilometers * KM_TO_MILES_RATIO;


        System.out.println(miles);



    }
}