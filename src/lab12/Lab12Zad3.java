package lab12;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Lab12Zad3 {
    public static void main(String[] args) throws IOException {
        File f = new File("numbers.dat");
        double[] x = {3, 4, 5, 8, 12};

        RandomAccessFile plik = new RandomAccessFile(f, "rw");
        for (int i = 0; i < x.length; i++) {
            plik.writeDouble(x[i]);
        }

        plik.seek(0);

        for (int i = 0; i < x.length; i++) {
            double c = plik.readDouble();
            System.out.print(c + " ");
        }
    }
}