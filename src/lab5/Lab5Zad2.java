package lab5;

import java.util.Scanner;

public class Lab5Zad2 {
    public static void main(String[] args) {
        int x;

        System.out.println("Podaj liczbę x: ");
        Scanner sc = new Scanner(System.in);
        while (!sc.hasNextInt()) {
            System.out.println("To nie jest liczba calkowita.");
            System.out.println("Podaj liczbę x: ");
            sc.next();
        }
        x = sc.nextInt();

        converToBinary(x);
    }

    //metoda realizująca konwersję liczby dziesiętnej na postać binarną
    static void converToBinary(int x) {
        int k = 1;
        int bit[] = {0, 0, 0, 0, 0, 0, 0, 0};

        for (int i = 0; i < 8; i++) {
            if ((x & k) != 0) bit[i] = 1;
            else bit[i] = 0;
            k = k * 2;
        }

        for (int i = 7; i >= 0; i--) System.out.printf("%d ", bit[i]);
        System.out.println("\n");
    }
}