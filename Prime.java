
// PRIME NUMBER OR NOT.....

import java.util.Scanner;

public class Prime {

    public static void main(String[] args) {

        System.out.println("please enter a number....");

        Scanner input = new Scanner(System.in);
        int primeNo = input.nextInt();

        boolean flag = false;
        for (int i = 2; i <= primeNo / 2; ++i) {

            // condition for non prime number

            if (primeNo % i == 0) {
                flag = true;
                break;
            }
        }

        if (!flag)
            System.out.println(primeNo + " IS A PRIME NO....");
        else
            System.out.println(primeNo + " IS NOT A PRIME NO...");
    }
}

