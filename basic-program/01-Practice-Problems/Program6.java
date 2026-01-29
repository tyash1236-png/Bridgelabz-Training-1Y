import java.sql.Time;
import java.util.Scanner;

public class Program6 {public static void main(String[] args){
    System.out.println("enter principal amount");
    Scanner principal=new Scanner(System.in);
    int prin=principal.nextInt();
    System.out.println("Rate");
    Scanner Rate=new Scanner(System.in);
    int Rates= Rate.nextInt();
    System.out.println("enter time period");
    Scanner time=new Scanner(System.in);
    int times= time.nextInt();
    int simpleinterest=(prin*Rates* times)/100;
    System.out.println(simpleinterest);
}}
//Simple Interest = (Principal * Rate * Time) / 100.