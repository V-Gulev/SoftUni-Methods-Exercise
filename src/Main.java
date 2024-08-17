import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = Integer.parseInt(scanner.nextLine());
        String operator = scanner.nextLine();
        int num2 = Integer.parseInt(scanner.nextLine());
        System.out.println(Calculator(num1,operator,num2));
    }

    public static int Calculator(int num1,String operator,int num2) {

        return switch (operator) {
            case "/" -> num1 / num2;
            case "*" -> num1 * num2;
            case "+" -> num1 + num2;
            case "-" -> num1 - num2;
            default -> 0;
        };
    }

}





