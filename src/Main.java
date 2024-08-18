import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        PrintMiddleChar(input);
    }

    public static void PrintMiddleChar(String input) {
        if (input.length() % 2 == 0){
            System.out.print(input.charAt(input.length()/2-1));
            System.out.print(input.charAt(input.length()/2));
        }else System.out.println(input.charAt((int) Math.floor(input.length()/2)));
    }


}





