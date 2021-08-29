import java.util.Scanner;

public class Armstrong_num {
    public static void main(String[] args) {

        // An Armstrong number is a positive m-digit number that is equal to the sum of the mth powers of their digits.
        // It is also known as pluperfect, or Plus Perfect, or Narcissistic number.

        //3:- 31 = 3
        //153:- 1(3) + 5(3) + 3(3) = 1 + 125+ 27 = 153      :: { 1(power of 3) + 5(power of 3)}
        //125:- 1(3) + 2(3)+ 5(3) = 1 + 8 + 125 = 134 (Not an Armstrong Number)

        Scanner sc = new Scanner(System.in);

        int  originalNumber, remainder, result = 0;

        System.out.println("enter the number..");
        int number = sc.nextInt();

        originalNumber = number;
        while (originalNumber != 0)
        {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, 3);
            originalNumber /= 10;
        }

        if(result == number)
            System.out.println(number + " is an armstrong number");
        else
            System.out.println(number + " is not armstrong number");


    }
}
