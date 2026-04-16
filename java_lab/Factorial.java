//WAP in java to find factorial of a number
import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner obj =new Scanner(System.in);
        System.out.println("enter your number");
        int a= obj.nextInt();
        int b=a,c=a;

        for(int i=1;i<c;i++){
            a=a*(b-1);
            b=b-1;
        }
        System.out.println("factorial is :"+ a);
        obj.close();

    }
    
}
