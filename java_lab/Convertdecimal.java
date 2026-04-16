import java.util.Scanner;

public class Convertdecimal {
    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);
        System.out.print("Enter decimal number: ");
        int a = obj.nextInt();

        int binary = 0;
        int place = 1;

        while (a > 0) {
            int b = a % 2;
            binary = binary + b * place;
            place = place * 10;
            a = a / 2;
        }

        System.out.println("Binary = " + binary);
        obj.close();
    }
}
