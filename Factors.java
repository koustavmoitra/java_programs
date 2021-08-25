import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("enter the number you want a factorial:--");
        int num = input.nextInt();

        // loop runs from 1 to 60
        for (int i = 1; i <= num; i++) {

            // if number is divided by i
            // i is the factor
            if (num % i == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
