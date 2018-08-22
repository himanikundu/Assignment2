
import java.util.Scanner;
public class Palindrome {

    public static void main(String[] args) {
Scanner input = new Scanner (System.in);
    System.out.println("Input the  number: ");
    int num = input.nextInt();

        int  reversedInteger = 0, remainder, originalInteger;

        originalInteger = num;

        // reversed integer is stored in variable 
        while( num != 0 )
        {
            remainder = num % 10;
            reversedInteger = reversedInteger * 10 + remainder;
            num  /= 10;
        }

        // palindrome if orignalInteger and reversedInteger are equal
        if (originalInteger == reversedInteger)
            System.out.println(originalInteger + " is a palindrome.");
        else
            System.out.println(originalInteger + " is not a palindrome.");
    }
}