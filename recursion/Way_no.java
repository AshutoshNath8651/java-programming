package recursion;
import java.util.Scanner;
public class Way_no {
    int  n,s;
    Way_no(int n){
        this.n=n;       
    }
    int way(int n){
        if(n==1||n==2)return n;
        return way(n-1) + way(n-2);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a number of step:");
        int p = sc.nextInt();
        Way_no obj = new Way_no(p);
        int k=obj.way(p);
        System.out.print("no of way:"+k);   
        sc.close();
    }   
}
