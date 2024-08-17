import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String type = scanner.nextLine();

        switch (type){
            case "int":
                int num1 = Integer.parseInt(scanner.nextLine());
                int num2 = Integer.parseInt(scanner.nextLine());
                System.out.println(GetMax(num1,num2));
                break;
            case "char":
                char firstChar = scanner.nextLine().charAt(0);
                char secondChar = scanner.nextLine().charAt(0);
                System.out.println(GetMax(firstChar,secondChar));
                break;
            case "string":
                String firstString = scanner.nextLine();
                String secondString =scanner.nextLine();
                System.out.println(GetMax(firstString,secondString));
                break;
        }


    }

    public static int GetMax(int num1, int num2) {
        return Math.max(num1, num2);
    }

    public static char GetMax(char first, char second) {
        if (first > second) {
            return first;
        }
        return second;
    }

    public static String GetMax(String first, String second) {
        if (first.compareTo(second)>=0) {
            return first;
        }
        return second;
    }




}
