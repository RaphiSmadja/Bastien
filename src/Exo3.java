import java.util.Scanner;

public class Exo3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nb = scanner.nextInt();
        for (int i = nb - 1; i > 0; i--) {
            nb = nb * i;
        }
        System.out.println(nb);
    }
    // 5! = 5 * 4 * 3 * 2 * 1
}
