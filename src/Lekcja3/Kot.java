package Lekcja3;

public class Kot extends Zwierze {

    public void powiedzCosOSobie() {
        System.out.println("Jestem kotem z " + nogi + " łapami." + "Koloru " + kolor + ".");
    }

    @Override
    public void wydajDzwiek() {
        System.out.println("miau miau miau");
    }
}
