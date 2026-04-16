//WAP in java to find area and perimeter of rectangle

import java.util.Scanner;
public class Rectangle {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("ennter length");
        double a = obj.nextDouble();
        System.out.println("enter width");
        double b = obj.nextDouble();
        double area = a*b;
        double perimeter = 2*(a+b);
        System.out.println("area of rectangle is:"+ area);
        System.out.println("perimeter of rectangle is :" + perimeter);
        obj.close();

    }
    
}
