import java.util.Scanner;

public class LoopCwiczeniaRozne2 {
    public static void main(String[] args) {
        //Użytkownik podaje dwie liczby (x i y), wydrukuj wszystkie liczby całkowite od x do y.
        System.out.println("Podaj wartość \"x\": ");
        double x = new Scanner(System.in).nextDouble();
        int xInt = (int) x; //   Rzutowanie - zamiana jednego typu zmiennej w inny,
        xInt++; //               w tym przypadku zmienia double w int. Można zamiast tego użyć funkcji "Math.round(x)",
        //                       która zaokrągli tradycyjnie, lub funkcji "Math.ceil(x)" która zaokrągla ZAWSZE w górę.
        System.out.println("Podaj wartość \"y\": ");
        double y = new Scanner(System.in).nextDouble();
        for ( int i = xInt; i <= y; i++){
            System.out.println(i);
        }
    }
}
