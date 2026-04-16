package recursion;
import java.util.Scanner;
public class Power_value {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a base value:");
        int a = sc.nextInt();
        System.out.print("enter the power value:");
        int b = sc.nextInt();
        int c= power(a,b);
        System.out.println("value is :"+ c);
        sc.close();
    }
    
    public static int power(int x,int y){
        if(y==0)return 1; 
        int p = power(x,y/2);
        if(y%2==0){    
            return p*p;
        }
        return x*p*p;
    }
    
}
