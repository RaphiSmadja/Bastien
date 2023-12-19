import java.util.Scanner;

public class Exo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nb1 = scanner.nextInt();
        int nb2 = scanner.nextInt();
        int nb3 = scanner.nextInt();
        if (nb1 > nb2 && nb1 > nb3) {
            System.out.println(nb1 + " est le plus grand");
        } else if (nb2 > nb1 && nb2 > nb3) {
            System.out.println(nb2 + " est le plus grand");
        } else {
            System.out.println(nb3 + " est le plus grand");
        }
    }
}
