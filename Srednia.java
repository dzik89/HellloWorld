import java.util.InputMismatchException;
import java.util.Scanner;

public class Srednia {
    public static void main(String[] args) {
        double a;
        System.out.println("Podaj pierwszą liczbę: ");
        a = new Scanner(System.in).nextDouble();
        System.out.println("Podaj drugą liczbę: ");
        double b;
        b = new Scanner(System.in).nextDouble();
        System.out.println("Podaj trzecią liczbę: ");
        double c;
        c = new Scanner(System.in).nextDouble();
        double srednia;
        srednia = (a + b + c) / 3;
        System.out.println("Średnia: " + srednia);
    }
}