
import java.util.Scanner;
public class TrangularAbcd{
    public static void main(String[] args) {
        Scanner onj = new Scanner(System.in);
        System.out.print("enter a size of a trangle");
        int a = onj.nextInt();
        for(int i=0;i<a;i++){
            for(int j=0;j<i;j++){
                System.out.print((char)(65+j));
            }
            System.out.println();
        }
        onj.close();


    }
}


