import java.util.Scanner;

public class Sum2 {
    public static void main(String[] args) {

        // Write a program to print the sum of negative numbers, sum of positive even numbers and the sum of positive odd numbers
        // from a list of numbers (N) entered by the user. The list terminates when the user enters a zero.

        Scanner sc = new Scanner(System.in);
        int sumNegative = 0 , sumPositiveEven = 0 , sumPositiveOdd = 0 ;
        System.out.println(" enter the numbers - ");

        while (true){
            int num = sc.nextInt();
            if ( num == 0){     // if user enter 0
                break;
            }

            if( num < 0){              // negative number
                sumNegative = sumNegative + num;
            }

            else if ( num % 2== 0){            // even number
                sumPositiveEven = sumPositiveEven + num;
            }

            else{                            // odd number
                sumPositiveOdd =sumPositiveOdd + num;
            }

        }

        System.out.println(" sum of negative numbers = " +sumNegative);
        System.out.println(" sum of positive even numbers = " + sumPositiveEven);
        System.out.println(" sum of positive odd numbers = "+ sumPositiveOdd);
    }
}
