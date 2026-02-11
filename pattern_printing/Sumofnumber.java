
import java.util.Scanner;
public class Sumofnumber {
    public static void main(String[] args) {
        System.out.println("enter your number");
        Scanner obj1=new Scanner(System.in);
        int a=obj1.nextInt();
        int sum=0;
        for(int i=1;i<=a;i++){
            sum=sum+i;

            
        }
        System.out.println("sum of number is"+(sum));
        obj1.close();
    }
}
