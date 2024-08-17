import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String product = scanner.nextLine();
        int amount = Integer.parseInt(scanner.nextLine());

        PriceCalculator(product,amount);

    }

    public static void PriceCalculator(String product, int amount) {
        double total;
        switch (product){
            case "water":
                total=amount*1.00;
                System.out.printf("%.2f",total);
                break;
            case "coffee":
                total=amount*1.50;
                System.out.printf("%.2f",total);
                break;
            case "coke":
                total=amount*1.40;
                System.out.printf("%.2f",total);
                break;
            case "snacks":
                total=amount*2.00;
                System.out.printf("%.2f",total);
                break;
        }
    }

}
