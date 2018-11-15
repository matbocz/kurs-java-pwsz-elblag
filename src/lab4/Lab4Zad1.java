package lab4;

import java.util.Arrays;
import java.util.Random;

public class Lab4Zad1 {
    public static void main(String[] args) {
        double x[] = {2, 3, 5, 2, 1};
        double kopia[];
        double y[];
        double los[] = new double[5];
        int iloscElementow;

        //wydrukowanie tablicy x
        System.out.println("Tablica x.");
        for (double element : x) System.out.print(element + " ");
        System.out.println();
        System.out.println();

        //wyznaczanie ilości elementów tablicy x
        iloscElementow = x.length;
        System.out.println("Ilość elementow tablicy x: " + iloscElementow);
        System.out.println();

        //utworzenie kopii tablicy x
        System.out.println("Tablica kopia. Skopiowanie wszystkich elementów z tablicy x.");
        kopia = Arrays.copyOf(x, x.length);
        for (int i = 0; i < x.length; i++)
            System.out.print(kopia[i] + " ");
        System.out.println();
        System.out.println();

        //powiększenie tablicy los dwukrotnie
        los = Arrays.copyOf(los, 2 * los.length);

        //wypełnienie tablicy los liczbami pseudolosowymi
        Random r = new Random();
        for (int i = 0; i < los.length; i++)
            los[i] = r.nextInt(50);

        //posortowanie tablicy los niemalejąco
        System.out.println("Tablica los posortowana niemalejąco.");
        Arrays.sort(los);
        for (int i = 0; i < los.length; i++)
            System.out.println(los[i]);
        System.out.println();

        //posortowanie tablicy los nierosnąco
        System.out.println("Tablica los posortowana nierosnąco.");
        for (int i = 0; i < los.length / 2; i++) {
            double temp = los[i];
            los[i] = los[los.length - 1 - i];
            los[los.length - 1 - i] = temp;
        }
        for (int i = 0; i < los.length; i++)
            System.out.println(los[i]);
        System.out.println();

        //skopiowanie elementów z tablicy x do tablicy y, z wybranego zakresu indeksów
        System.out.println("Tablica y. Skopiowanie indeksów od 1 do 3 z tablicy x.");
        y = Arrays.copyOfRange(x, 1, 4);
        for (double element : y) System.out.print(element + " ");
        System.out.println();
        System.out.println();

        //wyszukanie wybranego elementu w tablicy x
        System.out.println("Wyszukanie elementu 3.0 w tablicy x.");
        Arrays.sort(x);
        int nrElementu = Arrays.binarySearch(x, 3.0);
        if (nrElementu > 0)
            System.out.println("Element jest na pozycji: " + nrElementu);
        else
            System.out.println(" Nie ma takiego elementu.");
    }
}