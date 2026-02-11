
// Take real no and cheake this is integer a not
import java.util.Scanner;
public class Realno {
    public static void main(String[] args) {
        Scanner obj1 = new Scanner(System.in);
        System.out.println("enter a number:");
        double a = obj1.nextDouble();
        if((int)a==a){
            System.out.println("this is a integr");
        }
        else{
            System.out.println("this is a not a integr");
        }
        obj1.close();
        
        
    }
    
}
