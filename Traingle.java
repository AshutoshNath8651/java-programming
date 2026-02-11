//WAP in java to print downward triangle start pattern
import java.util.Scanner;
public class Traingle {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("gives me length of traingle :");
        int a = obj.nextInt();
        for(int i=1;i<a;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println("\n");
        }
        obj.close();
    }
    
}
