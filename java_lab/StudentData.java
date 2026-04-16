import java.util.Scanner;

public class StudentData {
    int age;
    String name;
    int marks;
    StudentData(int age,String name){
        this.age = age;
        this.name = name;
    }
    StudentData(StudentData stu){
        this.age = stu.age;
        this.name = stu.name;
        this.marks = 55;
    }
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter your age: ");
        int age=sc.nextInt();
        System.out.print("enter your name :");
        sc.nextLine();
        String name =sc.nextLine();
        StudentData obj = new StudentData(age,name);
        System.out.println("student 1 name:"+obj.name+" age :"+obj.age);
        StudentData obj2 = new StudentData(obj);
        System.out.println("student 1 name:"+obj2.name+" age :"+obj2.age);
        System.out.println("student 1 name:"+obj2.name+" age :"+obj2.age+ "marks:"+obj2.marks);
        sc.close();

    }
    
}
