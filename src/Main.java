import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String dataType = scanner.nextLine();
        switch (dataType) {
            case "int":
                int int1 = Integer.parseInt(scanner.nextLine());
                System.out.println(int1 * 2);
                break;
            case "real":
                double double1 = Double.parseDouble(scanner.nextLine()) * 1.50;
                System.out.printf("%.2f", double1);
                break;
            case "string":
                String input = scanner.nextLine();
                System.out.println('$' + input + '$');
                break;

        }
    }
}






