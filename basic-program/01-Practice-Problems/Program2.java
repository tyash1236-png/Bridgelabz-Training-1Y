import java.util.Scanner;

public class Program2 {public static void main(String[] args){
    System.out.println("ENTER THE NUMBER");
    Scanner val1=new Scanner(System.in);
    int values1= val1.nextInt();
    Scanner val2=new Scanner(System.in);
    int values2= val1.nextInt();
    int sums=values1+values2;
    System.out.println(sums);
}
}
