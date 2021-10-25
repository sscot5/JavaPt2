import java.util.Scanner;

public class L11_FillArray {
    public static void main(String[] args) {
        int[] array1 = { 4, 10, 15, 12, 8, 20, 100, 25, 32, 7, 28, 48 };
        method(array1, 12, 1);
    }

    public static int[] fillArray(int[] arr) {
        arr = new int[100];
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a value or -999 to stop: ");
        int input = scanner.nextInt();
        int i = 0;
        while (input != -999 && i < arr.length) {
            arr[i] = input;
            i++;
            System.out.print("Enter value or -999 to stop: ");
            input = scanner.nextInt();
        }

        scanner.close();
        return arr;
    }

    public static int method(int[] array, int numOfMultiples, int factor) {
        for (int num : array) {
            if (num % factor == 0) {
                numOfMultiples += 1;
            }
        }

        System.out.println(numOfMultiples);
        return numOfMultiples;
    }

}
