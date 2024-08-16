import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int end = Integer.parseInt(scanner.nextLine());

        PrintTriangle(end);

    }

    public static void PrintTriangle(int end) {
        for (int i = 0; i < end; i++) {
            for (int j = 1; j < i + 2; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        for (int i = end - 1; i > 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
