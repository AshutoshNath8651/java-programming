
import java.util.Scanner;
public class Sumof_digit {
    public static void main(String[] args) {
        Scanner obj1 =new Scanner(System.in);
        System.out.print("enter a number:");
        int a=obj1.nextInt();
        int b=0,c=0;
        while(a>0){
            b = a%10;
            c=c+b;
            a=a/10;

        }
        System.out.println("sum of digit of a number is "+c);
        obj1.close();
    }
    
    
}
