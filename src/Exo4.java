import java.util.Scanner;

public class Exo4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String mot = scanner.next(); // radar // 5
        String motReverse = "";
        for (int i = mot.length() - 1; i >= 0; i--) {
            char lettre = mot.charAt(i);
            motReverse += lettre;
        }
        System.out.println(motReverse);
        if (mot.equals(motReverse)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Ce n'est pas un Palindrome");
        }

    }
}
