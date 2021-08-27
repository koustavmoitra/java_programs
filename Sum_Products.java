import java.util.Scanner;

public class Sum_Products {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter how many numbers of sum and product you want to calculate...");
        int i, product = 1,sum =0;
        int limit = sc.nextInt();

         for ( i = 0; i<limit; i++) {
             System.out.println(" now enter the numbers- ");
             int numbers = sc.nextInt();
             sum += numbers;
             product *= numbers;

         }
        System.out.println("total sum = " + sum);
        System.out.println("total product = " + product);

        int result = product - sum;
        System.out.println("the difference between the product of its digits and the sum of its digits " + result);

        }


    }
