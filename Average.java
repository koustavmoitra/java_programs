// Calculate Average Of N Numbers...

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int sum =0 ;
        System.out.println("how many numbers of average do u want ?...");

        int number = sc.nextInt();
        System.out.println("enter the numbers..");
        for (int i=1 ; i<= number ; i++ ){

            int num = sc.nextInt();
            sum = sum + num;

        }
        int average = sum / number;
        System.out.println("sum = " + sum);
        System.out.println("average of total is" + average);


    }
}
