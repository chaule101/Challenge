package Control_FlowStatement;

public class test_sumFirstAndLastDigit {
    public static void main(String[] args) {
        sumFirstAndLastDigit(123);
    }
    public static int sumFirstAndLastDigit(int number){
        int firstDigit=0;
        int lastDigit=0;
        int sum = 0;
        if(number<0){
            return -1;
        }
        firstDigit=number;
        while (firstDigit>=10){
            firstDigit/=10;
        }
        lastDigit=number%10;
        sum=lastDigit+firstDigit;
        System.out.println(sum);
       return sum;
    }

}
