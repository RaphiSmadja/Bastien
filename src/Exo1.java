import java.util.Scanner;

public class Exo1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nbUser = scanner.nextInt();
        if (nbUser % 2 == 0) {
            System.out.println("Pair");
        } else {
            System.out.println("Impair");
        }
    }
}
