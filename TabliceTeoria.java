import java.util.Scanner;

public class TabliceTeoria {
    // Początek zadania z tablicą "NATURALNE"
    public static void main(String[] args) {
//        int dlugoscTablicy;
//        int[] naturalne = new int[10];
//        for (int zawartoscTablicy = 0; zawartoscTablicy < 10; zawartoscTablicy++) {
//            naturalne[zawartoscTablicy] = zawartoscTablicy + 1;
//        }
//        System.out.print("tablica:{");
//        for (int i = 0; i < 10; i++) {
//            System.out.print(naturalne[i]);
//            if (i < 9) {
//                System.out.print(",");
//            }
//        }
//        System.out.println("}");
//    // Koniec zadania z tablicą "NATURALNE"
//    // Początek zadania nr 1 z modyfikowania wartości tablicy
//        for (int i = 0; i < 10 ; i++) {
//            naturalne[i] = naturalne[i] * naturalne[i];
//        }
//        System.out.print("tablica:{");
//        for (int i = 0; i < 10; i++) {
//            System.out.print(naturalne[i]);
//            if (i < 9) {
//                System.out.print(",");
//            }
//        }
//        System.out.println("}");
        // Koniec zadania nr 1 z modyfikowania wartości tablicy
        // Początek zadania nr 2 z modyfikowania wartości tablicy
//        System.out.println("Podaj jaka ma być długość tablicy: ");
//        int dlugoscTablicy = new Scanner(System.in).nextInt();
//        int[] tablica1 = new int[dlugoscTablicy];
//        for (int i = 0; i < dlugoscTablicy; i++) {
//            if (i % 2 == 0) {
//                tablica1[i] = i + 1;
//            } else {
//                tablica1[i] = -(i + 1);
//            }
//        }
//        System.out.print("tablica:{");
//        for (int i = 0; i < tablica1.length; i++) {
//            System.out.print(tablica1[i]);
//            if (i != tablica1.length - 1) {
//                System.out.print(",");
//            }
//        }
//        System.out.print("}");
        // Koniec zadania nr 2 z modyfikowania wartości tablicy
        // Początek zadania nr 3 z modyfikowania wartości tablicy
        int dlugoscTablicy;
        int[] naturalne = new int[10];
        for (int zawartoscTablicy = 0; zawartoscTablicy < 10; zawartoscTablicy++) {
            naturalne[zawartoscTablicy] = zawartoscTablicy + 1;
        }
        System.out.print("tablica: {");
        for (int i = 0; i <= 9; i++) {
            System.out.print(naturalne[i]);
            if (i < 9) {
                System.out.print(",");
            }
        }
        System.out.println("}");

        System.out.print("tablica: {");
        for (int i = 9; i >= 0; i--) {
            System.out.print(naturalne[i]);
            if (i > 0) {
                System.out.print(",");
            }
        }
        System.out.println("}");

        int dlugoscTablicy2; // Tablica odwrotna niż ta powyżej, zaczynamy od większych wartości
        int[] naturalne2 = new int[10];
        for (int zawartoscTablicy2 = 9; zawartoscTablicy2 >= 0; zawartoscTablicy2--) {
            naturalne2[9-zawartoscTablicy2] = zawartoscTablicy2 + 1;
        }
        System.out.print("tablica: {");
        for (int i = 0; i < naturalne2.length; i++) {
            System.out.print(naturalne2[i]);
            if (i != naturalne2.length-1) {
                System.out.print(",");
            }
        }
        System.out.println("}");
        // Koniec zadania nr 3 z modyfikowania wartości tablicy
    }
}
