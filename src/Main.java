import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int y1 = Integer.parseInt(scanner.nextLine());
        int x1 = Integer.parseInt(scanner.nextLine());
        int y2 = Integer.parseInt(scanner.nextLine());
        int x2 = Integer.parseInt(scanner.nextLine());
        PrintTheClosestPoint(y1, x1, y2, x2);
    }

    public static void PrintTheClosestPoint(int y1, int x1, int y2, int x2) {
        int sum1 = Math.abs(y1 + x1);
        int sum2 = Math.abs(y2 + x2);
        if (sum1 < sum2) {
            System.out.printf("(%d, %d)", y1, x1);
        } else System.out.printf("(%d, %d)", y2, x2);
    }
}






