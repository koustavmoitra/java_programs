import java.util.Scanner;

public class Hcf {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter 1st num");
        int num1 = sc.nextInt();

        System.out.println("enter 2nd num");
        int num2 = sc.nextInt();

        int temp;
        while(num2 > 0){
            temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }
        System.out.println("hcf = "+ num1);
    }
}
