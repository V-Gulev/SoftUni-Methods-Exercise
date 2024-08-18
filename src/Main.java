import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        int num3 = Integer.parseInt(scanner.nextLine());
        PrintMultiplicationSign(num1,num2,num3);
    }

    public static void PrintMultiplicationSign(int num1, int num2, int num3) {
        int negativeNumbersCounter = 0;
        if (num2 < 0) {
            negativeNumbersCounter++;
        }
        if (num1 < 0) {
            negativeNumbersCounter++;
        }
        if (num3 < 0) {
            negativeNumbersCounter++;
        }

        if (num2 == 0 || num1 == 0 || num3 == 0) {
            System.out.println("zero");
        } else if (negativeNumbersCounter == 1 || negativeNumbersCounter == 3) {
            System.out.println("negative");
        }else System.out.println("positive");
    }
}
