import java.util.Scanner;

public class ArrayTask1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int arrayLength = scanner.nextInt();
        int[] someArray = new int[arrayLength];

        for (int i = 0; i < arrayLength; i++) {
            someArray[i] = scanner.nextInt();
        }

        ///////////koniec wprowadzania danych///////////

        for (int i = someArray.length - 1; i >= 0; i--) {
            System.out.println(someArray[i]);
        }
    }
}
