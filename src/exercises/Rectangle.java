package exercises;

import java.util.Scanner;
public class Rectangle {
    public static void main(String[] args){
        double length;
        double width;
        double area;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of the rectangle in inches: ");
        length = input.nextDouble();
        System.out.println("Enter the width of the rectangle in inches: ");
        width = input.nextDouble();

        area = length * width;
        System.out.println("The area of the rectangle is " + area + " inches squared");
    }
}
