package Control_FlowStatement;

public class test_hasSharedDigitWith2Para {
    public static void main(String[] args) {
        System.out.println(hasSharedDigit(35,13));
    }
    public static boolean hasSharedDigit(int a, int b) {

        if (a > 99 || a < 10 || b > 99 || b < 10) {
            return false;
        } else {
            int lastDigit_a = a%10;
            int lastDigit_b = b%10;
            int fristDigit_a = a/10;
            int fristDigit_b= b/10;

            if (lastDigit_a == lastDigit_b || fristDigit_a==fristDigit_b || lastDigit_a==fristDigit_b ||fristDigit_a==lastDigit_b) {
                return true;

            }



        }

        return false;
    }
}
