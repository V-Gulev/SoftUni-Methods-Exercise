import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int height = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());

        CalculateRectangleArea(height,width);
    }

    public static void CalculateRectangleArea(int height, int width) {
        System.out.println(height*width);
    }

}
