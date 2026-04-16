import java.util.Scanner;
 class Constrctor{
    long Rollnumber;
    String Name;
    void disp(){
        System.out.println("your rollnuber is"+Rollnumber);
        System.out.println("your name is"+Name);
    }       
   
 
 public static void main(String[] avg){
     
    Constrctor obj1 = new Constrctor();//default constractor
    obj1.Rollnumber= 75;
    obj1.Name = "ashutosh";
    obj1.disp();
    
 }
 }

