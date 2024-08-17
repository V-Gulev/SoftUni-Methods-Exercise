import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        PrintVowelsCount(input);
    }

    public static void PrintVowelsCount(String input) {
        String lowercaseInput = input.toLowerCase();
        int vowelCounter =0;
        for (int i = 0; i < lowercaseInput.length(); i++) {
            String letter = String.valueOf(lowercaseInput.charAt(i));
            if (letter.equals("a") || letter.equals("o") || letter.equals("u") || letter.equals("i") || letter.equals("e")){
                vowelCounter++;
            }
        }
        System.out.println(vowelCounter);
    }

}





