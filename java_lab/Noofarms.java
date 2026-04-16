// WAP in java to print all Armstrong number between two integers.
import java.util.Scanner;
public class Noofarms {
    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);
        System.out.print("Enter last number: ");
        int a = obj.nextInt();

        for (int n = 1; n <= a; n++) {

            int temp = n;
            int digits = 0;
            int sum = 0;

            // count digits
            while (temp > 0) {
                digits++;
                temp = temp / 10;
            }

            temp = n;

            // Armstrong logic
            while (temp > 0) {
                int d = temp % 10;
                sum = sum + (int) Math.pow(d, digits);
                temp = temp / 10;
            }

            if (sum == n) {
                System.out.println(n + " is Armstrong number");
            }
        }

        obj.close();
    }
}

    
    


