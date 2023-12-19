import java.util.Scanner;

public class Exo8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nb = scanner.nextInt();
        for (int i = 0; i < 11; i++) {
            System.out.println(nb + " * " + i + " = " + i * nb);
        }
        char character = 'a';
    }
}
