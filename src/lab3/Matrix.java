package lab3;

public class Matrix { //definicja klasy publicznej
    public static void main(String[] args) { //definicja metody main
        //deklaracja tablic dwuwymiarowych typu int
        int x[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int y[][] = {{3, 8, 1}, {4, 2, 3}, {2, 1, 9}};
        int sumaXY[][] = new int[x.length][x[0].length];
        int iloczynXY[][] = new int[x.length][x[0].length];

        //deklaracja zmiennych
        int sum, sumCol, sumRow;
        int col = 0, row = 1;

        //wydrukowanie tablicy x
        System.out.println("Tablica x");
        printTab2D(x);

        //wydrukowanie sumy wszystkich elementów tablicy x
        sum = sumTab2D(x);
        System.out.println("Suma wszystkich elementów = " + sum);

        //wydrukowanie sumy wybranej kolumny tablicy x
        sumCol = sumColTab2D(x, col);
        System.out.println("Suma wybranej kolumny = " + sumCol + ", kolumna: " + col);

        //wydrukowanie sumy wybranego wiersza tablicy x
        sumRow = sumRowTab2D(x, row);
        System.out.println("Suma wybranego wiersza = " + sumRow + ", wiersz: " + row);

        System.out.println();

        //wydrukowanie tablicy y
        System.out.println("Tablica y");
        printTab2D(y);

        //wydrukowanie sumy wszystkich elementów tablicy y
        sum = sumTab2D(y);
        System.out.println("Suma wszystkich elementów = " + sum);

        //wydrukowanie sumy wybranej kolumny tablicy y
        sumCol = sumColTab2D(y, col);
        System.out.println("Suma wybranej kolumny = " + sumCol + ", kolumna: " + col);

        //wydrukowanie sumy wybranego wiersza tablicy y
        sumRow = sumRowTab2D(y, row);
        System.out.println("Suma wybranego wiersza = " + sumRow + ", wiersz: " + row);

        System.out.println();

        //wydrukowanie sumy tablic x i y
        System.out.println("Suma tabeli x i y");
        sumaXY = addTab2D(x, y);
        printTab2D(sumaXY);

        System.out.println();

        //wydrukowanie iloczynu tablic x i y
        System.out.println("Iloczyn tabeli x i y");
        iloczynXY = multTab2D(x, y);
        printTab2D(iloczynXY);
    }

    //metoda drukująca tablicę dwuwymiarową typu int
    static void printTab2D(int tab[][]) {
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab.length; j++) {
                System.out.print(tab[i][j] + " ");
            }
            System.out.println();
        }
    }

    //metoda transponująca tablicę dwuwymiarową typu int
    static void transposeTab2D(int tab[][]) {
        int temp;

        for (int i = 0; i < tab.length; i++) {
            for (int j = i + 1; j < tab[0].length; j++) {
                temp = tab[i][j];
                tab[i][j] = tab[j][i];
                tab[j][i] = temp;
            }
        }
    }

    //metoda sumująca wszystkie elementy tablicy dwuwymiarowej typu int
    static int sumTab2D(int tab[][]) {
        int sum = 0;

        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[0].length; j++) {
                sum += tab[i][j];
            }
        }

        return sum;
    }

    //metoda sumująca wybraną kolumnę tablicy dwuwymiarowej typu int
    static int sumColTab2D(int tab[][], int col) {
        int sum_col = 0;

        for (int i = 0; i < tab.length; i++)
            sum_col += tab[i][col];

        return sum_col;
    }

    //metoda sumująca wybrany wiersz tablicy dwuwymiarowej typu int
    static int sumRowTab2D(int tab[][], int row) {
        int sum_row = 0;

        for (int j = 0; j < tab[0].length; j++)
            sum_row += tab[row][j];

        return sum_row;
    }

    //metoda dodająca do siebie dwie tablice dwuwymiarowe typu int
    static int[][] addTab2D(int tab1[][], int tab2[][]) {
        int sum[][] = new int[tab1.length][tab1[0].length];

        for (int i = 0; i < tab1.length; i++) {
            for (int j = 0; j < tab1[0].length; j++) {
                sum[i][j] = tab1[i][j] + tab2[i][j];
            }
        }

        return sum;
    }

    //metoda mnożąca przez siebie dwie tablice dwuwymiarowe typu int
    static int[][] multTab2D(int tab1[][], int tab2[][]) {
        int mult[][] = new int[tab1.length][tab1[0].length];

        for (int i = 0; i < tab1.length; i++) {
            for (int j = 0; j < tab2[0].length; j++) {
                for (int k = 0; k < tab1[0].length; k++) {
                    mult[i][j] += tab1[i][k] * tab2[k][j];
                }
            }
        }

        return mult;
    }
}