import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        PrintNxM(num);
    }

    public static void PrintNxM(int num) {
        for (int i = 0; i < num; i++) {
            for (int j = 1; j <= num; j++) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }


}





