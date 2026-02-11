
import java.util.Scanner;

public class Sellerprofitorlose {
    public static void main(String[] args) {
        Scanner obj1 = new Scanner(System.in);
        System.out.print("enter your buying price :");
        double a = obj1.nextDouble();
        System.out.print("enter your selling price :");
        double b = obj1.nextDouble();
        if(a>b){
            System.out.println("seller is lossing "+(a-b));
        }
        else if(b>a){
            System.out.println("seller is profit "+(b-a));
        }
        else{
            System.out.println("no profit no loss");
        }
        obj1.close();
        
    }
    
}
