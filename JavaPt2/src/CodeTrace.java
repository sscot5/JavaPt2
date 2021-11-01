public class CodeTrace {
    public static void main(String[] args) {

        int num = 0;
        int multThree = 0;
        int multFive = 0;
        int whoKnows = 0;

        while (num >= 0) {
            if (num % 3 == 0) {
                multThree++;
            } else if (num % 5 == 0) {
                multFive++;
            } else {
                whoKnows++;
            }
            num--;
        }
        System.out.println(multThree);
        System.out.println(multFive);
        System.out.println(whoKnows);
    }
}
