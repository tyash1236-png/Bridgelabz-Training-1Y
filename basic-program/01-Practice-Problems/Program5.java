import java.util.Scanner;

public class Program5{
    public static void main(String[] args){
        System.out.println("enter the radius");
        Scanner area=new Scanner(System.in);
        int areas=area.nextInt();
        System.out.println("enter the height");
        Scanner height =new Scanner(System.in);
        int heights=height.nextInt();
        double volume= 3.14 * areas* areas *heights;
        System.out.println(volume);
    }
}