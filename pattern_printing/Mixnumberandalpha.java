
import java.util.Scanner;
public class Mixnumberandalpha {
    public static void main(String[] args) {
        Scanner obj1 = new Scanner(System.in);
        System.out.print("enter a length of a traingle:");
        int a =obj1.nextInt();
        for(int i=1;i<=a;i++){
            for(int j=1;j<=i;j++){
                if(i%2!=0){
                    System.out.print(j);
                }
                else{
                    System.out.print((char)(64+j));
                }
                
            }
            System.out.println();
        }
        obj1.close();

    }
    
}
