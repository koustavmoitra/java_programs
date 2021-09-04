import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {

        // A number whose sum of factors (excluding the number itself) is equal to the number is called a perfect number.
        // { 28 = 1+2+4+7+14 }

        Scanner input = new Scanner(System.in);

        System.out.println("enter a number...");
        int num = input.nextInt();

        int i = 1,sum = 0;
        while (i<=num/2){
            if ((num % i == 0)){
                sum = sum + i;
            }
            i++;
        }

        if (sum == num){
            System.out.println("perfect number =" + num);
        }
        else
        {
            System.out.println(" not a perfect number =" + num);
        }
    }
}
