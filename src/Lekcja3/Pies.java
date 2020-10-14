package Lekcja3;

public class Pies extends Zwierze {

    public void powiedzCosOSobie() {
        System.out.println("Jestem psem z " + nogi + " łapami." + "Koloru " + kolor + ".");
    }

    @Override
    public void wydajDzwiek() {
        System.out.println("Hau hau hau");
    }
}
