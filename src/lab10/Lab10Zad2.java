package lab10;

public class Lab10Zad2 {
    public static void main(String[] args) {
        UczciwyBankier uczciwyBankier = new UczciwyBankier("Marian");
        PodstepnyBankier podstepnyBankier = new PodstepnyBankier("Bogdan");

        System.out.println(uczciwyBankier.imie + ": " + uczciwyBankier.licz(5, 5));
        System.out.println(podstepnyBankier.imie + ": " + podstepnyBankier.licz(5, 5));
    }
}

abstract class Bankier {
    String imie;

    Bankier(String imie) {
        this.imie = imie;
    }

    double licz(double a, double b) {
        return 0;
    }
}

class UczciwyBankier extends Bankier {
    UczciwyBankier(String imie) {
        super(imie);
    }

    double licz(double a, double b) {
        return a + b;
    }
}

class PodstepnyBankier extends Bankier {
    PodstepnyBankier(String imie) {
        super(imie);
    }

    double licz(double a, double b) {
        return (a + b) * 0.8;
    }
}