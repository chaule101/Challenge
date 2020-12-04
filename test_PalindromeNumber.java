package Control_FlowStatement;

public class test_PalindromeNumber {
    public static int reverse;
    public static int lastDigit;

    public static void main(String[] args) {
        System.out.println(isPalindrome(-11211));
    }

    public static boolean isPalindrome(int number) {
        reverse=0;
        int temp=number;
        if(number<0){
           number=number;
           return true;
        }
        while (number > 0) {
            lastDigit = number % 10;
            System.out.println("lastDigit" + lastDigit);

            reverse= (reverse*10)+lastDigit;
            System.out.println("reverse" + "\t"+reverse);

            number/=10;
        }
            if (reverse == temp) {
                return true;
            } else {
                return false;
            }
        }
    }

