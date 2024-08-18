import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        PalindromeNumbers();
    }

    public static void PalindromeNumbers() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            String input = sc.nextLine();
            if (input.equals("END")) {
                break;
            }
            String duplicate = "";
            for (int i = input.length() - 1; i >= 0; i--) {
                duplicate += Character.toString(input.charAt(i));
            }

            if (duplicate.equals(input)) {
                System.out.println("true");
            } else System.out.println("false");
        }

    }
}








