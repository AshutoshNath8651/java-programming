// package pattern_printing;
import java.util.Scanner;
public class ABCD {
    public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      System.out.println("enter your length of rectangle");
      int var2 = var1.nextInt();

      for(int var3 = 1; var3 <= var2; ++var3) {
         for(int var4 = 1; var4 < var2; ++var4) {
            System.out.println(65 + var4);
         }

         System.out.println();
      }

      var1.close();
   }
}
