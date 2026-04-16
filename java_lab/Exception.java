package java_lab;
import java.util.Scanner;
public class Exception extends Exception{
    super(a,b);
    // int a,b;
    // Exception(int a,int b){
    //     this.a=a;
    //     this.b=b;
    // }
    int divide(int a,int b){
        return a/b;
    }
    public static void main(String[] args) {
        try {
        System.out.println("enter a numreter:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("enter a denumureter :");
        int b = sc.nextInt();
        Exception obj = new Exception();
        int c = obj.divide(a,b);
        }


        
    }
    
}
