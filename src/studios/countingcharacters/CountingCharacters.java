package studios.countingcharacters;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountingCharacters {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String string = input.nextLine();
        countCharacters(string);
    }

    public static void countCharacters(String string)
    {
        char[] stringChars = string.toCharArray();
        HashMap<Character, Integer> charCountsMap = new HashMap<>();
            for (char letter: stringChars) {
                if (charCountsMap.containsKey(letter)){
                Integer count = charCountsMap.get(letter) + 1;
                charCountsMap.put(letter, count);
                } else if (Character.isLetter(letter)) {
                charCountsMap.put(letter, 1);
            }
         }

        for (Map.Entry<Character, Integer> entry: charCountsMap.entrySet()) {
            System.out.println("Count for: " + entry.getKey() + ": " + entry.getValue());
        }



    }
}
