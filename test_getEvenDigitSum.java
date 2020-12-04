package Control_FlowStatement;

public class test_getEvenDigitSum {
    public static void main(String[] args) {
        getEvenDigitSum(1244);
    }
    public static int getEvenDigitSum(int number){

        int evenDigitSum = 0;
        int lastDigit = 0;
        if(number<0){
            return -1;
        }
        while (number>0){
            lastDigit=number%10;
            if(lastDigit%2==0) {
                System.out.println("lastDigit" + lastDigit);

                evenDigitSum += lastDigit;
                System.out.println("evenSum" + evenDigitSum);
            }
            number/=10;
        }


        return evenDigitSum;
    }
}
