// package pattern_printing;
import java.util.Scanner;
public class Samenumber {
    public static void main(String[] args) {
        Scanner obj1 = new Scanner(System.in);
        System.out.println("enter a length of a rectangle :");
        int a = obj1.nextInt();
        for(int i = 1;i<=a;i++){
            for(int j=1;j<=a;j++){
                System.out.print(i);
            }
            System.out.println();
        }
        obj1.close();
        
    }
    
}
