
import java.util.Scanner;
public class ReverseTrangle {
    public static void main(String[] args) {
        Scanner obj1 =new Scanner(System.in);
        System.out.print("enter a length of a traingle:");
        int a = obj1.nextInt();
        for(int i=0;i<a;i++){
            for(int j=i;j<a;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        obj1.close();

    }
    
}
