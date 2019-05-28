import java.util.Scanner;

public class LaptopShop {
    public static void main(String[] args) {
        int posiadanaKwota;
        int cenaLaptopa;
        System.out.println("Podaj ilość pieniędzy, które posiadasz: ");
        posiadanaKwota = new Scanner(System.in).nextInt();
        System.out.println("Podaj cenę laptopa: ");
        cenaLaptopa = new Scanner(System.in).nextInt();
        int iloscLaptopow = posiadanaKwota / cenaLaptopa;
        System.out.println("Ile laptopów mogę kupić: " + iloscLaptopow);
        int reszta = posiadanaKwota % cenaLaptopa;
        System.out.println("Pozostanie reszty: " + reszta);
    }

}
