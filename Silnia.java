import java.util.Scanner;

public class Silnia {
    public static void main(String[] args) {
        System.out.println("Podaj dowolną liczbę większą od zera: ");
        int x = new Scanner(System.in).nextInt();
        int silnia = 1;
        int a = 1;
        if (x > 0) {
            while (a <= x) {
                silnia *= a;
                a++;
            }
            System.out.println("Silnia całego powstałego zbioru wynosi: " + silnia);
        } else {
            System.out.println("Liczba miała być większa od zera...");
        }

    }
}
