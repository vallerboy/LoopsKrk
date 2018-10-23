import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //<typ zmiennej> <nazwa_zmiennej> = <wartosc>;
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Odczytaj cos: ");
//
//        int value = scanner.nextInt();
//
//        System.out.println(value);

        String name1 = "Oskar" + " Polak";
        //==
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Oskar");
        stringBuilder.append(" ");
        stringBuilder.append("Polak");



        long start = System.currentTimeMillis();
        StringBuilder startString = new StringBuilder();
        for (int i = 0; i < 1000000; i++) {
            startString.append(i);
        }
        long stop = System.currentTimeMillis();
        System.out.println(stop - start);
    }
}
