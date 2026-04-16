
import java.util.Scanner;
public class kshitijquestion {
   public static void main(String[] args) {
    Scanner obj1 = new Scanner(System.in);
    System.out.println("Enter your age: ");
    int age = obj1.nextInt();
    int price = 0;
    System.out.println("today is a weekend?");
    System.out.println("enter 0 if no and 1 if yes");
    int weekend=obj1.nextInt();

    if(age<=12 && age>=0){
        price =8;
        if(weekend==1){
            price=price+3;
        }
        
    }
    else if(age>12 && age<=17){
        price=12;
        if(weekend==1){
            price=price+3;
        }
    }
    else if(age>17&&age<=59){
        price = 15;
        if(weekend==1){
            price=price+3;
        }
    }
    else{
        price=10;
        if(weekend==1){
            price=price+3;
        }
    }
    System.out.println(price);
    obj1.close();


   } 
}
