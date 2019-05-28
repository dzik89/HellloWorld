public class BooleanTest {
    public static void main(String[] args) {
//        boolean zmiennaBoolean1;
//        zmiennaBoolean1 = 1 != 5;
//        boolean zmiennaBoolean2 = !zmiennaBoolean1;
//        System.out.println(zmiennaBoolean2);
//        boolean wartosc1 = true;
//        boolean wartosc2 = true;
//        boolean wartosc3 = true;
//        boolean wartosc4 = true;
//        boolean wartoscKoncowa = !(wartosc1 && wartosc2) || (wartosc3 && wartosc4);
//        System.out.println(wartoscKoncowa);
        int wartosc1 = 2;
        int wartosc2 = 100;
        double wartosc3 = Math.sqrt(8);
        double wartosc4 = 1.2;
        boolean czyWartosc1JestWieksza = Math.pow(wartosc1, wartosc2) > Math.pow(wartosc2, wartosc1);
        boolean czyWartosc3JestWieksza = wartosc3 > wartosc4;
        boolean czyKtorysWarunekJestSpelniony = czyWartosc1JestWieksza || czyWartosc3JestWieksza;
        System.out.println(czyKtorysWarunekJestSpelniony);
    }
}
