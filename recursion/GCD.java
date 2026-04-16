package recursion;
import java.util.Scanner;
public class GCD {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter first number:");
        int a = sc.nextInt();
        System.out.println("enter second number:");
        int b = sc.nextInt();
        int c= hcf(a,b);
        System.out.println("value of hcf is :"+c);
        sc.close();
        
    }
    public static int hcf(int x,int y){
        x=Math.min(x,y);
        y=Math.max(x,y);
        if(y%x==0)return x;
        int p=hcf(y%x,x);
        return p;
    }
    
}
