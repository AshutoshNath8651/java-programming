import java.util.Scanner;
public class sixth{
public static void main(String[] args) {
    Scanner sum = new Scanner(System.in);
    System.out.println("enter a number");
    int a=sum.nextInt();
    System.out.println("enter a second number ");
    int b = sum.nextInt();
    System.out.println("enter third number ");
    int c= sum.nextInt();
    if((a>b) && (c>b)){
        System.out.println();
    }

    sum.close();
}
}
