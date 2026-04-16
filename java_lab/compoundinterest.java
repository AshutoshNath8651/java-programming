// WAP in java to calculate compound interest


import java.util.Scanner;
public class compoundinterest {
    public static void main(String[] args) {
    Scanner obj = new Scanner(System.in);
    System.out.println(" enter your amount");
    double a= obj.nextDouble();
    System.out.println("enter your total time");
    int b= obj.nextInt();
    System.out.println("enter your turn cycle");
    double c=obj.nextDouble();
    double n=(1.0*b)/c;
    System.out.println("enter your rate");
    int r = obj.nextInt();
    double k=1+r/100.0;
    System.out.println(k); 
    double ci = a*(Math.pow(k,n))-a;
    System.out.println("your compound interst is " + ci);
    obj.close();
    }
    
}
