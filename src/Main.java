import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int y1 = Integer.parseInt(scanner.nextLine());
        int x1 = Integer.parseInt(scanner.nextLine());
        int y2 = Integer.parseInt(scanner.nextLine());
        int x2 = Integer.parseInt(scanner.nextLine());
        int y3 = Integer.parseInt(scanner.nextLine());
        int x3 = Integer.parseInt(scanner.nextLine());
        int y4 = Integer.parseInt(scanner.nextLine());
        int x4 = Integer.parseInt(scanner.nextLine());
        PrintTheClosestPoint(y1, x1, y2, x2, y3, x3, y4, x4);
    }

    public static void PrintTheClosestPoint(int y1, int x1, int y2, int x2, int y3, int x3, int y4, int x4) {
        double length1 = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        double length2 = Math.sqrt(Math.pow(x4 - x3, 2) + Math.pow(y4 - y3, 2));
        if (length1 >= length2) {
            double sum1 =  Math.sqrt(Math.pow(x1, 2) + Math.pow(y1, 2));
            double sum2 =  Math.sqrt(Math.pow(x2, 2) + Math.pow(y2, 2));
            if (sum1 < sum2) {
                System.out.printf("(%d, %d)(%d, %d)", y1, x1, y2, x2);
            } else System.out.printf("(%d, %d)(%d, %d)", y2, x2, y1, x1);
        } else {
            double sum1 =  Math.sqrt(Math.pow(x3, 2) + Math.pow(y3, 2));
            double sum2 =  Math.sqrt(Math.pow(x4, 2) + Math.pow(y4, 2));
            if (sum1 < sum2) {
                System.out.printf("(%d, %d)(%d, %d)", y3, x3, y4, x4);
            } else System.out.printf("(%d, %d)(%d, %d)", y4, x4, y3, x3);
        }
    }
}
