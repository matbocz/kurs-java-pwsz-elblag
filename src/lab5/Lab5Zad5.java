package lab5;

public class Lab5Zad5 {
    public static void main(String[] args) {
        short x = 15;
        int w;

        w = groupVal(x, 3, 3);
        System.out.println("Wartość bloku: " + w);
    }

    //metoda wyznaczająca wartość dziesiętną grupy n bitów począwszy od pozycji p
    static int groupVal(short x, int n, int p) {
        return x >> (p + 1 - n) & ~(~0 << n);
    }
}