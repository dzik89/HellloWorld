import java.util.Scanner;

public class ProstokatKurla {
    public static void main(String[] args) {
        System.out.println("Podaj liczbe \"x\": ");
        int x = new Scanner(System.in).nextInt();
        System.out.println("Podaj liczbe \"y\": ");
        int y = new Scanner(System.in).nextInt();
        int zeroX = 0;
        int zeroY = 0;
        while (zeroY < y) {
            zeroX = 0;
            while (zeroX < x) {
                System.out.print("*");
                zeroX++;
            }
            System.out.println();
            zeroY++;
        }
    }
}
