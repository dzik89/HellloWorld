import java.util.Scanner;

public class ObliczanieFunkcji {
    public static void main(String[] args) {
        System.out.println("Podaj wartość a: ");
        double a = new Scanner(System.in).nextDouble();
        System.out.println("Podaj wartość b: ");
        double b = new Scanner(System.in).nextDouble();
        System.out.println("Podaj wartość c: ");
        double c = new Scanner(System.in).nextDouble();
        System.out.println("Podaj wartość x: ");
        double x = new Scanner(System.in).nextDouble();
        double funkcjaY = a * x * x + b * x + c;
        System.out.println("Wartość funkcji y: " + funkcjaY);
    }
}