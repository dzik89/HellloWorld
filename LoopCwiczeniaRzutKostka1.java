import java.util.Random;

public class LoopCwiczeniaRzutKostka1 {
    //Rzucam kostką 100 razy i chcę policzyć sumę oczek
    public static void main(String[] args) {
        Random random = new Random();
        int suma = 0;
        for (int i = 0; i <= 100; i++) {
            int liczba = random.nextInt(6);
            int wynikRzutu = liczba+1;
            suma = suma + wynikRzutu;
            System.out.println("Wynik rzutu kostką: " + wynikRzutu);
        }
        System.out.println("Suma wszystkich rzutów: " + suma );
    }
}
