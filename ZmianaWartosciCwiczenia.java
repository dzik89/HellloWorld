import java.sql.SQLOutput;

public class ZmianaWartosciCwiczenia {
    public static void main(String[] args) {
        System.out.println();
        int x = 5;
        int y = 10;
        System.out.println("X=" + x);
        System.out.println("Y=" + y);
        System.out.println();
        y = 6;
        System.out.println("Zmieniam wartość Y na 6");
        System.out.println("X=" + x);
        System.out.println("Y=" + y);
        y = x + 3;
        System.out.println();
        System.out.println("Zmieniam wartość Y na X+3");
        System.out.println("X=" + x);
        System.out.println("Y=" + y);
        y = x + y;
        System.out.println();
        System.out.println("Zmieniam wartość Y na X+Y");
        System.out.println("X=" + x);
        System.out.println("Y=" + y);
        y = (y - 10) * 2;
        System.out.println();
        System.out.println("Zmieniam wartość Y na (Y-10)*2");
        System.out.println("X=" + x);
        System.out.println("Y=" + y);
        int z = 3;
        x = x * z;
        y = y + x;
        System.out.println();
        System.out.println("Tworzę nową zmienną Z o wartości 3");
        System.out.println("Zmieniam wartość X na X*Z");
        System.out.println("Zmieniam wartość Y na Y+X");
        System.out.println("Z=" + z); // Z=3
        System.out.println("X=" + x); // X=15
        System.out.println("Y=" + y); // Y=21
        int suma = x + y + z;
        System.out.println();
        System.out.println("Suma wszystkich zmiennych wynosi " + suma); // 39
        int różnica = x - y - z;
        System.out.println();
        System.out.println("Różnica wszystkich zmiennych w kolejności x,y,z wynosi " + różnica); // -9
        int iloczyn = x * y * z;
        System.out.println();
        System.out.println("Iloczyn wszystkich zmiennych w kolejności x,y,z wynosi " + iloczyn); // 945
    }
}
