import java.util.Scanner;

// odd or even.......
public class OddOrEven
{
    public static void main(String[] args) {

        System.out.println(" enter a number..");

        Scanner sc = new Scanner(System.in);
        int check = sc.nextInt();

        if ( check % 2 == 0)
            System.out.println("this is even...");

        else
            System.out.println("this is odd....");
    }
}
