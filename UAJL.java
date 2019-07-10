import java.util.Scanner;

public class UAJL {
    public static void main(String[] args){
//        int a = 10;
//        int b = 100;
//        while (a <= b){
//            System.out.println(a);
//            a+=2;
//        System.out.println("Ile chcesz zobaczyć gwiazdek?");
//        int gwiazdka = new Scanner(System.in).nextInt();
//        int a = 0;
//        while (a < gwiazdka){
//            System.out.println("*");
//            a++;
//        }
        System.out.println("Podaj wartość \"x\": ");
        int x = new Scanner(System.in).nextInt();
        System.out.println("Podaj wartość \"y\": ");
        int y = new Scanner(System.in).nextInt();
        if (x < y) {
            while (x <= y) {
                System.out.println(x);
                x++;
            }
        }
        else {
            while (x >= y) {
                System.out.println(x);
                x--;
            }
        }
    }

    }


