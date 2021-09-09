package Practiceset2.com;

import java.util.Scanner;

public class Pythagorean_triplet_method {
    public static void main(String[] args) {

        // pythagorean triplet = a(square) + b(square) = c(square)
        // a^2 + b^2 = c^2 ?

        Scanner in = new Scanner(System.in);
        System.out.println("enter three sides to check pythagorean triplet :-");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        pytha(a, b, c);


    }

    static void pytha(int a, int b, int c) {

        int max = a;
        if (b > a) {
            max = b;
        }
        if (c > a) {
            max = c;
        }

        if (max == a) {
            boolean flag = ((b * b + c * c) == (a * a));
            System.out.println(flag);
        } else if (max == b) {
            boolean flag = ((a * a + c * c) == (b * b));
            System.out.println(flag);
        } else {
            boolean flag = ((a * a + b * b) == (c * c));
            System.out.println(flag);
        }


//        if(max == a){
//            System.out.println( b*b + "+" + c*c + " = " + a*a);
//        }
//        else if(max == b){
//            System.out.println( a*a + "+" + c*c + " = " + b*b);
//        }
//        else{
//            System.out.println( a*a + "+" + b*b + " = " + c*c);
//            }


    }
}
