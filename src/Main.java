public class Main {
    public static void main(String[] args) {
        Konto konto = new Konto(1111);
        konto.einzahlen(5);
        konto.auszahlen(2);
        double value = konto.getSaldo();

        System.out.println(value);
    }
}