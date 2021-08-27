import java.util.Scanner;

public class Discount {
    public static void main(String[] args) {

        // discount = list price * discount rate.......

        Scanner input = new Scanner(System.in);
        System.out.println("enter the price of the product..");
        float price = input.nextFloat();
        System.out.println("enter the discount on the product..");
        float discount_rate = input.nextFloat();

        float discount = price * discount_rate;
        float total = price - discount;
        System.out.println("you discount is = " + discount+"RS");
        System.out.println("you final price  = " + total+"RS");

    }
}
