import java.util.Scanner;
public class Gpseries {
public static void main(String[] args) {
    Scanner obj1 =new Scanner(System.in);
    System.out.print("enter your number of terms:");
    int a = obj1.nextInt();
    System.out.print("enter your first terms:");
    int b = obj1.nextInt();
    System.out.print("series is :");
    for(int i=1;i<=b*(Math.pow(2,a-1));i=i*2){
        System.out.print(i+" ");
    }
    obj1.close();


}
    
}
