
import java.util.Scanner;
public class Plusesign {
    public static void main(String[] args) {
        Scanner obj1 =new Scanner(System.in);
        System.out.print("enter a odd length of pluse sign:");
        int  a=obj1.nextInt();
        if(a%2!=0){
        for(int i=1;i<=a;i++){
            for(int j=1;j<=a;j++){
                if(j==((a+1)/2)||i==((a+1)/2)){
                    System.out.print("*"+" ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        }
    else{
        System.out.println("this is a invalide enpute");
       }
       obj1.close();
    }
    
}
