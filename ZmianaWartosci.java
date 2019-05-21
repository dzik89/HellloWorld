public class ZmianaWartosci {
    public static void main(String[] args) {
        int x = 4;
        int y = 10;
        System.out.println("X=" + x);
        System.out.println("Y=" + y);
        y = 5;
        System.out.println("Zmieniam Y na 5");
        System.out.println("X=" + x);
        System.out.println("Y=" + y);
        y = x + 2;
        System.out.println("Zmieniam Y na X + 2");
        System.out.println("X=" + x);
        System.out.println("Y=" + y);
        y = y + 1;
        System.out.println("Zmieniam Y na Y + 1");
        System.out.println("X=" + x);
        System.out.println("Y=" + y);
    }
}
