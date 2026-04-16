
import java.util.Scanner;
public class Trainglemadeornot {
    public static void main(String[] args) {
        Scanner obj1 = new Scanner(System.in);
        System.out.print("enter your traingle first side:");
        double a = obj1.nextDouble();
        System.out.print("enter your traingle second side :");
        double b = obj1.nextDouble();
        System.out.println("enter your traingle third side:");
        double c = obj1.nextDouble();
        if((a*a)+(b*b)==(c*c)){
            System.out.println("traingle is formed:");

        }
        else{
            System.out.println("traingle is not formed:");
        }
        obj1.close();
    }
    
}
