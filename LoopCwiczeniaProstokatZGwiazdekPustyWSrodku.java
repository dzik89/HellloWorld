import java.util.Scanner;

public class LoopCwiczeniaProstokatZGwiazdekPustyWSrodku {

    //Ten prostokąt ma być pusty w środku!

    public static void main(String[] args) {
        System.out.println("Podaj wartość \"x\": ");
        int liczba1 = new Scanner(System.in).nextInt();
        System.out.println("Podaj wartość \"y\": ");
        int liczba2 = new Scanner(System.in).nextInt();
        for (int numerLinii = 0; numerLinii < liczba2; numerLinii++) {
            for (int numerKolumny = 0; numerKolumny < liczba1; numerKolumny++) {
                if (numerLinii == 0 || numerLinii == liczba2 - 1) {
                    System.out.print("*");
                } else {
                    if (numerKolumny == 0 || numerKolumny == liczba1 - 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }

                }
            }
            System.out.println();
        }
    }
}