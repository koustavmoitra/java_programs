// calculate si....
import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {

        System.out.println(" enter principle-");

        Scanner input1 = new Scanner(System.in);
        float principle = input1.nextFloat();

        System.out.println(" enter rate-");
        float rate = input1.nextFloat();

        System.out.println(" enter time-");
        int time = input1.nextInt();

        float SI = (principle * rate * time)/100;
        System.out.println("your simple interest is " +SI);
    }
}
