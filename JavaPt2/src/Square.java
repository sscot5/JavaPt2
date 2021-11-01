public class Square {
    public static void main(String[] args) {
        drawSquare(5);
    }

    private static void drawSquare(int parameter) {
        for (int i = 0; i < parameter; i++) {
            for (int j = 0; j < parameter; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
