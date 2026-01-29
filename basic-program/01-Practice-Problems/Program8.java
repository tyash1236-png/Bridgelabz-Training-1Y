import java.util.Scanner;
public class Program8 {public static void main(String[] args){
    System.out.println("enter base");
    Scanner base=new Scanner(System.in);
    int bases=base.nextInt();
    System.out.println("enter exponent");
    Scanner exponent=new Scanner(System.in);
    int exponents=exponent.nextInt();
    double result=Math.pow(bases,exponents);
    System.out.println(result);


}
}
