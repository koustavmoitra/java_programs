import java.util.Scanner;

public class Sum_of_n {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int i , z, num , sum = 0;
        System.out.println("enter how many numbers you want..");
        num = sc.nextInt();
        System.out.println("enter numbers.");
        for (i=0; i<num ; i++){

             z = sc.nextInt();
            sum = sum+z;
        }
        System.out.println(sum);

    }
}
