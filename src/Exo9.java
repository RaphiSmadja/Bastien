import java.util.Random;
import java.util.Scanner;

public class Exo9 {
    public static void main(String[] args) {
        Random random = new Random();
        int nbRandom = random.nextInt(1, 101);
        Scanner scanner = new Scanner(System.in);
        int nbr = 0;
        while (nbr != nbRandom) {
            nbr = scanner.nextInt();
            if (nbr < nbRandom) {
                System.out.println("+");
            } else if (nbr > nbRandom) {
                System.out.println("-");
            } else {
                System.out.println("Bravo");
            }
        }
        System.out.println(nbRandom);
    }
}
