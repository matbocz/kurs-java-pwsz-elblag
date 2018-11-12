package lab2; //deklaracja pakietu

public class Lab2ZadDom { //definicja klasy publicznej
    public static void main(String[] args) { //definicja metody

        //deklaracja zmiennych
        double x, y;
        float z;
        int a;

        //opis i wykorzystanie funkcji abs
        x = -9;
        System.out.println("abs - zwraca wartość absolutną argumentu.");
        System.out.println("x = " + x);
        System.out.println("Math.abs(x) = " + Math.abs(x));
        System.out.println();

        //opis i wykorzystanie funkcji copySign
        x = 175.8;
        y = -43.2;
        System.out.println("copySign - zwraca pierwszy argument ze znakiem drugiego argumentu.");
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("Math.copySign(x, y) = " + Math.copySign(x, y));
        System.out.println();

        //opis i wykorzystanie funkcji expm1
        x = 0.5;
        System.out.println("expm1 - zwraca (e^x)-1.");
        System.out.println("x = " + x);
        System.out.println("Math.expm1(x) = " + Math.expm1(x));
        System.out.println();

        //opis i wykorzystanie funkcji getExponent
        x = 60984.1;
        System.out.println("getExponent - zwraca wykładnik argumentu.");
        System.out.println("x = " + x);
        System.out.println("Math.getExponent(x) = " + Math.getExponent(x));
        System.out.println();

        //opis i wykorzystanie funkcji hypot
        x = 60984.1;
        y = -497.99;
        System.out.println("hypot - zwraca sqrt(x^2+y^2).");
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("Math.hypot(x, y) = " + Math.hypot(x, y));
        System.out.println();

        //opis i wykorzystanie funkcji IEEEremainder
        x = 60984.1;
        y = -497.99;
        System.out.println("IEEEremainder - zwraca reszte jeśli pierwszy argument jest podzielny przez drugi argument.");
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("Math.IEEEremainder(x, y) = " + Math.IEEEremainder(x, y));
        System.out.println();

        //opis i wykorzystanie funkcji max
        x = 32.4;
        y = 12.6;
        System.out.println("max - zwraca max z dwóch argumentów.");
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("Math.max(x, y) = " + Math.max(x, y));
        System.out.println();

        //opis i wykorzystanie funkcji min
        x = 4.5;
        y = 6.2;
        System.out.println("min - zwraca min z dwóch argumentów.");
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("Math.min(x, y) = " + Math.min(x, y));
        System.out.println();

        //opis i wykorzystanie funkcji nextUp
        z = 98759.765f;
        System.out.println("nextUp - zwraca liczbę zmiennoprzecinkową zbliżoną do nieskończoności dodatniej.");
        System.out.println("z = " + z);
        System.out.println("Math.nextUp(z) = " + Math.nextUp(z));
        System.out.println();

        //opis i wykorzystanie funkcji nextAfter
        x = 98759.765;
        y = 154.28764;
        System.out.println("nextAfter - zwraca liczbę zmiennoprzecinkową zbliżoną do pierwszego agrumentu w kierunku drugiego argumentu.");
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("Math.nextAfter(x, y) = " + Math.nextAfter(x, y));
        System.out.println();

        //opis i wykorzystanie funkcji rint
        x = 100.675;
        System.out.println("rint - zwraca liczbę całkowitą, najbliższą wartości argumentu.");
        System.out.println("x = " + x);
        System.out.println("Math.rint(x) = " + Math.rint(x));
        System.out.println();

        //opis i wykorzystanie funkcji scalb
        z = 50.14f;
        a = 4;
        System.out.println("scalb - zwraca z * 2^a.");
        System.out.println("z = " + z);
        System.out.println("a = " + a);
        System.out.println("Math.scalb(z, a) = " + Math.scalb(z, a));
        System.out.println();

        //opis i wykorzystanie funkcji signum
        z = 50.14f;
        System.out.println("signum - zwraca 1.0 jeśli argument jest dodatni, -1.0 jeśli jest ujemny, 0 jeśli jest równy zero.");
        System.out.println("z = " + z);
        System.out.println("Math.signum(z) = " + Math.signum(z));
        System.out.println();

        //opis i wykorzystanie funkcji toDegrees
        x = 45.0;
        System.out.println("toDegrees - zamienia wartość argumentu na stopnie.");
        System.out.println("x = " + x);
        System.out.println("Math.toDegrees(x) = " + Math.toDegrees(x));
        System.out.println();

        //opis i wykorzystanie funkcji toRadians
        x = 90.0;
        System.out.println("toRadians - zamienia wartość argumentu na radiany.");
        System.out.println("x = " + x);
        System.out.println("Math.toRadians(x) = " + Math.toRadians(x));
        System.out.println();

        //opis i wykorzystanie funkcji ulp
        x = 956.294;
        System.out.println("ulp - zwraca dodatnią odległość pomiędzy wartością zmiennoprzecinkową a następną większą wartością.");
        System.out.println("x = " + x);
        System.out.println("Math.ulp(x) = " + Math.ulp(x));
    }
}