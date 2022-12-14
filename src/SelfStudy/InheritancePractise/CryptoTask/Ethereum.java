package SelfStudy.InheritancePractise.CryptoTask;

public class Ethereum extends CryptoToken {

    public Ethereum(double price, int quantity, double marketCap, double volume, boolean isMineable) {
        super("Ethereum", price, quantity, marketCap, volume, isMineable);
    }
}
