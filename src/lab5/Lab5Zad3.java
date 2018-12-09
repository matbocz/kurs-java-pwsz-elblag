package lab5;

public class Lab5Zad3 {
    public static void main(String[] args) {
        int x = 12;
        int y = 15;
        int nrBitu1 = 2;
        int nrBitu2 = 4;
        int maskTest = 0;
        int maskA = 0, maskB = 0, maskC = 0, maskD = 0;

        System.out.println("x = " + x);
        converToBinary(x);
        System.out.println("y = " + y);
        converToBinary(y);
        System.out.println();

        x = x & ~(1 << nrBitu1);
        y = y | 1 << nrBitu2;

        System.out.println("Przesunięto bit o numerze: " + nrBitu1 + ", x = " + x);
        converToBinary(x);
        System.out.println("Przesunięto bit o numerze: " + nrBitu2 + ", y = " + y);
        converToBinary(y);
        System.out.println();

        System.out.println("Maska Test");
        converToBinary(maskTest);
        maskTest = ~maskTest; //11111111
        maskTest = maskTest << 1; //11111110
        maskTest = ~maskTest; //00000001
        maskTest = maskTest << 3; //00001000
        maskTest = ~maskTest; //11110111
        converToBinary(maskTest);
        System.out.println();

        System.out.println("Maska A");
        converToBinary(maskA);
        maskA = ~maskA; //11111111
        maskA = maskA << 4; //11110000
        converToBinary(maskA);
        System.out.println();

        System.out.println("Maska B");
        converToBinary(maskB);
        maskB = ~maskB; //11111111
        maskB = maskB << 4; //11110000
        maskB = ~maskB; //00001111
        converToBinary(maskB);
        System.out.println();

        System.out.println("Maska C");
        converToBinary(maskC);
        maskC = ~maskC; //00000000000000000000000000000000
        maskC = maskC >>> 4; //00001111111111111111111111111111
        converToBinary(maskC);
        System.out.println();

        System.out.println("Maska D");
        converToBinary(maskD);
        maskD = ~maskD; //00000000000000000000000000000000
        maskD = maskD >>> 4; //00001111111111111111111111111111
        maskD = ~maskD; //11110000000000000000000000000000
        converToBinary(maskD);
        System.out.println();
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