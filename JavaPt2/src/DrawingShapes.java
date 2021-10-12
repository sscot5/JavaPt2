/**
 * Date: 9/24/21
 * UILID: sscot 17
 * Class: IT 168
*/

// imports
import java.util.Scanner;

/*
 * Description: A program that allows the user to draw a rectangle or A shape until they exit the program.
 * 
 * The program should not be breakable by the user and only exit when they enter 0.
 * INFO NEEDED:
 * 1 – draw a rectangle shape
 * 2 – draw an A shape
 * 0 - quit
 * 
 * ASCII value for numbers 0 - 9 == 48 - 57
 * 
 * @author: Stephanie Scott
 */

public class DrawingShapes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nWelcome to the drawing application!");

        // Validating
        boolean drawing = true;
        while (drawing) {
            System.out.println(
                    "\nPlease choose one of the following: \n1 – draw a rectangle shape \n2 – draw an A shape \nAt any point enter 0 to quit");
            System.out.print("\nEnter your choice: ");
            String input = scanner.nextLine();

            if (input.equals("0")) {
                drawing = false;
                continue;

            } else if (input.equals("1")) {
                boolean drawRect = true;

                while (drawRect) {
                    System.out.println("\nLets draw a rectangle!");
                    System.out.print("\nEnter the number of rows: ");
                    String rowsString = scanner.nextLine();
                    System.out.print("Enter the number of columns: ");
                    String columnsString = scanner.nextLine();
                    int rows;
                    int columns;

                    // validates the user provided an input and it is not larger than what an int
                    // can hold
                    if (rowsString.length() == 0 || rowsString.length() > 1000000) {
                        System.out.println("Please enter a value for both rows and columns.");
                        continue;
                    }

                    if (columnsString.length() == 0 || columnsString.length() > 1000000) {
                        System.out.println("Please enter a value for columns");
                        continue;
                    }

                    // validate rows as an int
                    boolean rowsIsAnInt = true;
                    for (int i = 0; i < rowsString.length(); i++) {
                        if ((int) rowsString.charAt(i) >= 48 && (int) rowsString.charAt(i) <= 57) {
                            continue;
                        }
                        rowsIsAnInt = false;
                        break;
                    }

                    // validate columns as an int
                    boolean columnsIsAnInt = true;
                    for (int i = 0; i < columnsString.length(); i++) {
                        if ((int) columnsString.charAt(i) >= 48 && (int) columnsString.charAt(i) <= 57) {
                            continue;
                        }
                        columnsIsAnInt = false;
                        break;
                    }

                    // converting the input from a string to an integer and validating that they did
                    // not enter 0 to quit
                    if (rowsIsAnInt && columnsIsAnInt) {
                        rows = Integer.parseInt(rowsString);
                        columns = Integer.parseInt(columnsString);
                        if (rows == 0 || columns == 0) {
                            drawRect = false;
                            drawing = false;
                            continue;
                        }
                    } else {
                        System.out.println("Error: invalid input.");
                        continue;
                    }

                    // validate a character was entered
                    String character = "";
                    while (character.length() == 0) {
                        System.out.print("Enter a character for the rectangle: ");
                        character = scanner.nextLine();
                    }

                    // how to handle inputs like space so it doesn't print a blank rectangle
                    // the ascII value 33 to 126 are printable characters
                    if (character.charAt(0) < 33 || character.charAt(0) > 126) {
                        System.out.println("\nCharacter input was invalid. Changing to default character.");
                        character = "-";
                    } else if (character.charAt(0) == 48) {
                        drawRect = false;
                        drawing = false;
                        continue;
                    }

                    // drawing the rectangle
                    for (int i = 0; i < rows; i++) {
                        for (int j = 0; j < columns; j++) {
                            System.out.print(character.charAt(0));
                        }
                        System.out.println();
                    }
                    drawRect = false;
                }

            } else if (input.equals("2")) {
                boolean drawA = true;

                while (drawA) {
                    // get input
                    System.out.println("Let's draw an A!");
                    System.out.print("\nEnter an odd number between 11 and 23 to determine the size of A: ");
                    String widthString = scanner.nextLine();
                    int width;

                    // validates the user provided an input and that input is only 2 characters long
                    // to fit the range of 11 - 23
                    if (widthString.length() != 2) {
                        System.out.println("Error: Invalid input");
                        continue;
                    }

                    // validate input as an int
                    boolean widthIsAnInt = true;
                    for (int i = 0; i < widthString.length(); i++) {
                        if ((int) widthString.charAt(i) >= 48 && (int) widthString.charAt(i) <= 57) {
                            continue;
                        }
                        widthIsAnInt = false;
                        break;
                    }

                    // converting the input from a string to an integer
                    // validating that user did not enter 0 to quit
                    if (widthIsAnInt) {
                        width = Integer.parseInt(widthString);
                        if (width == 0) {
                            drawA = false;
                            drawing = false;
                            continue;
                        }
                    } else {
                        System.out.println("Error: " + widthString + " is an invalid input.");
                        continue;
                    }

                    // once input is an int -- make sure it is an odd integar between 11 and 23
                    if (width % 2 == 0 || width < 11 || width > 23) {
                        System.out.println("Error: " + width + " is an invalid input");
                        continue;
                    }

                    // draw A
                    int height = (width + 1) / 2;
                    int midLine = (height + 1) / 2;
                    String charPrint = "A";
                    String fillPrint = " ";

                    for (int row = 0; row < height; row++) {
                        for (int spaces = 0; spaces < height - row - 1; spaces++) {
                            System.out.print(fillPrint);
                        }
                        System.out.print(charPrint);
                        if (row > 0) {
                            String a;
                            if (row == midLine) {
                                a = charPrint;
                            } else {
                                a = fillPrint;
                            }
                            int fill = row * 2 - 1;
                            for (int i = 0; i < fill; i++) {
                                System.out.print(a);
                            }
                            System.out.print(charPrint);
                        }
                        System.out.println();
                    }
                    drawA = false;
                }

            } else {
                System.out.println(input + " is invalid.");
                continue;
            }
        }
        scanner.close();
        System.out.println("You entered a 0. Exiting program. Goodbye!");
    }
}