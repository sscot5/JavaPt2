import java.util.Scanner;

public class LetterCounts {
    public static void main(String[] args) {
        // int numLetters = 'z' - 'a' + 1;
        // System.out.println(numLetters);

        Scanner scanner = new Scanner(System.in);
        int[] letterCounts = new int[26];
        System.out.print("Enter string: ");
        String theString = scanner.nextLine().toLowerCase();

        for (int i = 0; i < theString.length(); i++) {
            char letter = theString.charAt(i);
            if (Character.isAlphabetic(letter)) {
                letterCounts[letter - 'a']++;
            }
        }

        for (int i = 0; i < letterCounts.length; i++) {
            if (letterCounts[i] > 0) {
                char curLetter = (char) (i + 'a');
                System.out.println("" + curLetter + "\t" + letterCounts[i]);
            }
        }

        scanner.close();
    }
}
