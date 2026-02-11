// package pattern_printing;
import java.util.Scanner;
  public class Rectangular {
    public static void main(String[] args) {
        Scanner obj1=new Scanner(System.in);
        System.out.println("enter a lengh of a rectangular");
        int a =obj1.nextInt();
        for(int i=1;i<=a;i++){
            for(int j=1;j<=a;j++){
            System.out.print("*");
            }
            System.out.println();

        }
        obj1.close();
    }
}
