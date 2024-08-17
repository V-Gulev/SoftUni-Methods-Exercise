import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();
        if (PasswordLengthValidator(password) && PasswordDigitValidator(password) && PasswordSymbolsValidator(password)){
            System.out.println("Password is valid");
        }else {
            if (!PasswordLengthValidator(password)){
                System.out.println("Password must be between 6 and 10 characters");
            }
            if (!PasswordSymbolsValidator(password)){
                System.out.println("Password must consist only of letters and digits");
            }
            if (!PasswordDigitValidator(password)){
                System.out.println("Password must have at least 2 digits");
            }
        }


    }

    public static boolean PasswordLengthValidator(String password) {
        return password.length() >= 6 && password.length() <= 10;
    }
    public static boolean PasswordDigitValidator(String password) {
        boolean validPassword = true;
        int digitCounter = 0;
        for (int i = 0; i < password.length(); i++) {
            if (Character.isDigit(password.charAt(i))){
                digitCounter++;
            }
        }
        if (digitCounter < 2){
            validPassword = false;
        }
        return validPassword;
    }

    public static boolean PasswordSymbolsValidator(String password) {
        boolean validPassword = true;
        for (int i = 0; i < password.length(); i++) {
            if (!Character.isDigit(password.charAt(i)) && !Character.isAlphabetic(password.charAt(i))){
                validPassword = false;
            }
        }
        return validPassword;
    }

}





