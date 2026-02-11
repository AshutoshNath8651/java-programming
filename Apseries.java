import java.util.Scanner;
public class Apseries {
    public static void main(String[] args) {
        Scanner obj1 = new Scanner(System.in);
        System.out.print("enter the last number");
        int a = obj1.nextInt();
        for(int  i = 2;i<=(a);i=i+3){
            System.out.print(i+" ");
        }
        obj1.close();
    }
    
}
