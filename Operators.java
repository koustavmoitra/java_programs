import java.util.Scanner;

public class Operators {

    public static void main(String[] args) {

        System.out.println("enter two numbers-");

        Scanner input = new Scanner(System.in);
        float num1 = input.nextFloat();
        float num2 = input.nextFloat();

        System.out.println("enter + operator :");
        char op = input.next().charAt(0);

        if ( op == '+') {
            float result = num1 + num2;
            System.out.println(result);
        }

    }
}
