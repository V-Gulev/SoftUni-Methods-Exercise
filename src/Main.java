import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        int num3 = Integer.parseInt(scanner.nextLine());
        PrintSmallestNumber(num1, num2, num3);
    }

    public static void PrintSmallestNumber(int num1, int num2, int num3) {
        int smallestNumber = num1;
        if (smallestNumber > num2) {
            smallestNumber = num2;
        }
        if (smallestNumber > num3) {
            smallestNumber = num3;
        }
        System.out.println(smallestNumber);
    }

}





