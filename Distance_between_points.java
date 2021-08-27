// Calculate Distance Between Two Points....

import java.util.Scanner;

public class Distance_between_points {
    public static void main(String[] args) {

        // distance between two points = { square-root of (x2-x1)square + (y2-y1)square }

        Scanner input = new Scanner(System.in);

        System.out.println("enter x1 and y1");
        int x1 = input.nextInt();
        int y1 = input.nextInt();


        System.out.println("enter x2 and y2");
        int x2 = input.nextInt();
        int y2 = input.nextInt();

        float distance = (float) Math.sqrt( (x2-x1)*(x2-x1) + (y2-y1)*(y2-y1) );
        System.out.println("distance between two points =" + distance);


    }
}
