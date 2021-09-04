import java.util.Scanner;

public class GoKunal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println(" enter which day is it (august 1 - august 31) ???? ");
        int date = sc.nextInt();

        if(date % 2 == 0) {
            System.out.println(" mubarak ho kunal u can go....");
        }
        else
        {
            System.out.println(" sorry kunal u can't go.....");
        }
    }
}
