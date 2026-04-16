package recursion;
import java.util.Scanner;

public class Print1_5 {
    public static void main(String[] arg){
        int n;
    System.out.println("enter a number to print");   
    Scanner sc = new Scanner(System.in);
    n = sc.nextInt();
    prints(n);
    sc.close();
}
public static void prints(int x){
    if(x==0)return;
    System.out.print(x + " ");   
    prints(x-1);
    System.out.print(x +" ");
}
    
}
