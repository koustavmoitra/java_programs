import java.util.Scanner;

public class Cgpa {
    public static void main(String[] args) {
         float sub1 = 7, sub2 = 10, sub3 = 5;
         float T_gp = sub1 + sub2 + sub3;

         float cgpa = T_gp/3;


        System.out.println("your cgpa =" + Math.round(cgpa));
        System.out.println("% of cgpa" + Math.round(cgpa) + "= " + Math.round(cgpa*9.5) );

    }
}
