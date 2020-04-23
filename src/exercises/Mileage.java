package exercises;

import java.util.Scanner;

public class Mileage {
    public static void main(String[] args) {
        int miles;
        int mileage;
        int gasUsed;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of miles driven: ");
        miles = input.nextInt();
        System.out.println("Enter gallons of gas consumed: ");
        gasUsed = input.nextInt();
        input.close();

        mileage = miles/gasUsed;
        System.out.println("miles-per-gallon: " + mileage);
    }
}
