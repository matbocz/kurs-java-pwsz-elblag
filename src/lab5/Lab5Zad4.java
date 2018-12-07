package lab5;

public class Lab5Zad4 {
    public static void main(String[] args) {
        int x = 15;
        int n, p, w;

        converToBinary(x);
        n = 3;
        p = 3;
        w = groupVal(x, n, p);
        System.out.println("n = " + n);
        System.out.println("p = " + p);
        System.out.println("Wartość bloku: " + w);
    }

    //metoda wyznaczająca wartość dziesiętną grupy n bitów począwszy od pozycji p
    static int groupVal(int x, int n, int p) {
        return x >> (p + 1 - n) & ~(~0 << n);
    }

    //metoda realizująca konwersję liczby dziesiętnej na postać binarną
    static void converToBinary(int x) {
        int k = 1;
        int bit[] = new int[32];

        for (int i = 0; i < 32; i++) {
            if ((x & k) != 0) bit[i] = 1;
            else bit[i] = 0;
            k = k * 2;
        }

        for (int i = 31; i >= 0; i--) System.out.printf("%d ", bit[i]);
        System.out.println();
    }
}