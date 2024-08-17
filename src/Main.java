import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        int power = Integer.parseInt(scanner.nextLine());

        System.out.printf("%.0f",mathPower(number,power));

    }

    public static double mathPower(int number, int power) {
        double result = 1;
        if (power>1){
            result= Math.pow(number,power);
        }
        return result;
    }

}
