import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        int times = Integer.parseInt(scanner.nextLine());

        PrintText(text,times);
    }

    public static void PrintText(String text, int times) {
        for (int i = 0; i < times; i++) {
            System.out.print(text);
        }
    }

}
