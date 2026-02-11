// package pattern_printing;
// import java.io.*;
import java.util.Scanner;
 public class Pattern{
    public static void main(String[] args) {
        Scanner obj1=new Scanner(System.in);
        System.out.println("enter your length of rectangle");
        int a = obj1.nextInt();
        for(int i=1;i<=a;i++){
            for(int j=1;j<a;j++){
                System.out.println((char)65+j);
            }
            System.out.println();
        }
        obj1.close();
    }
    
}
