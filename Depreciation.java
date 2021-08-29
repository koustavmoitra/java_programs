import java.util.Scanner;

public class Depreciation {

    public static void main(String[] args) {
        // The value of any article or item subject to wear and tear, decreases with time. This decrease is called its Depreciation.
        // Given three variable V1, R and T where V1 is the initial value, R is the rate of depreciation and T is the time in years.
        // { v2 = v1 [ 1-r /100] power 't' }

        Scanner input = new Scanner(System.in);
        System.out.println(" enter initial value, rate of depreciation and time");
        float v1 = input.nextFloat();  //V1 is the initial value
        float R = input.nextFloat();  // R is the rate of depreciation
        float time = input.nextFloat();  // T is the time in years.

        float v2 = (float) (v1 * Math.pow(1 - (R / 100),time));

        System.out.println("initial value =" + v1);
        System.out.println("depreciation value = " +v2);





    }
}
