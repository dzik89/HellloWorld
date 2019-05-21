import java.util.Scanner;

public class KalkulatorEuro {
    public static void main(String[] args) {
        System.out.println("Podaj kwotę w euro: ");
        double zmiennaIntPobrana = new Scanner(System.in).nextDouble();
        double euro = 4.30716394;
        System.out.println("Wartość w PLN: " + zmiennaIntPobrana * euro);
    }
}