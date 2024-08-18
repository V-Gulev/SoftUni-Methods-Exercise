import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        int num3 = Integer.parseInt(scanner.nextLine());
        System.out.println(SubtractTheThirdNumber(SumOfTheFirstTwoInts(num1,num2),num3));
    }

    public static int SumOfTheFirstTwoInts(int num1, int num2) {
        return num1 + num2;
    }

    public static int SubtractTheThirdNumber(int result, int num3) {
        return result - num3;
    }


}





