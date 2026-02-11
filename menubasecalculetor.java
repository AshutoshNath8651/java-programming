//WAP in java to create menu-based calculator
import java.util.Scanner;
public class menubasecalculetor {
    public static void main(String[] args) {
        Scanner obj= new Scanner(System.in);
        System.out.println("1 means addition");
        System.out.println("2 means subtraction");
        System.out.println("3 means multiplying");
        System.out.println("4 means dividing");
        System.out.println("enter your first number");
        int a=obj.nextInt();
        System.out.println("enter your second number");
        int b = obj.nextInt();
        System.out.println("enter your operation");
        int opetion=obj.nextInt();
        switch (opetion) {
            case 1:
                System.out.println("additional value is"+(a+b));
                
                break;
            case 2:
                System.out.println("subtraction value is"+(a-b));
                break;
            case 3:
                System.out.println("multiplicational value is"+ (a*b));
                break;
            case 4:
                System.out.println("dividing value is"+(a/b));
                break;

        
            default:
                System.out.println("envalide input");

                break;
        }
        obj.close();
    }
    
}
