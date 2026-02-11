//WAP in java to print all arithmetic operation result of two integers given by user


import java.util.Scanner;
public class third{
    public static void main(String[] args) {
      Scanner song= new Scanner(System.in);
      System.out.println("Enter 1st number"); 
      int a=song.nextInt();
      System.out.println("enter second number");
      int b=song.nextInt();
    //   int d=a;
    //   a=b;
    //   b=d;
      a=a+b;
      b=a-b;
      a=a-b;
      System.out.println("after the swaping");
      System.out.println("first number is" + a);
      System.out.println("second number is" + b);
      //without third variable
      
      song.close();

    }
}
