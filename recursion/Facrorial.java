package recursion;
import java.util.Scanner;
public class Facrorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number: ");
        int n = sc.nextInt();
        int k= fac(n);
        System.out.println(k);

        sc.close();
        
    }
    public static int fac(int x){
        if(x==1)return 1;
        return x*fac(x-1);
    }
    
}
