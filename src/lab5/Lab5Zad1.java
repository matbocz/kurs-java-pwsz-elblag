package lab5;

public class Lab5Zad1 {
    public static void main(String[] args) {
        short lanbit1 = 12;
        short lanbit2 = -35;
        int a, b, c, d, e, f, g, h, i, j;

        System.out.println("lanbit1 = " + lanbit1);
        System.out.println("lanbit2 = " + lanbit2);
        System.out.println();

        a = ~lanbit1;
        System.out.println("a) ~lanbit1 = " + a);

        b = ~lanbit2;
        System.out.println("b) ~lanbit2 = " + b);

        c = lanbit1 & lanbit2;
        System.out.println("c) lanbit1&lanbit2 = " + c);

        d = ~lanbit1 & lanbit2;
        System.out.println("d) ~lanbit1&lanbit2 = " + d);

        e = ~(lanbit1 & lanbit2);
        System.out.println("e) ~(lanbit1&lanbit2) = " + e);

        f = lanbit1 | lanbit2;
        System.out.println("f) lanbit1| lanbit2 = " + f);

        g = ~(lanbit1 | lanbit2);
        System.out.println("g) ~(lanbit1|lanbit2) = " + g);

        h = (~lanbit1 | lanbit2);
        System.out.println("h) (~lanbit1|lanbit2) = " + h);

        i = lanbit1 ^ lanbit2;
        System.out.println("i) lanbit1^lanbit2 = " + i);

        j = ~(lanbit1 ^ lanbit2);
        System.out.println("j) ~(lanbit1^lanbit2) = " + j);
    }
}