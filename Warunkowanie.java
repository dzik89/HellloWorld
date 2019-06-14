public class Warunkowanie {
    public static void main(String[] args) {
        System.out.println("START - To sie wykonuje zawsze");
        int mojaZmienna = 10;
        if (mojaZmienna < 100){
            System.out.println("To wypisuję tylko gdy mojaZmienna < 100");
        }
        System.out.println("KONIEC - Ten kod wykonuje się zawsze");
    }

}
