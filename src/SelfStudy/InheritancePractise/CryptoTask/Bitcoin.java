package SelfStudy.InheritancePractise.CryptoTask;

public class Bitcoin extends CryptoToken {

    public Bitcoin(double price, int quantity, double marketCap, double volume, boolean isMineable) {
        super("Bitcoin", price, quantity, marketCap, volume, isMineable);
    }


}
