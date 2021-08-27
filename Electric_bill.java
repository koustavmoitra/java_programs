// CALCULATE ELECTRIC BILL ...
import java.util.Scanner;

public class Electric_bill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter the unit-");

        float unit = sc.nextFloat();
         if (unit == 0){
             System.out.println("you have no bill....");
         }
         else if (unit <= 50){
             float charge = unit * 3.50f;
             System.out.println("your bill is..." + charge);
         }
         else if (unit > 50 && unit <=150){
             float charge = unit * 4.50f;
             System.out.println("your bill is..." + charge);
         }
         else if (unit > 150 && unit <=300){
             float charge = unit * 6.0f;
             System.out.println("your bill is..." + charge);
         }

         else{
             System.out.println("electric kaam use kar....");
         }
    }
}
