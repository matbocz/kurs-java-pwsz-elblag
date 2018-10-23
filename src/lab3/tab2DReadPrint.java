package lab3;

import java.util.Scanner;

public class tab2DReadPrint {
    public static void main(String[] args) {

        int x[][] = new int[3][3];

        readTab2D(x);
        System.out.println("----Przed transpozycją----");
        printTab2D(x);

        transposeTab2D(x);
        System.out.println("----Po transpozycji----");
        printTab2D(x);
    }

    static void readTab2D(int tab[][]) {

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[0].length; j++) {
                System.out.println("Podaj element tablicy: ");
                while (!sc.hasNextInt()) {
                    System.out.println("To nie jest liczba całkowita.");
                    System.out.println("Podaj liczbę całkowitą: ");
                    sc.next();
                }
                tab[i][j] = sc.nextInt();
            }
        }
    }

    static void printTab2D(int tab[][]) {

        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab.length; j++) {
                System.out.print(tab[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void transposeTab2D(int tab[][]) {

        int temp;

        for (int i = 0; i < tab.length; i++) {
            for (int j = i + 1; j < tab.length; j++) {
                temp = tab[i][j];
                tab[i][j] = tab[j][i];
                tab[j][i] = temp;
            }
        }
    }
}