import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean drawing = true;

        while (drawing) {
            System.out.println("enter a number between 3 - 40");
            int base = scanner.nextInt();
            if (base < 3 || base > 40) {
                System.out.println("Error");
                System.out.println("Enter a number between 3 - 40");
                base = scanner.nextInt();
            } else {
                drawing = false;
            }
        }
        System.out.println("Got it");
        scanner.close();
    }

}
