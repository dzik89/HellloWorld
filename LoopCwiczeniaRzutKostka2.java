import java.util.Random;

public class LoopCwiczeniaRzutKostka2 {
    //Rzucam kostką dopóki nie wypadnie liczba 6 i chcę policzyć sumę oczek
    public static void main(String[] args) {
        Random random = new Random();
        int suma = 0;
        int wynikRzutu = 0;
        while (wynikRzutu != 6) {
            int liczba = random.nextInt(6);
            wynikRzutu = liczba + 1;
            suma = suma + wynikRzutu;
            System.out.println("Wynik rzutu kostką: " + wynikRzutu);
        }
        System.out.println("Suma wszystkich rzutów: " + suma);
    }
}