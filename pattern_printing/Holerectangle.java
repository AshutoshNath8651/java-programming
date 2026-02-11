import java.util.Scanner;

public class Holerectangle {
    public static void main(String[] args) {
        Scanner obj1 = new Scanner(System.in);
        System.out.print("enter a length  of a rectangle:");
        int a = obj1.nextInt();
        for(int i =1;i<=a;i++){
            for(int j=1;j<=a;j++){
                if(i==1||i==a||j==1||j==a){
                    System.out.print("*"+" ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        obj1.close();
    }

    
}
