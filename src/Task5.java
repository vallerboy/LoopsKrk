import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userAnswer = scanner.nextInt();

        int sum = 0;
        for (int i = 0; i <= userAnswer; i++) {
            sum += i;
        }

        System.out.println(sum);
    }
}
