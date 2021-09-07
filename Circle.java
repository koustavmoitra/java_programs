package Practiceset2.com;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {

        // Write a program to print the circumference and area of a circle of radius entered by user by defining your own method.

        Scanner in = new Scanner(System.in);
        System.out.println("enter radius of a circle..");
        float radius = in.nextFloat();

        System.out.println("circumference of circle =  " + circumference(radius));
        System.out.println("circumference of circle =  " + area(radius));
    }

    static float circumference(float radius){
        // c = (2 * pi * r)

        float c = (float) (2 * Math.PI * radius);
        return c;
    }

    static float area(float radius){
        // area = (pi * r * r)

        float a = (float) (Math.PI * radius * radius);
        return a;

    }
}
