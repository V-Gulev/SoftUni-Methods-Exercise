import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        PrintDividedFactorials(num1, num2);
    }

    public static void PrintDividedFactorials(int num1, int num2) {
        double fact1 = 1;
        double fact2 = 1;
        double divided;
        for (int i = 1; i <= num1; i++) {
            fact1 *= i;
        }
        for (int i = 1; i <= num2; i++) {
            fact2 *= i;
        }
        divided = fact1 / fact2;
        System.out.printf("%.2f", divided);


    }
}








