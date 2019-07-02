import java.util.Scanner;

public class Oceniator {
    public static void main(String[] args) {
        System.out.println("Podaj maksymalną możliwą ilość punktów do uzyskania: ");
        double max = new Scanner(System.in).nextDouble();
        System.out.println("Podaj ilość punktów, którą uzyskał dany uczeń: ");
        double punkty = new Scanner(System.in).nextDouble();
        double procent = punkty / max;
        if (procent >= 0.9) {
            System.out.println("Uczeń dostaje ocenę 5");
        } else if (procent >= 0.7) {
            System.out.println("Uczeń dostaje ocenę 4");
        } else if (procent > 0.5) {
            System.out.println("Uczeń dostaje ocenę 3");
        } else  {
            System.out.println("Uczeń dostaje ocenę 2");
        }

    }
}