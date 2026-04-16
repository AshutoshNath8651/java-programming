//WAP in java to swap two numbers using 3rd variable and without 3rd variable

import java.util.Scanner;
public class fourth {

    public static void main(String[] args) {
        Scanner test=new Scanner(System.in);
        System.out.println("Enter a number");
        int a=test.nextInt();
        if (a % 2==0){
            System.out.println("this is a even number");
        }
        else{
            System.out.println("this is a odd number");

        }
        test.close();
    }
}
