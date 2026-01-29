import java.util.Scanner;

public class Program7{
    public static void main(String[] args){
        System.out.println("enter length of rectangle");
        Scanner rectangle=new Scanner(System.in);
        int rect= rectangle.nextInt();
        System.out.println("enter breadth of rectangle");
        Scanner breadth=new Scanner(System.in);
        int bread= breadth.nextInt();
        int perimeter=2*(rect+bread);
        System.out.println(perimeter);
    }
}



