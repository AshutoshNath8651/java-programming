
import java.util.Scanner;
public class Paremitrise {
void disp(int Rollnumber,String Name){
    System.out.println("your rollnumber is"+Rollnumber);
    System.out.println("your name is"+Name);
}
public static void main(String[] args) {
    Paremitrise obj=new Paremitrise();
    Scanner sc= new Scanner();
    System.out.println("enter your name ");
    String a= sc.next();
    System.out.println("enter your roll number");
    int b=sc.nextInt();
    obj.disp( b,a);
    

    

}
    
}
