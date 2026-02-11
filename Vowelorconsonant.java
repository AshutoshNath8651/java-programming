//WAP in java to check input character is vowel or consonant
import java.util.Scanner;
public class Vowelorconsonant {
    public static void main(String[] args) {
        Scanner obj =new Scanner(System.in);
        System.out.println(" enter a charector");
        char chr =obj.next().charAt(0);
        if((chr=='a'||chr=='e' || chr=='i'|| chr=='o'||chr=='u') 
        || (chr=='A'||chr=='E' || chr=='I'|| chr=='O'||chr=='U')){
            System.out.println("this is a vowel");

        }
        else if(('A'<chr&& chr <= 'Z')||('a'<chr && chr<= 'z')){
            System.out.println("this is a consonant");
        }
        else{
            System.out.println("this is not a alphabete");
        }
        obj.close();
    }
    
}
