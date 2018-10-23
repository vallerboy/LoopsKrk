import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final String correctPassword = "Polska";

        String userAnswer;
        do{
            userAnswer = scanner.nextLine();
        }while (!correctPassword.equals(userAnswer));
    }
}
