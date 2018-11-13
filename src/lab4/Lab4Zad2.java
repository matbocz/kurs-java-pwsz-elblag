package lab4;

public class Lab4Zad2 {
    public static void main(String[] args) {
        int x[][] = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
        int wyniki[];

        wyniki = dimensions(x);

        System.out.println("Ilość wierszy: " + wyniki[0]);
        System.out.println("Ilość kolumn: " + wyniki[1]);
    }

    //metoda zwracająca ilość wierszy oraz ilość kolumn
    static int[] dimensions(int tab[][]) {
        int wyniki[] = new int[2];
        int iloscWierszy, iloscKolumn;

        iloscWierszy = tab.length;
        iloscKolumn = tab[0].length;

        wyniki[0] = iloscWierszy;
        wyniki[1] = iloscKolumn;

        return wyniki;
    }
}