//WAP in java to print pyramid start pattern

import java.util.Scanner;
public class Pyramid {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("enter a lenght of pyramid");
        int a = obj.nextInt();
        for(int i=1;i<=a;i++){
            for(int j=1;j<a+1-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print("*");
            }
            System.out.println("\n");

        }
        obj.close();
    }
    
}
