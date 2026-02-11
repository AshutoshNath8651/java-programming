//WAP in java to check even or odd integer.


import java.util.Scanner;
public class fifth {

    public static void main(String[] args) {
        Scanner test=new Scanner(System.in);
        System.out.println("enter a number");
        int a=test.nextInt();
        int d=0;
        for(int i=2;i<a;i++){
            if(a%i==0){
                // System.out.println("Not a prime number");
                d=1;
            }
            
        }
        if(d==0){
            System.out.println("this is a prime number");

        }
        else{
            System.out.println("this is not a prime number");
        }
        test.close();
    }
}
