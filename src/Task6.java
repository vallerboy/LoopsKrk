import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int winnerNumber = 523;

        int userAnswer;
        do{
            System.out.print("Podaj liczbe: ");
            userAnswer = scanner.nextInt();

            if(userAnswer > winnerNumber){
                System.out.println("Celuj nizej");
            }else if(userAnswer < winnerNumber){
                System.out.println("Celuj wyzej");
            }
        }while (userAnswer != winnerNumber);
        System.out.println("Wygrales/as");
    }
}
