


import java.util.Scanner;
public class UseStatic {
    int rollno;
    String name;
    static int count;
    UseStatic(String name,int rollno){
        this.rollno=rollno;
        this.name=name;
        count++;
        getTotalstudent();
    }
    void display(){
        System.out.println("name of student is:"+name);
        System.out.println("Rollno of student is :"+rollno);
    }
    static void getTotalstudent(){
        System.out.print("total no of student :"+count);
    }
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        String[] nem = new String[5];
        int[] rolno= new int[5];
        for(int i =0;i<5;i++){
        System.out.println("enter student name"+i+":");
    
        nem[i] =sc.nextLine();
        System.out.println("enter student Rollno"+i+":");
        rolno[i]=(int)sc.nextInt();
        sc.nextLine();
        }
        UseStatic[] obj = new UseStatic[5];
        for(int i=0;i<5;i++){
             obj[i] = new UseStatic(nem[i],rolno[i]);

        }
        for(int i=0;i<5;i++){
            obj[i].display();
        } 
        UseStatic.getTotalstudent();
        sc.close();

    }
    
}
