package SelfStudy.InheritancePractise.CryptoTask;

public class MyWallet {
    public static void main(String[] args) {

        Bitcoin BTC = new Bitcoin(46251.36, 5, 1, 12.4, false);
        System.out.println(BTC);

        BTC.totalPrice();
        System.out.println(BTC.getPrice());
        System.out.println(BTC.getVolume());

        System.out.println();

        Ethereum ETH = new Ethereum(2124.58, 10, 2, 18.9, true);
        System.out.println(ETH);

        ETH.totalPrice();
        System.out.println(ETH.getMarketCap());
        System.out.println(ETH.getQuantity());

        System.out.println();

        Cardano cardano = new Cardano(24.17, 100, 29, 58.1, true);
        System.out.println(cardano);

        cardano.totalPrice();
        System.out.println(cardano.getQuantity());
        System.out.println(cardano.getName());


    }
}
