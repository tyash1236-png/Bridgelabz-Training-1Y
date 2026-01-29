import java.util.Scanner;

public class Program4 {public static void main(String[] args){
    System.out.println("ENTER THE RADIUS");
    Scanner val1=new Scanner(System.in);
    int values1= val1.nextInt();
    double AREA = 3.14 *values1*values1;
    System.out.println(AREA);
}
}

