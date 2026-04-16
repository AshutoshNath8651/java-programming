
import java.util.Scanner;

public class Quadrant {
    public static void main(String[] args) {
        Scanner obj1 = new Scanner(System.in);
    
        System.out.print("enter a x-axis number:");
        double b = obj1.nextDouble();
        System.out.print("enter a y- axis number:");
        double c = obj1.nextDouble();
        double k =( Math.atan(c/(Math.sqrt(c*c+b*b)))*180/3.14159265359);
        System.out.println("angle form x- axis is"+k);
        if(k>=0 && k<90 && b>0 && c>0){
            System.out.println("this is a first Quadrant");
        }
        else if(k>=0 && k<90 && b<0&& c>0){
            System.out.println("this is a second Quadrant");
        }
        else if(k<=0 && k>-90 && b<0 && c<0){
            System.out.println("this is a third Quadrant");
        }
        else{
            System.out.println("this is a fouth Quadrant");
        }

        obj1.close();
        
    }
    
}
