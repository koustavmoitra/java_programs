import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {

        System.out.println("enter 2 numbers :-");

        Scanner input = new Scanner(System.in);
        float num1 = input.nextFloat();
        float num2 = input.nextFloat();

        if (num1 > num2)
        {
            System.out.println( num1 + " is greater..." );
        }
        else
        {
            System.out.println(num2 + "is smaller....");
        }

    }
}
