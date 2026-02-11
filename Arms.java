//WAP in java to check number is Armstrong or not

import java.util.Scanner;
public class Arms {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("enter your number");
        int a= obj.nextInt();
        int b=a,c=0,s=a;
        int sum=0;
        while(a>0){
            sum++;
        
            a=a/10;

        }
       
        while(b>0){
             int d=b%10;
             c= Math.powExact(d,sum) +c;
             b=b/10;

        }
        if(s==c){
            System.out.println("this is a armstrong number");

        }
        else
        {
            System.out.println("not arms number"); 
        }
       

        obj.close();

    }
    
}
