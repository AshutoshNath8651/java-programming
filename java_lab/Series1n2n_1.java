import java.util.Scanner;
public class Series1n2n_1 {
    public static void main(String[] args) {
        Scanner obj1 = new Scanner(System.in);
        System.out.print("enter a last element");
        int n = obj1.nextInt();
        for(int i=1;i<=n;i++){
            System.out.print(i+" ");
            for(int j=(n+1)-i;(j+i)<=(n+1);j++){

                System.out.print(j+" ");
            }
        }
        obj1.close();

    }
    
}
