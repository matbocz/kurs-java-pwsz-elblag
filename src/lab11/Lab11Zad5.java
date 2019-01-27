package lab11;

public class Lab11Zad5 {
    public static void main(String[] args) throws NiesklejalnePudelka {
        Pudelko p1 = new Pudelko(4);
        Pudelko p2 = new Pudelko(5);
        Pudelko sklejone = new Pudelko();

        sklejone = p1.sklej(p2);
    }
}

class NiesklejalnePudelka extends Exception {
}

class Pudelko {
    protected int sciana;

    public Pudelko() {
    }

    public Pudelko(int sciana) {
        this.sciana = sciana;
    }

    public void wymiary() {
        System.out.println("Ściana: " + sciana);
    }

    public Pudelko sklej(Pudelko p) throws NiesklejalnePudelka {
        if (sciana == p.sciana) {
            Pudelko nowePudelko = new Pudelko(sciana);
            return nowePudelko;
        } else throw new NiesklejalnePudelka();
    }
}