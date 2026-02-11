// package pattern_printing;
import java.util.Scanner;
public class Trangle {
    public static void main(String[] args) {
        Scanner obj1 =new Scanner(System.in);
        System.out.print("enter a size of trangle:");
        int a = obj1.nextInt();
        for(int i=1;i<=a;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
            
        }
        obj1.close();
    }
    
}
