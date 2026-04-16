//WAP in java to calculate simple interest


import java.util.Scanner;
public class simpleintest {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("enter your amount");
        double a = obj.nextDouble();
        System.out.print("enter your intest rate");
        double b= obj.nextDouble();
        System.out.print("enter your time");
        int c=obj.nextInt();
        double g= ((a*b*c)/100);
        System.out.println("your interest is :"+ g);
        obj.close();
    }
    
}
