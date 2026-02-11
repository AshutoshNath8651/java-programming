//WAP in java to print reverse of the number
import java.util.Scanner;
public class Reversenumber {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("enter a number");
        int a=obj.nextInt();
        int c=0;
        while (a>0) {
        int b=a%10;
        
        c=c*10+b;
        a=a/10;
        }
        System.out.println("Reverse number is"+ c);
        obj.close();
        
    }
    
}
