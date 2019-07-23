import java.util.Scanner;

public class LoopCwiczeniaProstokatZGwiazdekFor {
    public static void main(String[] args) {
        System.out.println("Podaj wartość \"x\": ");
        int x = new Scanner(System.in).nextInt();
        System.out.println("Podaj wartość \"y\": ");
        int y = new Scanner(System.in).nextInt();
        for (int i = 0; i < y; i++) {
            for (int j = 0; j < x; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
