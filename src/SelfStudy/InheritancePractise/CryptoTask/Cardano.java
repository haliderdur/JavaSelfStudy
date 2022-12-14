package SelfStudy.InheritancePractise.CryptoTask;

public class Cardano extends CryptoToken {

    public Cardano(double price, int quantity, double marketCap, double volume, boolean isMineable) {
        super("Cardano", price, quantity, marketCap, volume, isMineable);
    }
}
