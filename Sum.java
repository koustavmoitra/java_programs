import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println(" enter the numbers--");
        int num = input.nextInt();

        while ( input.nextInt() != 0) {

            int sum =+ num;

            if( input.nextInt() == 0)
            {
                break;
            }


            System.out.println("sum = " + sum);

        }

    }
}
