/*
 * Author: Stephanie Scott
 * Date: 9/30/21
 */

import java.util.Scanner;

/**
 * Description: A program that prints a right aligned triangle based on a size
 * from the user.
 * 
 * must be between 3 - 40 --> this determines the base of the triangle char for
 * triangle '*' input from user must be validated
 * 
 */

public class L7_PrintTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // validating
        boolean drawing = true;
        while (drawing) {
            System.out.print("Enter a number between 3 and 40 to determine the size of the triangle: ");
            String input = scanner.nextLine();
            int baseNum;

            // validate user provided an input
            if (input.length() == 0) {
                System.out.println("Error: invalid input");
                continue;
            }

            // validate input as an int
            boolean inputIsAnInt = true;
            for (int i = 0; i < input.length(); i++) {
                if ((int) input.charAt(i) >= 48 && (int) input.charAt(i) <= 57) {
                    continue;
                }
                inputIsAnInt = false;
                break;
            }

            // converting input from a string to an integer
            if (inputIsAnInt) {
                baseNum = Integer.parseInt(input);
            } else {
                System.out.println("Error: " + input + " is an invalid input");
                continue;
            }

            // once input is an int validate it is between 3 - 40
            if (baseNum < 3 || baseNum > 40) {
                System.out.println("Error: " + baseNum + " is an invalid input");
                continue;
            }

            // draw triangle
            for (int row = 0; row < baseNum; row++) {
                for (int column = 0; column <= row; column++) {
                    System.out.print("* ");
                }
                System.out.println();
            }

            drawing = false;
        }
        scanner.close();
    }
}
