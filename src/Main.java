import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        TribonacciSequence(num);
    }

    public static void TribonacciSequence(int end) {
        int[] array = new int[end];
        if (array.length < 2) {
            array[0] = 1;
        } else if (array.length < 3) {
            array[0] = 1;
            array[1] = 1;
        }else {
            array[0] = 1;
            array[1] = 1;
            array[2] = 2;
        }

        for (int i = 0; i < end; i++) {
            if (i == 0) {
                System.out.print(array[i] + " ");
            } else if (i == 1) {
                System.out.print(array[i] + " ");
            } else if (i == 2) {
                System.out.print(array[i] + " ");
            } else {
                array[i] = array[i - 1] + array[i - 2] + array[i - 3];
                System.out.print(array[i] + " ");
            }

        }
    }
}
