
import java.util.Scanner;
class No{
    int x;
    int y;
    No(int x,int y){
        this.x=x;
        this.y=y;
        prins();
    }
    No(){}
    void prins(){
        if(y>=0){
            System.out.println("complex no is:"+x+ "+" +y+"i");
        }
        else{
            System.out.println(x+"-"+(-y)+"i");
        }
    }
    int add(No z){
        this.x=this.x+z.x;
        this.y=this.y+z.y;
        prins();
       
        return 0;
    }
}
class ComplexNo{
    public static void main(String[] args){
        Scanner obj1 = new Scanner(System.in);
        System.out.print("enter X1 aries:");
        int a = obj1.nextInt();
        System.out.println("enter y1 axis :");
        int b = obj1.nextInt();
        No z1 = new No(a,b);
        System.out.print("enter X2 aries:");
        int c = obj1.nextInt();
        System.out.println("enter y2 axis :");
        int d = obj1.nextInt();       
        No z2 = new No(c,d);
        z1.add(z2);
        obj1.close();

    }
}