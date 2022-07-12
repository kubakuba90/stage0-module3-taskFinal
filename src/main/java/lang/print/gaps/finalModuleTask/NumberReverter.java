package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public static void revert(int number) {
        String strNumber = String.valueOf(number);

        char[] digits = strNumber.toCharArray();
        int sum = 0;


        for (int i= digits.length-1; i >= 0; i--) {
            System.out.print(digits[i]);
        }
        System.out.println();
    }


}
