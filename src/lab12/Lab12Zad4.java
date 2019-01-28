package lab12;

import java.io.*;

public class Lab12Zad4 {
    public static void main(String[] args) throws IOException {
        File file = new File("tekst1.dat");
        if (!file.exists()) {
            file.createNewFile();
        }

        PrintWriter pw = new PrintWriter(file);
        pw.println("Mateusz Boczarski");
        pw.close();

        BufferedReader br = new BufferedReader(new FileReader(file));
        String s;
        while ((s = br.readLine()) != null)
            System.out.println(s);
    }
}