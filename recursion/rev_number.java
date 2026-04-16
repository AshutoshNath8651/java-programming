package recursion;
import java.util.Scanner;
public class rev_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int k = sc.nextInt();
         int b=reverse(k);
         System.out.println(b);
         sc.close();
    }
     static int sum = 0;
    public static int reverse(int x){
        if(x%10==0)return x;      
        sum=sum*10+(x%10);
        reverse(x/10);
        return sum;
    }
    
}
