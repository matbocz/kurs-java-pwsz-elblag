package lab2;

import java.io.IOException; //import klasy
import java.util.Scanner; //import klasy

public class lab2Zad3 { //definicja klasy publicznej
    public static void main(String[] args) throws IOException { //definicja metody, obsługa wyjątków

        //deklaracja zmiennych
        double a, b, c;
        double p, delta;
        double x1, x2, re, im;
        double sprX1, sprX2, sprRE, sprIM;

        //utworzenie obiektu typu scanner
        Scanner sc = new Scanner(System.in);

        //wczytanie zmiennej z klawiatury z zabezpieczeniem formatu
        System.out.println("Podaj liczbę a: ");
        while (!sc.hasNextDouble()) {
            System.out.println("To nie jest liczba zmiennoprzecinkowa.");
            System.out.println("Podaj liczbę a: ");
            sc.next();
        }
        a = sc.nextDouble();

        //wczytanie zmiennej z klawiatury z zabezpieczeniem formatu
        System.out.println("Podaj liczbę b: ");
        while (!sc.hasNextDouble()) {
            System.out.println("To nie jest liczba zmiennoprzecinkowa.");
            System.out.println("Podaj liczbę b: ");
            sc.next();
        }
        b = sc.nextDouble();

        //wczytanie zmiennej z klawiatury z zabezpieczeniem formatu
        System.out.println("Podaj liczbę c: ");
        while (!sc.hasNextDouble()) {
            System.out.println("To nie jest liczba zmiennoprzecinkowa.");
            System.out.println("Podaj liczbę c: ");
            sc.next();
        }
        c = sc.nextDouble();

        //równanie jest tożsame
        if (a == 0 && b == 0 && c == 0) {
            System.out.println("Równanie tożsame");
            System.exit(1);
        }

        //równanie jest sprzeczne
        if (a == 0 && b == 0 && c != 0) {
            System.out.println("Równanie sprzeczne");
            System.exit(1);
        }

        //równanie jest liniowe
        if (a == 0) {
            System.out.println("Równanie liniowe");
            x1 = -c / b;
            System.out.format("x = %.2f", x1);
        }

        //równanie jest kwadratowe
        if (a != 0) {

            //obliczenie delty
            delta = (b * b) - (4 * a * c);

            //delta jest równa zero
            if (delta == 0) {
                System.out.println("Delta == 0");
                x1 = -b / (2 * a);
                System.out.format("x = %.2f", x1);
            }

            //delta jest większa od zera
            if (delta > 0) {
                System.out.println("Delta > 0");
                p = Math.sqrt(delta);
                x1 = (-b + p) / (2 * a);
                x2 = (-b - p) / (2 * a);
                sprX1 = a * x1 * x1 + b * x1 + c;
                sprX2 = a * x2 * x2 + b * x2 + c;
                System.out.format("x1 = %.2f, x2 = %.2f\n", x1, x2);
                System.out.format("sprX1 = %.2f, sprX2 = %.2f", sprX1, sprX2);
            }

            //delta jest mniejsza od zera
            if (delta < 0) {
                System.out.println("Delta < 0");
                p = Math.sqrt(-delta);
                re = -b / (2 * a);
                im = p / (2 * a);
                sprRE = a * re * re - a * im * im + b * re + c;
                sprIM = 2 * re * im * a + b * im;
                System.out.format("x1 = %.2f+%.2fi, x2 = %.2f-%.2fi\n", re, im, re, im);
                System.out.format("sprRE = %.2f, sprIM = %.2f", sprRE, sprIM);
            }
        }
    }
}