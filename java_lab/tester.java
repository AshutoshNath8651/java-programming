import java.util.Scanner;
public class tester {
    
        double a;
        double c;
        public void add(double a,double c){
            this.a=a;
            this.c=c;
            System.out.println("addition of two number is"+(this.a+this.c));
            
        
        }
        public void sub(double a,double c){
            this.a=a;
            this.c=c;
            System.out.println("subtration of two number is"+(this.a-this.c));
        }
        void mul(double a,double c){
            this.a=a;
            this.c=c;
            System.out.println("multiplication of two number is"+(this.a*this.c));
        }
        void div(double a,double c){
            this.a=a;
            this.c=c;
            System.out.println("division of two number is"+(a/c));
        }
        public static void main(String[] args) {
            Scanner obj1=new Scanner(System.in);
            Arthmatic nam=new Arthmatic();
            System.out.println("enter your two number");
           
            // nam.a=obj1.nextDouble();
            // nam.c=obj1.nextDouble();
            nam.add(obj1.nextDouble(),obj1.nextDouble());
            nam.sub(obj1.nextDouble(),obj1.nextDouble());
            nam.mul(obj1.nextDouble(),obj1.nextDouble());
            nam.div(obj1.nextDouble(),obj1.nextDouble());
            
            obj1.close();




            

            
        }
        
        
    }
    


    


    

