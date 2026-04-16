package recursion;
import java.util.Scanner;
public class Print_array {
    public static void main(String[] args) {
        System.out.println("enter a length of array:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
    
        }
        System.out.println("form of array is:");
        for(int i =0;i<n;i++){
            System.out.println(arr[i]);
        }
        sc.close();
        return;   
    } 
}
