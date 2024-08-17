import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = Integer.parseInt(scanner.nextLine());
        int number = Math.abs(input);
        int[] array = SplittingNumber(number);
        PrintMultipliedDifference(array);
    }

    public static int[] SplittingNumber(int number) {
        String numberString = Integer.toString(number);
        int[] digits = new int[numberString.length()];
        for (int i = 0; i < numberString.length(); i++) {
            digits[i] = Character.getNumericValue(numberString.charAt(i));
        }
        return digits;
    }

    public static void PrintMultipliedDifference(int[] array) {
        int evenSum = 0;
        int oddSum = 0;

        for (int j : array) {
            if (j % 2 == 0) {
                evenSum += j;
            } else oddSum += j;
        }

        System.out.println(evenSum*oddSum);
    }

}





