import java.util.Scanner;

public class Kalkulator {
    public static void main(String[] args){
        System.out.println("Podaj pierwszą wartość: ");
        double wartosc1 = new Scanner(System.in).nextDouble();
        System.out.println("Podaj drugą wartość: ");
        double wartosc2 = new Scanner(System.in).nextDouble();
        System.out.println("Podaj, jakie działanie chcesz wykonac na liczbach przy założeniu, że: ");
        System.out.println("1 - dodawanie");
        System.out.println("2 - odejmowanie");
        System.out.println("3 - mnożenie");
        System.out.println("4 - dzielenie");
        int dzialanie = new Scanner(System.in).nextInt();
        switch (dzialanie){
            case 1:
                System.out.println(wartosc1 + wartosc2);
                break;
            case 2:
                System.out.println(wartosc1 - wartosc2);
                break;
            case 3:
                System.out.println(wartosc1 * wartosc2);
                break;
            case 4: {
                if (wartosc2 == 0){
                    System.out.println("NIE DZIELIMY PRZEZ ZERO!");
            } else
                System.out.println(wartosc1 / wartosc2);
                break;}

                default:
                    System.out.println("Nie wybrano żadnego działania");
            }

        }
    }


