import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {

        //  { 12345 = sum of digits = 1+2+3+4+5 = 15 }

        Scanner sc = new Scanner(System.in);

        System.out.println("enter the digit u want the sum of ...");
        int num = sc.nextInt();
        int digits, sum = 0;

        while( num > 0){
            digits = num % 10;
            sum  = sum + digits;
            num = num / 10;

        }
        System.out.println(" sum of all digits = " + sum);
    }
}
