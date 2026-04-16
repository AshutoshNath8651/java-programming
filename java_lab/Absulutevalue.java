
import java.util.Scanner;
public class Absulutevalue {
    public static void main(String[] args) {
      Scanner obj1 = new Scanner(System.in);
      System.out.print("enter a number: ");
      double a=obj1.nextDouble();
      if(a>=0){
        System.out.println("your absulute value is "+a);
      }
      else{
        System.out.println("your absulute value is "+(-a));

      }
      obj1.close();


    }
    
}
