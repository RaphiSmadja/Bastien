import java.util.Scanner;

public class Exo6 {
    public static void main(String[] args) {
        // instancier son scanner
        Scanner scanner = new Scanner(System.in);

        System.out.println("Saisir une température : ");
        float degre = scanner.nextFloat();
        float faren = (degre * 9 / 5) + 32;
        System.out.println(faren);
    }
}
