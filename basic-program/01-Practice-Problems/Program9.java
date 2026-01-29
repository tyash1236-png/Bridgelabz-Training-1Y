import java.util.Scanner; // 1. Import the Scanner class

public class Program9 {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.println(" Average Calculator ");

        System.out.print("Enter first number: ");
        double num1 = reader.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = reader.nextDouble();

        System.out.print("Enter third number: ");
        double num3 = reader.nextDouble();


        double average = (num1 + num2 + num3) / 3;


        System.out.printf("The average of %.2f, %.2f, and %.2f is: %.2f%n",
                num1, num2, num3, average);

    }
}