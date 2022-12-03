package SelfStudy.InheritancePractise.CryptoTask;

public class MyWallet {
    public static void main(String[] args) {

        Bitcoin BTC = new Bitcoin();
        BTC.setInfo("BTC", 46251.36, 5, 1, 12.4, false);
        System.out.println(BTC);

        BTC.totalPrice();

        System.out.println();

        Ethereum ETH = new Ethereum();
        ETH.setInfo("ETH", 2124.58, 10, 2, 18.9, true);
        System.out.println(ETH);

        ETH.totalPrice();

        System.out.println();

        Cardano cardano = new Cardano();
        cardano.setInfo("CRD", 24.17, 100, 29, 58.1, true);
        System.out.println(cardano);

        cardano.totalPrice();
        cardano.quantity = 50;
        cardano.totalPrice();


    }
}
