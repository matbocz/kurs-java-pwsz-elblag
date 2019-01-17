package lab5;

public class Lab5Zad5 {
    public static void main(String[] args) {
        int x = -12, y = -32;

        //przesunięcie typu >> dla liczby ujemnej
        System.out.println("Liczba przed przesunięciem: " + x);
        converToBinary(x);
        x = x >> 1;
        System.out.println("Liczba po przesunięciu x >> 1: " + x);
        converToBinary(x);
        System.out.println();

        //przesunięcie typu >>> dla liczby ujemnej
        System.out.println("Liczba przed przesunięciem: " + y);
        converToBinary(y);
        y = y >>> 1;
        System.out.println("Liczba po przesunięciu y >>> 1: " + y);
        converToBinary(y);
    }

    //metoda realizująca konwersję liczby dziesiętnej na postać binarną
    static void converToBinary(int x) {
        int k = 1;
        int[] bit = new int[32];

        for (int i = 0; i < 32; i++) {
            if ((x & k) != 0) bit[i] = 1;
            else bit[i] = 0;
            k = k * 2;
        }

        for (int i = 31; i >= 0; i--) System.out.printf("%d ", bit[i]);
        System.out.println();
    }
}