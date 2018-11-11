package lab_3; //deklaracja pakietu

public class lab3Zad4 { //definicja klasy publicznej
    public static void main(String[] args) { //definicja metody main
        double suma; //deklaracja zmiennej typu double

        //utworzenie nowego obiektu klasy Pierwsza
        Pierwsza obiekt = new Pierwsza();

        //wydrukowanie sumy odwrotności silni
        suma = obiekt.computeSumOfInverses(3);
        System.out.println(suma);
    }

    static class Pierwsza { //definicja klasy statycznej
        //metoda zwracająca sumę odwrotności silni
        double computeSumOfInverses(int n) {
            double sum = 0;
            int i;

            for (i = 0; i <= n; i++)
                sum += 1 / silnia(i);

            return sum;
        }

        //metoda prywatna zwracająca silnie
        private double silnia(int n) {
            double sil = 1;
            int i;

            if (n == 0) return 1;

            for (i = 1; i <= n; i++)
                sil *= i;

            return sil;
        }
    }
}