import java.util.Locale;
import java.util.Scanner;

import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {

        // *****.....PROGRAM TO CHECK A NUMBER IS PALINDROME OR NOT....*****

        Scanner sc = new Scanner(System.in);
        int  reversedNum = 0, remainder;
        System.out.println("enter a number...");
        int num = sc.nextInt();
        // store the number to originalNum
        int originalNum = num;

        // get the reverse of originalNum
       // store it in variable
        while (num != 0) {
            remainder = num % 10;
            reversedNum = reversedNum * 10 + remainder;
            num /= 10;
        }
       // check if reversedNum and originalNum are equal
        if (originalNum == reversedNum) {
            System.out.println(originalNum + " is palindrome");
        }
        else {
            System.out.println(originalNum + " is not palindrome");
        }




        // *****.....PROGRAM TO CHECK A STRING IS PALINDROME OR NOT....*****

        System.out.println("enter a string....");
        String str = sc.nextLine();
        String reverseStr = "";
        int strLength = str.length();

        for (int i = (strLength - 1); i >= 0; --i) {
            reverseStr = reverseStr + str.charAt(i);
        }

        if (str.toLowerCase().equals(reverseStr.toLowerCase())) {
            System.out.println(str + " is  palindrome ");
        }
        else if(str.toUpperCase().equals(reverseStr.toUpperCase())) {
            System.out.println(str + " is palindrome ");
        }
        else
         {
            System.out.println(str + " is not Palindrome ");
        }
    }


}
