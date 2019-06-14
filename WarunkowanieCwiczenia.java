import java.util.Scanner;

public class WarunkowanieCwiczenia {
    public static void main(String[] args) {
//        System.out.println("Podaj dowolną liczbę dodatnią: ");
//        int twojaLiczba = new Scanner(System.in).nextInt();
//    if (twojaLiczba < 0){
//        System.out.println("Podałeś za małą wartość");
//    }
//        System.out.println("Podaj wartość \"x\": ");
//        double x = new Scanner(System.in).nextDouble();
//        System.out.println("Podaj wartość \"y\": ");
//        double y = new Scanner(System.in).nextDouble();
//        if (y == 0){
//            System.out.println("Liczba \"y\" musi być inna od zera!");
//        }
//        else {
//            System.out.println("Iloraz liczb \"x\" i \"y\" wynosi: " + (x/y) );
//        }
//        System.out.println("Obliczmy pole trójkąta. Podaj długość podstawy: ");
//        double dlugoscPodstawy = new Scanner(System.in).nextDouble();
//        if (dlugoscPodstawy <= 0){
//            System.out.println("Ta wartość musi być dodatnia!");
//        }
//        else {
//            System.out.println("Podaj wysokość: ");
//            double wysokosc = new Scanner(System.in).nextDouble();
//            if (wysokosc <= 0){
//                System.out.println("Ta wartość musi być dodatnia!");
//            }
//            else {
//                System.out.println("Pole trójkąta wynosi: " + ((0.5*dlugoscPodstawy)*wysokosc));
//            }
//        }
        System.out.println("Podaj liczbę \"x\": ");
        double x = new Scanner(System.in).nextDouble();
        System.out.println("Podaj liczbę \"y\": ");
        double y = new Scanner(System.in).nextDouble();
        if (x > 0) {
            if (y > 0) {
                System.out.println("Obie liczby są dodatnie");
            } else if (y == 0) {
                System.out.println("X jest większy od zera, Y jest równy zero");
            } else if (y < 0) {
                System.out.println("X jest większy od zera, Y jest mniejszy od zera");
            }
        } else if (x == 0) {
            if (y > 0) {
                System.out.println("X jest równy zero, Y jest większy od zera");
            } else if (y == 0) {
                System.out.println("Obie liczby są równe zero");
            } else if (y < 0) {
                System.out.println("X jest równy zero, Y jest mniejszy od zera");
            }
        } else if (x < 0) {
            if (y > 0) {
                System.out.println("X jest mniejszy od zera, Y jest większy od zera");
            } else if (y == 0) {
                System.out.println("X jest mniejszy od zera, Y jest równy zero");
            } else if (y < 0) {
                System.out.println("Obie liczby są mniejsze od zera");
            }

        }
    }
}