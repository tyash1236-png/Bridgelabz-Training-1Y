import java.util.Scanner;

public class Program3 {public static void main(String[] args){
    System.out.println("ENTER THE TEMP IN CELSIUS");
    Scanner val1=new Scanner(System.in);
    int values1= val1.nextInt();
    int Fahrenit = (values1 * 9/5) + 32;
    System.out.println(Fahrenit);
}
}
