package lab6;

public class Lab6Zad7 {
    public static void main(String[] args) {
        //utworzenie obiektu klasy String
        String str = "Mateusz";

        //wydobycie drugiego znaku z łańcucha i wydrukowanie
        char second = str.charAt(1);
        System.out.println(second);

        //wydobycie piątego znaku z łańcucha i wydrukowanie
        char fifth = str.charAt(4);
        System.out.println(fifth);
    }
}