/*
 * Author: Stephanie Scott
 * Date: 9/28/21
 */

import java.util.Scanner;

/**
 * Description: A program that takes test scores from students and determines
 * the max, min, and average of all test scores. Each exam score will be an
 * integer in the range 0 to 100 Input will end when the user enters -1 as the
 * input value
 * 
 * After all scores have been read display the number of students who took the
 * exam the minimum score the maximum score the average score (with decimal
 * point) the number of As
 */

public class L7_ExamScores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final String STOP = "-1";
        int numStudents = 0;
        int minScore = 100;
        int maxScore = 0;
        double averageScore = 0;
        int numOfAs = 0;
        int examScoreTotal = 0;

        // Validating
        boolean enteringScores = true;
        while (enteringScores) {
            System.out.print("Enter exam score: ");
            String examScoreString = scanner.nextLine();
            int examScore;

            if (examScoreString.equals(STOP)) {
                enteringScores = false;
                continue;
            }

            // validate user provided an input
            if (examScoreString.length() == 0) {
                System.out.println("Please enter an exam score.");
                continue;
            }
            // validate examScores as an int
            boolean examScoresIsAnInt = true;
            for (int i = 0; i < examScoreString.length(); i++) {
                if ((int) examScoreString.charAt(i) >= 48 && (int) examScoreString.charAt(i) <= 57) {
                    continue;
                }
                examScoresIsAnInt = false;
                break;
            }

            // converting the input from a string to an integer
            if (examScoresIsAnInt) {
                examScore = Integer.parseInt(examScoreString);
            } else {
                System.out.println("Error: " + examScoreString + " is an invalid input.");
                continue;
            }

            // once input is an int -- make sure it is between 0 and 100
            if (examScore < 0 || examScore > 100) {
                System.out.println("Error: " + examScore + " is an invalid input");
                continue;
            }

            // calculate number of students
            numStudents = numStudents + 1;

            // calculate exam score totals
            examScoreTotal = examScoreTotal + examScore;

            // calculate minimum score
            if (examScore < minScore) {
                minScore = examScore;
            }

            // calculate maximum score
            if (examScore > maxScore) {
                maxScore = examScore;
            }

            // calculate number of As
            if (examScore >= 90) {
                numOfAs = numOfAs + 1;
            }
        }
        scanner.close();

        // calculate average
        averageScore = (double) examScoreTotal / numStudents;

        System.out.println("The number of students is " + numStudents);
        System.out.println("The minimum score is " + minScore);
        System.out.println("The maximum score is " + maxScore);
        System.out.println("The average score is " + averageScore);
        System.out.println("The number of students that received an A is " + numOfAs);

    }
}