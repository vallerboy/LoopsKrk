import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        int sum = 1;

        for (int i = 1; i < number; i++) {
            sum = sum * i;
        }

        System.out.println(sum);
    }
}
