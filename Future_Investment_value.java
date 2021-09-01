import java.util.Scanner;

public class Future_Investment_value {

    public static void main(String[] args) {

        //  { fv = pv * ( 1 + i  ) to the power n }
       // { fv = future value , pv = present value , i = interest for investment , n = number of periods invested for }

        Scanner input = new Scanner(System.in);

        System.out.println("enter the amount you want to invest...");
        float pv = input.nextFloat();

        System.out.println("enter the interest rate...");
        float i = input.nextFloat();

        System.out.println("enter the time period...");
        float n = input.nextFloat();

        float fv = (float) (pv * Math.pow((1+i/100),n));
        System.out.println( "value =" + fv );

    }
}
