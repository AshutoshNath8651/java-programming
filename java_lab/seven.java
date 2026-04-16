// WAP in java to find largest among 3 numbers.
import java.util.Scanner;
public class seven {
    public static void main(String[] args) {
        Scanner test= new Scanner(System.in);
        System.out.println("enter your first number");
        int a = test.nextInt();
        System.out.println("enter your second number"); 
        int b = test.nextInt();
        System.out.println("enter your third number");
        int c = test.nextInt();
        if((a >= b && a >= c) && (b >= c || c >= b )){
            System.out.println("first number is grater:" +" "+ a);
        }
        else if((b >= a && b>=c ) && (a >= b || b >= a)){
            System.out.println("second number is grater:" +" "+ b);
        }
        else{
            System.out.println("third is grater:" +" "+ c);
        }
        test.close();
    }
}
        

        

        
        



    
    

