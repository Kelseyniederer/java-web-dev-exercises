package exercises;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListPractice {
    public static void main (String[] args){
        int[] someInts = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        ArrayList <Integer> numList = new ArrayList<Integer>();
        int score = 0;
        for (int i : someInts) {
            if (i % 2 == 0) {
                score += i;
            }
        }
            System.out.println((score));







    }
}
