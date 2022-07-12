package lang.print.gaps.finalModuleTask;

public class DigitsSumCalculator {
    public static void calculateSum(int number) {

        String strNumber = String.valueOf(number);
        char[] digits = strNumber.toCharArray();
        int sum = 0;

        for (char dig :
                digits) {
            sum = sum + Character.getNumericValue(dig);
        }

        System.out.println(sum);
    }

//    public static void main(String[] args) {
//        calculateSum(1111);
//    }
}
