import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String char1 = scanner.next();
        String char2 = scanner.next();
        PrintCharactersInRange(char1, char2);
    }

    public static void PrintCharactersInRange(String char1, String char2) {
        char start = char1.charAt(0);
        char end = char2.charAt(0);
        if ((int) start > (int) end){
            char temp = start;
            start=end;
            end=temp;
        }
        for (int i = (int) start + 1; i < (int) end ; i++) {
            System.out.print((char) i + " ");
        }
    }

}





