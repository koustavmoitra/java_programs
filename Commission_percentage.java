import java.util.Scanner;

public class Commission_percentage {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        //  { commission % = commission / amount }

        System.out.println("enter the commission.. ");
        float commission = input.nextFloat();

        System.out.println("enter the amount ");
        float amount = input.nextFloat();

        float commission_percentage = (commission /amount);
        System.out.println(" commission % =" + commission_percentage);


    }
}
