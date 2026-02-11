import java.util.Scanner;

public class Multiplicationsign {
    public static void main(String[] args) {
        Scanner obj1= new Scanner(System.in);
        System.out.print("enter a odd number:");
        int a = obj1.nextInt();
        if(a%2!=0){
        for(int i=1;i<=a;i++){
            for(int j=1;j<=a;j++){
                if((i+j)==(a+1)){
                    System.out.print("*"+" ");

                }
                else{
                    System.out.println("  ");
                }
            }
            System.out.println();
        }
        }
        else{
            System.out.println("this is a invalide enter");
        }
        obj1.close();
        
    }
    
}
