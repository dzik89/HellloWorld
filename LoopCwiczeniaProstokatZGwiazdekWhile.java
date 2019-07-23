import java.util.Scanner;

public class LoopCwiczeniaProstokatZGwiazdekWhile {
    public static void main(String[] args) {
        System.out.println("Podaj liczbę \"x\": ");
        int x = new Scanner(System.in).nextInt();
        System.out.println("Podaj liczbę0 \"y\": ");
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
