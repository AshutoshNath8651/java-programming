
import java.util.Scanner;
public class Fourdigit {
    public static void main(String[] args) {
        Scanner obj1 = new Scanner(System.in);
        System.out.print("enter a number :");
        int a = obj1.nextInt();
        int b = a%1000;
        int c = a/1000;
        if(c<=9 && b<=999){
            System.out.println(a+" is  a four digit number");
        }
        else{
            System.out.println(a+"is  not a four digit number");
        }
        obj1.close();

    }
    
}
