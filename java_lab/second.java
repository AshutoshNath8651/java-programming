//WAP in java to print all arithmetic operation result of two integers
import java.util.Scanner;
public class second {
    public static void main(String[] args) {
       Scanner in =new Scanner(System.in);
       System.out.println("Enter 1st number");
       int a =in.nextInt();
       System.out.println("Enter 2nd number");
       int b = in.nextInt();
       System.out.println("sum is " + (a+b));
       System.out.println("subtraction  is" + (a-b));
       System.out.println("multiplication  is" + (a*b));
       System.out.println("division  is" + (a/b));
       System.out.println("modulus  is" + (a%b));

       

        in.close();
    }
}