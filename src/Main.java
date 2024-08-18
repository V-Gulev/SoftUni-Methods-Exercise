import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int end = Integer.parseInt(scanner.nextLine());
        PrintTopNumbers(end);
    }

    public static void PrintTopNumbers(int end) {
        int sumOfDigits = 0;
        int oddDigitsCounter = 0;

        for (int i = 0; i <= end; i++) {

            int number = i;
            while (number > 0) {
                int lastDigit = number % 10;
                number /= 10;
                sumOfDigits += lastDigit;
                if (lastDigit % 2 != 0) {
                    oddDigitsCounter++;
                }

            }

            if (oddDigitsCounter > 0 && sumOfDigits % 8 == 0) {
                System.out.println(i);
            }

            sumOfDigits = 0;
            oddDigitsCounter = 0;

        }

    }

}








