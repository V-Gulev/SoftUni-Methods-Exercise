import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String action = scanner.nextLine();
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());

        switch (action) {
            case "add":
                AddNumbers(a, b);
                break;
            case "divide":
                DivideNumbers(a,b);
                break;
            case "subtract":
                SubtractNumbers(a,b);
                break;
            case "multiply":
                MultiplyNumbers(a,b);
                break;
        }

    }

    public static void AddNumbers(int a, int b) {
        System.out.println(a + b);
    }

    public static void DivideNumbers(int a, int b) {
        System.out.println(a / b);
    }

    public static void SubtractNumbers(int a, int b) {
        System.out.println(a - b);
    }

    public static void MultiplyNumbers(int a, int b) {
        System.out.println(a * b);
    }
}
