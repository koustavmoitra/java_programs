import java.util.Scanner;

public class LeapYearOrNot {
    public static void main(String[] args) {

        // Check if the year is divisible by 4 but not 100, DISPLAY "leap year"
        // Check if the year is divisible by 400, DISPLAY "leap year"

        Scanner input = new Scanner(System.in);

        System.out.println("enter the year -");
        int year = input.nextInt();

        if ( (year % 4 ==0 && year % 100 != 0) || (year % 400 == 0) ){
            System.out.println(year + " leap year hai...");

        }

        else {
            System.out.println(year + " leap year nhi h ....");
        }


    }
}
