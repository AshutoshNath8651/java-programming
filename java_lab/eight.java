// WAP in java to display all prime number between 1 to N

import java.util.Scanner;
public class eight {
    public static void main(String[] args) {
       Scanner one=new Scanner(System.in);
       System.out.print("enter a number to print  : ");
       int a = one.nextInt();
      
       for( int b=3;b<a;b++ ){
         int prime=1;
        for(int i=2;i<b;i++){
        if(b%i==0){
            prime=0;
        }
    }

        if(prime==1){
            System.out.println("prime number is " + b );      
    
    }
}
       one. close();
    }  
}
