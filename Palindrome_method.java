package Practiceset2.com;

import java.util.Scanner;

public class Palindrome_method {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println(" enter a number ");
        int num = in.nextInt();

        palindrome(num);

    }
    static void palindrome(int number){

        int rev_num = 0 , remainder ;
        int orgininal_num = number;
        while (number != 0) {

            remainder = number % 10 ;
            rev_num = rev_num * 10 + remainder;
            number = number / 10;

        }
        if ( orgininal_num == rev_num){
            System.out.println("YES ! it is palindrome");
        }
        else{
            System.out.println(" NO !!! not a palindrome");
        }
    }


}
