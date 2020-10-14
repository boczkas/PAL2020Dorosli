package Lekcja3;

public class Zyrafa extends Zwierze {

    public void powiedzCosOSobie() {
        System.out.println("Jestem zyrafa z " + nogi + " łapami." + "Koloru " + kolor + ".");
    }

    @Override
    public void wydajDzwiek() {
        System.out.println("Ihahahaha");
    }
}
