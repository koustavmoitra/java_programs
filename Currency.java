import java.util.Scanner;

public class Currency {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter rupee you want to convert..");
        float rupee = sc.nextFloat();

        float dollars = (float) (rupee/74.30); // current dollar rate

        System.out.println(rupee + " rupee = " + dollars + " dollars");

    }
}
